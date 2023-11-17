# Usa a imagem base do OpenJDK com a versão desejada (por exemplo, 11)
FROM azul/zulu-openjdk-alpine:17

# Define o diretório de trabalho dentro do contêiner
WORKDIR /app

# Copia o arquivo build/libs/my-application.jar para o contêiner
COPY build/libs/vehicle-service-0.0.1-SNAPSHOT.jar application.jar

ENV SPRING_PROFILES_ACTIVE=eureka

# Expõe a porta que o aplicativo Spring Boot está escutando (normalmente 8080)
EXPOSE 8080

# Comando para executar o aplicativo Spring Boot quando o contêiner iniciar
CMD ["java", "-jar", "application.jar"]