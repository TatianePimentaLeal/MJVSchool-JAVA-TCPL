README Para atividade MJV School de Java da semana - 7 de Janeiro

# Atividade Grupo 5 :notebook:

- Emerson

- [Dominic Lourenço Barbosa](https://github.com/DomBarbosa8)

- [Lucca Bugatti](https://github.com/luccabugatti)

- [Tatiane Pimenta Leal](https://github.com/TatianePimentaLeal)

  

Banco de dados escolhido: MySQL

- O MyQSL necessita do uso do "numeric" ao invés de "decimal" para tratar dados de valores, pois ao usar o segundo, o BD automaticamente arredonda os números de acordo com o que estiver após a vírgula.

  





INSTRUÇÕES PROFESSOR GLEYSON

# Digytal Code - Programação, Pesquisa, Educação

#### Autores

- [Gleyson Sampaio](https://github.com/glysns)

## SQL Single Table

O nosso desafio é criar uma jornada de instruções SQL contemplando comandos DDL + DML + DQL

#### Requisitos

1. Criação da tabela `tab_ficha_profissional` contendo os campos: Id (pk-auto increment), Nome, Email, Telefone, Endereco (Logradouro, Numero, Bairro, Cidade, Estado), Profissão, Salario Minimo Pretendido, Salario Maximo Pretendido, Estrangeiro;
2. Descrever como o banco de dados escolhido trata os tipos de dados em questão;
3. Apresentar todo o conteúdo em um arquivo .sql destacando as observações como comentário no script. (ver padrão de comentários no banco de dados selecionado).

#### Jornada

##### DDL

1. Criar a tabela citada acima contemplando os campos destacados, desconsiderando inicialmente o campo `profissao`;
2. Alterar a tabela para a inclusão do campo `profissao`;
3. Alterar a coluna `email` para que ela possa suportar até 100 caracteres;

##### DML

1. Realizar um insert com 10 registros profissionais;
2. Definir as profissões via `update` nos registros inseridos, considerando a alteração individualmente;
3. Excluir todos os registros que o campo `estrangeiro` for considerado verdadeiro;
4. O cadastro de Id=3 deverá residir no endereco: Logradouro='PRACA DA SE', Numero = 'S/N', Bairro = 'CENTRO', Cidade = 'SAO PAULO', Estado = 'SP';

##### DQL

1. Retornar uma lista contendo os campos: Nome, Email, Profissao e Faixa Salarial ordenado por Profissão, Nome;
2. Retornar uma lista contendo os campos: Nome, Email, Profissao e Faixa Salarial ordenado por Profissão, Salario Máximo do maior para o menor;
3. Retornar uma lista com a seguinte informação concatenada e apelidada de nome_profissao: NOME + ' - ' + PROFISSAO;
4. Retornar uma lista contendo o nome da profissão e a quantidade de registros da profissão.
5. Retornar o registro com menor salário mínimo;
6. Retornar se existir o registro com a seguinte condição: Nome parecido com 'MARCOS PAULO' e Salario Maximo `maior que` 1200 e Salario Maximo `menor ou igual que` 2000 e que o Estado esteja `entre` SP, RJ, SC.

##### Instruções

- Realizem todo o processo em um base de dados, comentando cada etapa de evolução do projeto
- Para a apresentação do projeto, re-executem em um nova base de dados o arquivo script.sql por etapas

###### Referências

1. https://www.devmedia.com.br/sql-max-min-avg-sum-e-count/41218
2. https://docs.oracle.com/cloud/help/pt_BR/reportingcs_use/BILUG/GUID-4EE8C58D-391B-46A9-B0B3-9FA91B8159D1.htm#BILUG664