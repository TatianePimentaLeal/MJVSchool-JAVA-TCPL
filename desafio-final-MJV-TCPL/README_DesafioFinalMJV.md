# **README - Desafio Final MJV **

#### Dados de autoria #### 

Autora/Author

[Tatiane Pimenta Leal](github.com/TatianePimentaLeal)

[LinkedIn](https://www.linkedin.com/in/tatianecampospimentaleal/) 



#### Orientação do projeto ####

[Gleyson Sampaio](https://github.com/glysns) 



#### Index/Índice ####

- Tecnologias usadas no Back-end
- Tema/background do Front-end
- Descrição do projeto



#### Tecnologias usadas no Back-end ####

- DBeaver para criação do banco de dados;
- SpringBoot para conexão de banco de dados e Spring MVC para desenvolvimento de aplicação web;
- IDE Eclipse para criação do código
- Dependências: Spring Web, MySQL Driver, Spring Data JPA, Thymeleaf
- HTML e CSS



#### Descrição do projeto ####

O desafio proposto foi baseado nas aulas da School de Java da MJV. O projeto final do desafio consistia na criação de uma conexão entre uma página web com template de Front-end fornecido pelo professor com o banco de dados criado via DBeaver via SpringBoot criando a estrutrura informada na figura 1 atrelada à página web.



Fig 1. Diagrama de classes para criação dos atributos do objeto.



Para a criação do arquivo *core* do projeto, utilizado o *Spring Initializr* com as *dependencies* “Spring Web” e “MySQL Driver” (Fig. 2).

Fig 2. Tela da criação do projeto via Spring Initializr



Fig 3. Fluxo Spring MVC

Na criação dos models, me deparei com o erro: “Failed to initialize JPA EntityManagerFactory: component property not found: id”, onde, conforme pesquisa , verifiquei que ocorrera devido a  erro na construção da classe “Telefone”, que inclui como *embeddable* e atribui ID, o que é irregular. Mudei na classe “Telefone” e na classe “Cadastro” (https://stackoverflow.com/questions/39040315/hibernate-embeddables-component-property-not-found).



##### Passos da criação do CRUD com Spring Boot e Thymeleaf #####

- The Maven Dependencies
- The Domain Layer
- The Repository Layer
- The Controller Layer
- The View Layer
- Running the Application



##### Dependências Maven #####

Consistem em colocar as dependências no POM.xml do projeto:

```sql
<parent>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-parent</artifactId>
    <version>2.4.0</version>
</parent>
<dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-thymeleaf</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-jpa</artifactId>
    </dependency>
    <dependency>
        <groupId>com.h2database</groupId>
        <artifactId>h2</artifactId>
    </dependency>
</dependencies>
```

Vamos pecisar da “starter parent”, “starter web”, “starter thymeleaf”, “data jpa” e no esemplo também da h2database. Dá pra pegá-las via Spring Initializr e/ou no Eclipse via  botão direito na pasta do projeto > Spring > Add Starters, mas e melhor com o Spring Initializr.



##### Camada de domínio #####

É onde colocamos o package Model com a modelagem da classe principal:

```java
@Entity
public class Cadastro {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    // standard constructors / setters / getters / toString
}
```

Anotamos a classe com a anotação @Entity (no exemplo ainda acrescentaram o @NotBlank constraint que implica que podemos usar o validador o Hibernate nesses campos antes de perdidtir ou atualizar uma entidade na base de dados.

Dos pontos mais sensíveis e importantes para mitigação dos erros nas classes do Model foram:

Uso de “@AttibuteOverrides” para formatação do endereço:

```java
@AttributeOverrides({
		@AttributeOverride( name = "logradouro", column = @Column(name = "logradouro")),
		@AttributeOverride( name = "numero", column = @Column(name = "numero")),
		@AttributeOverride( name = "bairro", column = @Column(name = "bairro")),
		@AttributeOverride( name = "cidade", column = @Column(name = "cidade"))
```

Uso do “@JsonFormat (pattern=)” para formatação de data na tabela principal.



##### Camada de repositório #####

Neste ponto a aplicação não faz nada, porque só tem o Model. Com o Spring Data JPA podemos implementar repositórios (que antes eram o DAO) com mais praticidade. É aqui que temos aquele alto poder de abstração do JPA, o que nos permite acessar a camada de persistência sem termos que prover aquele monte de informação e implementações do DAO.

Para colocar a aplicação de CRUD básico nos objetos de User (como nosso exemplo de códigos) vamos precisar extend o JpaRepository interface em uma classe Repository no package de mesmo nome:

```java
@Repository
public interface UserRepository extends JpaRepository<User, Long> {}
```

Estendendo a interface JpaRepository, o Spring Data JPA proverá as implementações para os CRUDs do repositório para nós.



##### Camada de controller #####

Usamos uma única classe Controller para lidar com as requisições HTTP GET e o POST e então mapeá-los para chamar nossa implementação UserRepository.

A classe Controller depende de algumas features do Spring MVC. 

```java
@Controller
public class UserController {
    
    @GetMapping("/exemplo")

    // additional CRUD methods
}
```

Também é necessário mapear para a URL /index.



##### Camada Service (opcional em alguns códigos) #####

Criação do CadastroService para a camada de contrato.

```java
package mjv.desafiofinalmjvtcpl.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import mjv.desafiofinalmjvtcpl.model.Cadastro;
import mjv.desafiofinalmjvtcpl.model.Endereco;
import mjv.desafiofinalmjvtcpl.model.Escolaridade;
import mjv.desafiofinalmjvtcpl.repository.CadastroRepository;

@Component
public class CadastroService implements CommandLineRunner {
	
	@Autowired
	private CadastroRepository repository;
	
	@Override
	public void run(String...args) throws Exception {
		Cadastro membro1 = new Cadastro();
		membro1.setNome("JOAO MENEZES");
		membro1.setCpf("334.576.928-07");
		membro1.setDataNascimento(LocalDate.of(1991, 10, 21));
		membro1.setTelefone("(21) 9141-9999");
		membro1.setProfissao("TECH LEAD");
		membro1.setEscolaridade(Escolaridade.SUPERIOR);
		membro1.setEndereco(new Endereco("RUA TREZE", "10", "LARANJEIRAS", "RIO DE JANEIRO"));
		
		repository.save(membro1);
	}
}
```

Através do link acima, verifiquei as principais dúvidas relacionadas a formatação dos dados de LocalDate, ENUM e Embedded que eram itens que estavam ocasionando erros devido ao mal preenchimento



##### A camada de visualização (última) #####

Nesse exemplo, a ultima coisa que é vista é a camada de view, que fica em *src/main/resources/templates* e que vai no HTML e é nela que usamos o Thymeleaf para o parseamento dos dados. Na sessão add-user.html.
Finalmente, temos o arquivo *index.html* que apresenta a lista de entidades persistidas com os links para editar e remover entidades existentes.

E abrindo o [http://localhost:8080](http://localhost:8080/) veremos se funcionou ou não.

JSON

```json
[{"id":2,"nome":"JOAO MENEZES","cpf":"334.576.928-07","dataNascimento":"21-10-1991","telefone":"(21) 9141-9999","profissao":"TECH LEAD","escolaridade":"SUPERIOR","endereco":{"logradouro":"RUA TREZE","numero":"10","bairro":"LARANJEIRAS","cidade":"RIO DE JANEIRO"}}]
```

O http://localhost:8080/ ainda está correto também.



### Referências ###

**Enum**

BAELDUNG. Persistindo dados ENUM em JPA. Disponível em: https://www.baeldung.com/jpa-persisting-enums-in-jpa. Acesso em: 22 jan. 2022. 



**Datalist **

STACKOVERFLOW. Put input inside select. Disponível em: https://stackoverflow.com/questions/35810045/put-input-inside-select. Acesso em: 22 jan. 2022.



**Correção da data para formatação Spring + Thymeleaf**

YOUTUBE. Exemplo de CRUD - Spring Boot + Thymeleaf. Disponível em: https://www.youtube.com/watch?v=Mbjkccg6J1Qps://java-questions.com/spring_enum.html. Acesso em: 26 jan. 2022.