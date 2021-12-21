Exercício

1. Declare de forma legível variáveis que representam seus dados pessoais como: nome, cpf, idade, altura, doador orgao, email, telefone e data de nascimento.

2. Informe os valores de cada variável considerando o tipo com dados reais ou fictícios.

   

### Exercício resolvido

No grupo 2 utilizamos “construtores” ou constructors do Eclipe e Intellij para agilizar a criação de um objeto na classe aluno com os dados requeridos no exercício.

Ver como referência: DEVMEDIA. Construtores em Java: primeiros passos. Disponível em: https://www.devmedia.com.br/construtores-em-java-primeiros-passos/28618. Acesso em: 20 dez. 2021.

UNICAMP. Construtores. Disponível em: https://www.dca.fee.unicamp.br/cursos/PooJava/metodos/construtor.html. Acesso em: 20 dez. 2021.

**Dentro do Eclipse:** clicar com o botão direito sobre a classe no Package Explorer > Source > Generate Constructor Using Fields (utilizamos o “...Using Fields” porque já tínhamos as variáveis desejadas)

![](C:\estudos\curso-MJVSchool-JAVA-TCPL\17-12-2021-TCPL\EclipseUm.png)



Assim, a janela de Contructor se abre e podemos selecionar os campos (variáveis) para sinalizar as que serão selecionadas. No primeiro campo é possível selecionar o super construtor a ser invocado (geralmente aparece como “Object()”), pode-se incluir um insertion point (após uma das variáveis ou “first member”, “last member”) **vamos deixar como last member** e o modificador de acesso (public, protected, package ou private) vamos deixar como **public**.

O grupo segui com o access modifier de public e vamos escrever **private na frente das variáveis à mão mesmo, como comentado da aula (rever no vídeo da aula 4, parte 1)** vide o design patter Singleton que garante a existência de apenas uma instancia de uma classe, mantendo um ponto global de acesso ao seu objeto.

![](C:\estudos\curso-MJVSchool-JAVA-TCPL\17-12-2021-TCPL\EclipseDois.png)

Agora foi:

![](C:\estudos\curso-MJVSchool-JAVA-TCPL\17-12-2021-TCPL\EclipseTres.png)

Ver como referência: WIKIPEDIA. Singleton. Disponível em: https://pt.wikipedia.org/wiki/Singleton#Em_Java. Acesso em: 20 dez. 2021.

DEVMEDIA. Construtores em Java: primeiros passos. Disponível em: https://www.devmedia.com.br/construtores-em-java-primeiros-passos/28618. Acesso em: 20 dez. 2021.

Podemos tirar o “super()” de acordo com o comentário da Patricia.

O segundo passo foi utilizar o construtor de Getters & Setters para que eles pegassem o valor contido em uma determinada variável e setasse um valor em uma determinada variável.

Ver referência: VIVA O LINUX. Entendendo os getters e setters em Java. Disponívl em: https://www.vivaolinux.com.br/dica/Entendendo-os-getters-e-setters-em-Java. Acesso em: 20 dez. 2021.

Depois demos um “Generate to String” no Source para podermos para podermos visualizar no system.out, o objeto Aluno

![](C:\estudos\curso-MJVSchool-JAVA-TCPL\17-12-2021-TCPL\EclipseQuatro.png)

Mantivemos só o “Fields” e como após o ultimo item:

![](C:\estudos\curso-MJVSchool-JAVA-TCPL\17-12-2021-TCPL\Eclipsecinco.png)



