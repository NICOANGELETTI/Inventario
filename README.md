# Inventario App  <a href="https://www.java.com" target="_blank" rel="noreferrer"> <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" alt="java" width="50" height="50"/> </a> <a href="https://www.mysql.com/" target="_blank" rel="noreferrer"> <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/mysql/mysql-original-wordmark.svg" alt="mysql" width="50" height="50"/> </a> 

<p>Este proyecto consiste en una aplicación para gestionar el inventario de productos de un negocio, permitiendo realizar operaciones de creación, edición, eliminación y visualización de información de los productos. Además, muestra un contador del saldo total de todos los productos y del número total de productos registrados.</p>

### Funcionalidades Principales:

- Crear, Leer, Actualizar y Eliminar (CRUD) registros de productos en el inventario.
- Mostrar el saldo total de todos los productos en inventario.
- Contar el número total de productos registrados en inventario.

### Tecnologías Utilizadas

![Java](https://img.shields.io/badge/-Java-007396?style=flat&logo=java)
![MySQL](https://img.shields.io/badge/-MySQL-4479A1?style=flat&logo=mysql&logoColor=white)
![Servlets](https://img.shields.io/badge/-Servlets-007396?style=flat&logo=java)
![Apache Commons DBCP](https://img.shields.io/badge/-Apache%20Commons%20DBCP-EC7A3E?style=flat&logo=apache)
![JDBC](https://img.shields.io/badge/-JDBC-007396?style=flat&logo=java)

### Backend:

El backend de la aplicación se desarrolló principalmente con Java y Servlets para manejar las solicitudes HTTP y generar respuestas dinámicas. La interacción con la base de datos MySQL se gestionó mediante JDBC para realizar operaciones CRUD en la tabla de productos del inventario. Además, se utilizó Apache Commons DBCP para la gestión de conexiones a la base de datos mediante el patrón de Pool de Conexiones.

### Uso

Asegúrate de tener instalados los siguientes componentes:
- Java 8
- Maven
- Servidor de base de datos MySQL
- Entorno de desarrollo compatible con Java (por ejemplo, NetBeans, Eclipse, IntelliJ IDEA)

### Guía de Instalación y Ejecución

1. **Clonar el Repositorio:**
   - Clona este repositorio en tu máquina local utilizando Git.

2. **Configurar la Base de Datos:**
   - Crea una base de datos MySQL llamada "inventario".

3. **Configurar la Conexión a la Base de Datos:**
   - Abre el archivo `Conexion.java` en el paquete `datos`.
   - Modifica las constantes `JDBC_URL`, `JDBC_USER` y `JDBC_PASSWORD` según la configuración de tu servidor MySQL.

4. **Compilar el Proyecto:**
   - Utiliza Maven para compilar el proyecto y generar el archivo WAR.

5. **Desplegar en el Servidor de Aplicaciones:**
   - Despliega el archivo WAR generado en tu servidor de aplicaciones compatible con Java EE (por ejemplo, Apache Tomcat).

6. **Acceder a la Aplicación:**
   - Una vez desplegada la aplicación en tu servidor, accede a ella a través del navegador web utilizando la URL correspondiente.

Con estos pasos, deberías ser capaz de descargar, configurar, compilar y ejecutar la aplicación de inventario en tu entorno de desarrollo local.
¡Espero que esto te ayude a comenzar con tu proyecto! Si necesitas más ayuda o tienes alguna pregunta, ¡no dudes en preguntar!
