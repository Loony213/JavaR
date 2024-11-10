# Usar una imagen base de OpenJDK con herramientas de desarrollo
FROM openjdk:11-jdk-slim

# Establecer el directorio de trabajo
WORKDIR /app

# Copiar el archivo HelloWorld.java al contenedor
COPY HelloWorld.java /app/

# Compilar el archivo Java
RUN javac HelloWorld.java

# Comando para ejecutar el programa Java
CMD ["java", "HelloWorld"]
