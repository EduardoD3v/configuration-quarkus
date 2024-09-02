## validador-despesas

Este projeto utiliza o Quarkus, o Framework Java Supersônico e Subatômico.

Se você quiser saber mais sobre o Quarkus, visite seu site: https://quarkus.io/.

# Executando a aplicação em modo de desenvolvimento
Você pode executar sua aplicação em modo de desenvolvimento, o que permite codificação ao vivo, usando:

shell
Copy code
./mvnw compile quarkus:dev
NOTA: O Quarkus agora vem com uma Dev UI, que está disponível apenas no modo de desenvolvimento em http://localhost:8080/q/dev/.

# Empacotando e executando a aplicação
A aplicação pode ser empacotada usando:

shell
Copy code
./mvnw package
Isso produz o arquivo quarkus-run.jar no diretório target/quarkus-app/. Esteja ciente de que não é um über-jar, pois as dependências são copiadas para o diretório target/quarkus-app/lib/.

A aplicação agora pode ser executada usando java -jar target/quarkus-app/quarkus-run.jar.

Se você quiser criar um über-jar, execute o seguinte comando:

shell
Copy code
./mvnw package -Dquarkus.package.jar.type=uber-jar
A aplicação, empacotada como um über-jar, agora pode ser executada usando java -jar target/*-runner.jar.

# Criando um executável nativo
Você pode criar um executável nativo usando:

shell
Copy code
./mvnw package -Dnative
Ou, se você não tiver o GraalVM instalado, pode rodar a criação do executável nativo em um container usando:

shell
Copy code
./mvnw package -Dnative -Dquarkus.native.container-build=true
Você pode então executar seu executável nativo com: ./target/validador-despesas-1.0.0-SNAPSHOT-runner

Se você quiser saber mais sobre como criar executáveis nativos, consulte https://quarkus.io/guides/maven-tooling.

