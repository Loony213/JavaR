# Usar una imagen base de OpenJDK
FROM openjdk:11-jre-slim

# Establecer el directorio de trabajo
WORKDIR /app

# Copiar el archivo HelloWorld.java al contenedor
COPY HelloWorld.java /app/

# Compilar el archivo Java
RUN javac HelloWorld.java

# Comando para ejecutar el programa Java
CMD ["java", "HelloWorld"]
