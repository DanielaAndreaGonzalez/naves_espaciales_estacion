# naves_espaciales_estacion
EXPLICACION PROYECTO ENLACE VIDEO YOUTUBE: https://youtu.be/6MBxOb-W7qo
https://proyecto-nave.web.app/


Proyecto en Framework Spring Boot, el cual tiene como objetivo el uso de conceptos claves de la programación orientada a objetos . A través del cual se presentan tres(3) tipos de naves espaciales permitiendo crearlas y clasificarlas .  

Project in the Spring Boot Framework, which aims to use key concepts of object-oriented programming. Through which three (3) types of spaceships are presented, allowing them to be created and classified.

<img src="https://publicdomainvectors.org/photos/Rocket11.png" width="100" alt="accessibility text">

****************************************************************************************************************************************************
# Objetivos

* Aplicar conceptos de programación orientada a objetos
* Implementar persistencia de datos
* Implementar framework como soporte para el backend 
*****************************************************************************************************************************************************
# Implementación

# Tecnologías
******************************************************************************************************************************************************
*Lista de tecnologías implementadas dentro del proyecto*

 *Framework Backend*
El proyecto se desarrolló en Spring framework (> https://es.wikipedia.org/wiki/Spring_Framework) versión 2.7.1 descargar Spring tool suite 4: https://spring.io/tools

 *Lenguaje de programación*
El proyecto se desarrolló en lenguaje de java (> https://www.java.com/es/download/help/whatis_java.html)  version 11.0.15

*Bases de datos*
Para la persistencia de datos se utilizó MySQL Workbench versión 8.0

*Peticiones web*

Para el correcto funcionamiento se utilizó la herramienta POSTMAN (> https://openwebinars.net/blog/que-es-postman/ ) para las peticiones get y post del proyecto. Version: 9.24
****************************************************************************************************************************************************
# Instalación

1. Descargar las herramientas mencionadas en el punto anterior
2. Proceder a instalar cada una de ellas
3. Clonar o descargar el proyecto desde la rama 'daniela'
4. Importar el proyecto desde spring tools o editor de preferencia
5. Importar la base de datos adjuntada (carpeta Base de datos Mysql) 
6. Probar las consultas en localhost o POSTMAN

****************************************************************************************************************************************************
# Funcionalidad

*Crear* 

El proyecto crea tres tipos de naves diferentes con la siguiente petición

* Crea una nave tipo vehiculo lanzadera: http://localhost:8081/naves/guardarVehiculoLanzadera 
* Crea una nave tipo vehiculo lanzadera: http://localhost:8081/naves/guardarNaveNoTripulada 
* Crea una nave tipo vehiculo lanzadera: http://localhost:8081/naves/guardarNaveTripulada

*Listar*

El proyecto lista las naves que esten guardadas en cada uno de los tres tipo de naves

* lista las naves de tipo vehiculo lanzadera: http://localhost:8081/naves/listarVehiculoLanzadera 
* lista las naves de tipo nave espacial no tripuladad: http://localhost:8081/naves/listarNaveNoTripulada 
* lista las naves de tipo nave espacial : http://localhost:8081/naves/listarNaveTripulada 

*********************************************************************************************************************************************
****************************************************************************************************************************************************
# Goals

* Apply object-oriented programming concepts
* Implement data persistence
* Implement framework as support for the backend
***************************************************************************************************************************************************

# Implementation

# Technologies
***************************************************************************************************************************************************
List of technologies implemented within the project*

 *Backend Framework*
The project was developed in Spring framework (> https://es.wikipedia.org/wiki/Spring_Framework) version 2.7.1 download Spring tool suite 4: https://spring.io/tools

 *Programming language*
The project was developed in java language (> https://www.java.com/es/download/help/whatis_java.html) version 11.0.15

*Databases*
For data persistence, MySQL Workbench version 8.0 was used.

*Web requests*

For the correct operation, the POSTMAN tool (> https://openwebinars.net/blog/que-es-postman/ ) was used for the get and post requests of the project. Version: 9.24

***************************************************************************************************************************************************

# Installation

1. Download the tools mentioned in the previous point
2. Proceed to install each of them
3. Clone or download the project from the 'daniela' branch
4. Import the project from spring tools or preferred editor
5. Import the attached database (Mysql Database folder)
6. Test queries on localhost or POSTMAN

****************************************************************************************************************************************************
# Functionality

Create*

The project creates three different types of ships with the following request

* Create a ship type shuttle vehicle: http://localhost:8081/naves/guardarVehiculoLanzadera
* Create a shuttle type ship: http://localhost:8081/ships/guardarNaveNoTripulada
* Create a shuttle type ship: http://localhost:8081/ships/guardarNaveTripulada

*To list*

The project lists the ships that are stored in each of the three ship types.

* list of shuttle vehicle type ships: http://localhost:8081/naves/listarVehiculoLanzadera
* list of unmanned spaceship type ships: http://localhost:8081/naves/listarNaveNoTripulada
* list of spaceship type ships: http://localhost:8081/naves/listarNaveTripulada

*******************************************************************************************************************************************************


