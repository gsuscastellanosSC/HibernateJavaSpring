# Clases del Curso de Hibernate y Java Spring 2018
   https://platzi.com/clases/jee/
# Class#1
   Instalar ambiente de desarrollo en Windows
# Class#2
   Curso de Hibernate y Java Spring 2018
# Class#3
   ¿Qué es una Aplicación Empresarial?
# Class#4
   ¿Cómo funcionan las Aplicaciones Web?
# Class#5
   Servidores Web vs Servidores de Aplicación
# Class#6
   Instalar ambiente de desarrollo Mac
# Class#7
   Patrón de Arquitectura MVC
# Class#8
   Características de los Servlet
      Los Servlets son componentes o clases de Java del lado del servidor web que permiten procesar peticiones del cliente y responderlas a través de la generación de contenido dinámico o redireccionarlas a otros recursos. Los Servlets de tipo:
         => HttpServlet son los más utilizados ya que funcionan con el protocolo HTTP (lo encontramos en el paquete javax.servlet.http) pero, también podemos utilizar los
         => GenericServlets si necesitamos cualquier otro protocolo (el paquete es javax.servlet).
# Class#9
   Utilización del Servlet
# Class#10
   Características y práctica de JSP
   Las JSP (JavaServer Page) son componentes del lado del servidor que nos permiten desarrollar páginas web con soporte para contenido dinámico gracias a la inclusión de código Java en código html utilizando los Tags (una sintaxis especial que podemos utilizar en cualquier momento para añadir contenido dinámico: <% for(1=0; i<10: i++) %>).
   El desafío de esta clase es crear una página con JSP para visualizar la información de los usuarios que se registran.
# Class#11
   Arquitectura de las Aplicaciones Web
   Así como la construcción de casas, el proceso de construcción de las aplicaciones consiste en 3 etapas: definición de los todos requerimientos y características (lenguaje de programación, tipo de base de datos, practicas de seguridad a implementar, etc), después, el diseño de los componentes y cómo se van a comunicar entre ellos (para darle una vista previa al usuario de cómo vamos a desarrollar la aplicación) y, por ultimo, el desarrollo de nuestra aplicación en base a las decisiones de las etapas anteriores.
# Class#12
   Características de Spring Framework:
      Spring Framework es un framework Open Source creado por Rod Jhonson en 2003, fue creado debido a la necesidad de optimizar nuestro código Java y como una alternativa para solucionar la complejidad de otras tecnologías más pesadas en ese momento (especialmente EJB).
   Características de Spring:
      NO esta limitado al lado del servidor
      Desarrollo basado en POJOS
      Bajo acoplamiento
      Programación declarativa
      Reducción de código boilerplate
      Arquitectura en capas
# Class#13
   Características de Spring Boot:
      Spring Boot es una tecnología que permite optimizar los tiempos de desarrollo en la creación y despliegue de proyectos permitiéndonos a los desarrolladores enfocarnos en el desarrollo de la aplicación. Entre las características que tiene Spring Boot se puede mencionar las siguientes:

   Aplicaciones Standalone:
      Una aplicación en Spring Boot es empaquetada en un JAR con todas las dependencias para poder ejecutarsesin          necesidad de instalar un servidor web. Permitiendo funcionar como una aplicaciónstandalone.

   Servidores Embebidos:
      Spring Boot soporta a Tomcat y Jetty como servidores embebidos.

   Configuración Simple:
      Spring Boot soporta cada una de las características de los mòdulos de Spring como son Spring MVC,SpringData,          Spring Rest, Spring Security y lo hace de una manera simple, a través dedependenciassimples una sola por cada          tecnologìa. Adicionalmente la forma de construirla y configurarla essimple y óptima de manera online a través         de la herramienta Spring Initializr.

   Características de Producción Listas:
      Spring Boot viene con características de configuración predefinidas para ambientes de producciónAdicionalmente        se puede configurar características de acuerdo a la ambiente a través deSpringProfiles.
# Class#14
      Crear, cargar y configurar una aplicación en Spring Boot:
         Spring Boot es una infraestructura que nos proporciona un conjunto de herramientas para construir y desplegar aplicaciones muy rápidamente. En nuestro caso, vamos a utilizar Spring Data JPA para manejar la persistencia y Spring Rest para crear una API que podemos utilizar para interactuar desde la capa de vista. Los requerimientos para construir el proyecto de la clase (una aplicación de reservas para hoteles) son el JDK, Maven y un IDE.
# Class#15
   Crear la estructura del proyecto
      Seguimos trabajando con el patrón de diseño MVP (la capa de modelo para trabajar con la base de datos, la capa de negocio para toda la lógica de la aplicación y la capa de vista para el frontend o capa interactiva con el usuario).

      La estructura de nuestra aplicación parte de un paquete base llamado com.platzi.ereservation que hemos creado gracias a la herramienta de construcción y lo hemos cargado al Spring Tool Suite. Ahora, vamos configurar los paquetes para las capas de modelo, negocio y vista. Recuerda que puedes utilizar la sección de Package Explorer, seleccionar nuestro paquete base, utilizar el atajo Ctrl + N, seleccionar la opción Package y automáticamente vamos a generar el nombre del paquete que podemos modificar según nuestras necesidades (en nuestro caso, los paquetes son com.platzi.ereservation.modelo, com.platzi.ereservation.repository, com.platzi.ereservation.resources, com.platzi.ereservation.services).

      El desafío de esta clase es crear un proyecto con Spring Boot, cargarlo en el IDE de desarrollo de Spring Tool Suite y adjuntar una captura de pantalla en la sección de comentarios. No olvides que, si todo te fue bien, puedes ayudar a nuestros compañeros con problemas para solucionar el reto.
# Bash
   Run spring:
      mvn clean install spring-boot:run
# Links
   Spring Initializr:
      https://start.spring.io/
   platziWeb:
      - http://127.0.0.1:9090/platziweb/login.jsp
      - http://127.0.0.1:9090/platziweb/ServletLogin?usuario=platzi&empresa=platzi&empresa=qwerty
   OmniDB:
      https://omnidb.org/