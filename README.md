# [Curso](https://platzi.com/clases/jee/) - Hibernate y Java Spring 2018
## ⚡️Class#1✅
   ```Instalar ambiente de desarrollo en Windows```
## ⚡️Class#2✅
   ```Curso de Hibernate y Java Spring 2018```
## ⚡️Class#3✅
   ```¿Qué es una Aplicación Empresarial?```
## ⚡️Class#4✅
   ```¿Cómo funcionan las Aplicaciones Web?```
## ⚡️Class#5✅
   ```Servidores Web vs Servidores de Aplicación```
## ⚡️Class#6✅
   ```Instalar ambiente de desarrollo Mac```
## ⚡️Class#7✅
   ```Patrón de Arquitectura MVC```
## ⚡️Class#8✅
   ```Características de los Servlet```
   * Los Servlets son componentes o clases de Java del lado del servidor web que permiten procesar peticiones del cliente y responderlas a través de la generación de contenido dinámico o redireccionarlas a otros recursos. 
   * Los Servlets de tipo: => HttpServlet son los más utilizados ya que funcionan con el protocolo HTTP (lo encontramos en el paquete javax.servlet.http) pero, también podemos utilizar los 
   * GenericServlets si necesitamos cualquier otro protocolo (el paquete es javax.servlet).```
## ⚡️Class#9✅
   ```Utilización del Servlet```
## ⚡️Class#10✅
   ```Características y práctica de JSP```
   * Las JSP (JavaServer Page) son componentes del lado del servidor que nos permiten desarrollar páginas web con soporte para contenido dinámico gracias a la inclusión de código Java en código html utilizando los Tags (una sintaxis especial que podemos utilizar en cualquier momento para añadir contenido dinámico: <% for(1=0; i<10: i++) %>). 
   * El desafío de esta clase es crear una página con JSP para visualizar la información de los usuarios que se registran.```
## ⚡️Class#11✅
   ```Arquitectura de las Aplicaciones Web```
   * Así como la construcción de casas, el proceso de construcción de las aplicaciones consiste en 3 etapas: definición de los todos requerimientos y características (lenguaje de programación, tipo de base de datos, practicas de seguridad a implementar, etc), después, el diseño de los componentes y cómo se van a comunicar entre ellos (para darle una vista previa al usuario de cómo vamos a desarrollar la aplicación) y, por ultimo, el desarrollo de nuestra aplicación en base a las decisiones de las etapas anteriores.```
## ⚡️Class#12✅
   ### Características de Spring Framework:
   * Spring Framework es un framework Open Source creado por Rod Jhonson en 2003, fue creado debido a la necesidad de optimizar nuestro código Java y como una alternativa para solucionar la complejidad de otras tecnologías más pesadas en ese momento (especialmente EJB).```
   ```Características de Spring:```
   * NO esta limitado al lado del servidor
   * Desarrollo basado en POJOS
   * Bajo acoplamiento
   * Programación declarativa
   * Reducción de código boilerplate
   * Arquitectura en capas
## ⚡️Class#13✅
   ```Características de Spring Boot:```
   * Spring Boot es una tecnología que permite optimizar los tiempos de desarrollo en la creación y despliegue de proyectos permitiéndonos a los desarrolladores enfocarnos en el desarrollo de la aplicación. Entre las características que tiene Spring Boot se puede mencionar las siguientes:```

   ```Aplicaciones Standalone:```
   * Una aplicación en Spring Boot es empaquetada en un JAR con todas las dependencias para poder ejecutarsesin          necesidad de instalar un servidor web. Permitiendo funcionar como una aplicaciónstandalone.

   ```Servidores Embebidos:```
   * Spring Boot soporta a Tomcat y Jetty como servidores embebidos.

   ```Configuración Simple:```
   * Spring Boot soporta cada una de las características de los mòdulos de Spring como son Spring MVC,SpringData, Spring Rest, Spring Security y lo hace de una manera simple, a través dedependenciassimples una sola por cada tecnologìa.Adicionalmente la forma de construirla y configurarla essimple y óptima de manera online a través         de la herramienta Spring Initializr.
   
   ```Características de Producción Listas:```
   * Spring Boot viene con características de configuración predefinidas para ambientes de producciónAdicionalmente        se puede configurar características de acuerdo a la ambiente a través deSpringProfiles.
## ⚡️Class#14✅
   ```Crear, cargar y configurar una aplicación en Spring Boot:```
   * Spring Boot es una infraestructura que nos proporciona un conjunto de herramientas para construir y desplegar aplicaciones muy rápidamente. En nuestro caso, vamos a utilizar Spring Data JPA para manejar la persistencia y Spring Rest para crear una API que podemos utilizar para interactuar desde la capa de vista. Los requerimientos para construir el proyecto de la clase (una aplicación de reservas para hoteles) son el JDK, Maven y un IDE.
## ⚡️Class#15✅
   _Crear la estructura del proyecto_
      ```Seguimos trabajando con el patrón de diseño MVP (la capa de modelo para trabajar con la base de datos, la capa de negocio para toda la lógica de la aplicación y la capa de vista para el frontend o capa interactiva con el usuario).

      La estructura de nuestra aplicación parte de un paquete base llamado com.platzi.ereservation que hemos creado gracias a la herramienta de construcción y lo hemos cargado al Spring Tool Suite. Ahora, vamos configurar los paquetes para las capas de modelo, negocio y vista. Recuerda que puedes utilizar la sección de Package Explorer, seleccionar nuestro paquete base, utilizar el atajo Ctrl + N, seleccionar la opción Package y automáticamente vamos a generar el nombre del paquete que podemos modificar según nuestras necesidades (en nuestro caso, los paquetes son com.platzi.ereservation.modelo, com.platzi.ereservation.repository, com.platzi.ereservation.resources, com.platzi.ereservation.services).

      El desafío de esta clase es crear un proyecto con Spring Boot, cargarlo en el IDE de desarrollo de Spring Tool Suite y adjuntar una captura de pantalla en la sección de comentarios. No olvides que, si todo te fue bien, puedes ayudar a nuestros compañeros con problemas para solucionar el reto.```
## ⚡️Class#16✅
   ```Persistencia de Objetos:```
   *  La información es nuestro bien más preciado e importante, ya que en base a esta gira el desarrollo de nuestro negocio, se toman decisiones y automatizamos procesos. En el mundo del desarrollo de software, cualquier aplicación o plataforma – independientemente de la tecnología – necesita almacenar su información. Y esta debe poder ser recuperada en cualquier momento. A este proceso de almacenar información y poder recuperarla en cualquier momento – de forma íntegra e independientemente el medio de almacenamiento – lo conocemos con el nombre de persistencia.
   * Existen varios mecanismos de persistencia: archivos planos, archivos binarios, base de datos relacionales, base de datos documentales, entre otros.
   * A nivel de especificaciones o tecnologías utilizadas en Java para poder persistir información, tenemos las siguientes herramientas:
   
   ```JDBC, JPA y ORM```
      * JDBC es un estándar para enviar solicitudes a la base de datos y obtener información, un conjunto de clases que gestionan la información de la base de datos de forma natural (utilizando sentencias DML y DDL).
      * JPA es la propuesta estándar de Java sobre cómo convertir los objetos de Java en instrucciones para el manejador de la base de datos. Es por esto que existen muchas herramientas que implementan JPA para ayudarnos a manejar l capa de          persistencia de nuestras aplicaciones: los ORMs.
      * Existen diferentes ORMs como Hibernate, EclipseLink, ToplLink o Datanucleos. Una de las principales características por la que muchas aplicaciones las utilizan es que pueden mapear un modelo relacional a un modelo de objetos, l que nos          permite persistir la información y gestionar nuestros datos como si fueran objetos. Dicho en otras palabras:
      Los ORMs nos permiten trabajar con bases de datos relacionales usando programación orientada a objetos. JPA es la propuesta estándar de Java que deben implementar los ORMs para interactuar con la base de datos por medio d objetos. Y          todos estos ORMs utilizan JDBC para leer y escribir en la base de datos.```
## ⚡️Class#17✅
   _Spring Data, Spring Data JPA_
## ⚡️Class#18✅
   _Iniciar la base de datos postgres utilizando Docker_
      ```Vamos a ejecutar los siguientes comandos para instalar la base de datos (en cualquier sistema operativo) utilizando Docker y OmniDB:```
## ⚡️Class#19✅
   _Optimizar Pojos con Lombok_
      ```Los POJOs (Plain Old Java Objects) son clases simples de Java que no dependen de un framework en especial y Lombok es una librería que nos permite eliminar código repetitivo (Getters y Setters) que todavía estamos obligados a escribir cuando trabajamos con Java.```
   _Install lombok in sts:_
      ```1. Edit into last line of the file SpringToolSuite4.ini:
         -javaagent:C:\Program Files\sts-4.11.0.RELEASE\lombok.jar```
## ⚡️Class#20✅
   _Mapear Tablas de la Base de Datos_
      ```El proceso de mapear las tablas de la base de datos a clases en nuestra capa de modelo se conoce como ORM (Object Relational Mapping), vamos a convertir las columnas de las tablas en atributos de las clases y las relaciones entre tablas pasan a ser atributos de tipo objeto o lista de objetos.

      Antes de comenzar debemos configurar las dependencias para la base de datos que vamos a utilizar y el manejo/soporte del administrador de capas de persistencia (JPA) en el archivo pom.xml.```
## ⚡️Class#21✅
   _Configurar la persistencia con Hibernate_
      ```Ahora que mapeamos las tablas de nuestra base de datos a clases en nuestra capa de modelo (con los archivos Cliente.java y Reserva.java), vamos a crear el archivo src/main/resources/application.yaml y configurar la información para conectarnos a la base de datos.```
## ⚡️Class#22✅
   _Añadir JPA Repository_
## ⚡️Class#23✅
   _Implementar las operaciones de Consulta con JPA Repository_
      ```Spring Data cuenta con soporte para realizar consultas personalizadas basado en los atributos de la clase base que se generan de forma automática en el tiempo de ejecución (Query Generation Strategy). También soporta otro tipo de consultas basadas en JPQL (Java Persistence Query Language) como @Query y @NamedQuery.```
## ⚡️Class#24✅
   _Implementar servicio de negocio para las operaciones CRUD_
      ```Seguimos trabajando en la parte de negocio, ahora que definimos nuestro repositorio, el siguiente paso la parte de servicios (con el paquete com.platzi.ereservation.negocio.service), vamos a trabajar algunas clases para exponer estas operaciones en la capa de negocio. Recuerda que debemos indicar que las clases son un bean de la capa de negocios utilizando la anotación @Service.```
## ⚡️Class#25✅
   _Manejar la transaccionalidad de un servicio de negocio_
      ```Las transacciones son el conjunto de operaciones que afectan la base de datos (updates o deletes, no se recomienda realizar consultas de solo lectura) y se ejecutan en bloque, es decir, se ejecutan todas con éxito (commit) o no ejecutamos ninguna (rollback). Las transacciones empiezan y terminan a nivel de servicio y nunca a nivel de capa de datos, para indicar que una clase o método será transaccional utilizamos a anotación @Transactional.
         El desafío de esta clase es completar los servicios de negocio para las tablas restantes.```
## ⚡️Class#26✅
   _Instalar y configurar Swagger_
      ```Swagger es una herramienta que nos permite documentar y ejecutar APIs Web de forma interactiva, provee una manera muy sencilla de implementar clientes un múltiples lenguajes. Para configurar esta herramienta junto con Spring, vamos a utilizar el proyecto Spring Fox configurando las dependencias en el archivo pom.xml.```
## ⚡️Class#27✅
   _Características de los Servicios Web y Spring Rest_
      ```Los servicios web son aplicaciones construidas con el fin de poder intercambiar información con otras aplicaciones utilizando protocolos estandarizados como SOAP y REST (utilizando los formatos XML y JSON, respectivamente) sin que los usuarios se enteren de que están navegando entre aplicaciones o servicios diferentes. Este concepto lo conocemos como interoperabilidad.
      Por otra parte, Spring Rest es una manera de construir servicios web con Spring utilizando la arquitectura REST y aprovechando la experiencia de Spring MVC. Para configurar los servicios web utilizamos la anotación @RestCotroller en la clase base, la cual combina los comportamientos de las anotaciones @Controller y @ResponseBody.```
## ⚡️Class#28✅
   _Implementar las operaciones REST para crear y actualizar información_
## ⚡️Class#29✅
   _Implementar las operaciones REST para eliminar y consultar información_
## ⚡️Class#30✅
   _Documentación de los servicios REST con Swagger_
## 🚧Bash🚨
   ```Run spring:```
   * mvn clean install spring-boot:run
   ```Download postgres:9.6.6-alpine:```
   * docker pull postgres:9.6.6-alpine
   ```Up postgres:9.6.6-alpine```
   * docker run -d --name postgres -p 5432:5432 -e POSTGRES_PASSWORD=platzi postgres:9.6.6-alpine
## 🚧Links🚨
   * [Added Springfox Swagger-UI and it's not working, what am I missing](https://stackoverflow.com/questions/46151540/added-springfox-swagger-ui-and-its-not-working-what-am-i-missing/64995810#64995810) - StackOverflow 
   * [Lombok](https://projectlombok.org/download) - Download Project Lombok
   * [mavenrepo](https://projectlombok.org/mavenrepo/) - Mavenrepo Project Lombok
   * [Spring Initializr](https://start.spring.io/)- Spring Boot
   * [platziWeb](http://127.0.0.1:9090/platziweb/login.jsp) - Login Platzi Web
   * [Api-platziWeb](http://127.0.0.1:9090/platziweb/ServletLogin?usuario=platzi&empresa=platzi&empresa=qwerty) - Login API Platzi Web
   * [Swagger](http://127.0.0.1:8080/platziweb/swagger-ui.html) - Swagger Api
   * [OmniDB](https://omnidb.org/) - OmniDB