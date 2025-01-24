# Documentação

Acesse a pasta do projeto `/PontosDeInteressePorGPS`

Em seguida em `/src/main/resources/application.properties` no campo

`spring.datasource.password=`

insira a senha do seu banco de dados

### Caso não queira usar o banco padrão do Postgres

`spring.datasource.url=jdbc:postgresql://localhost:5432/postgres`

insira a conexão correspondente ao seu Banco de Dados. E depois faça o passo anterior.


## Iniciar o projeto

vá para o dirétorio central e build o projeto com comando:
`mvn clean install`

depois inicie utilizando o comando `mvn spring-boot:run`

a aplicação iniciará na rota http://localhost:8080/swagger-ui/index.html.
