# Lab-3_Grupo-7_TBD-BDA
Este repositorio contiene todos los archivos relacionados con el laboratorio 3 del ramo de Taller de base de datos o base de datos avanzada.

## Acerca del proyecto

### Colaboradores
* [Sergio Espinoza](https://github.com/Ch3chS)
* [Gonzalo Ibáñez](https://github.com/Gr3yW0lfChie)
* [Cristóbal Olivares](https://github.com/ToTozudo)

### Descripción
El proyecto consiste en desarrollar un sistema para la gestión del voluntariado espontáneo con Api Restful cuya interfaz sea realizada en Vue.js y Backend en Spring Boot y, a diferencia de la vez anterior, se hará uso de MongoDB para 
la base de datos.<br>

### Tareas a realizar
- [x] Entender el problema
- [x] Investigar tecnologías a usar
- [x] Dividir el trabajo
- [x] Realizar el diseño 
  - [x] Diseñar base de datos
  - [x] Diseñar Back-end
  - [x] Diseñar Front-End
- [x] Realizar construcción de base de datos, Back-End y Front-end
- [x] Realizar ppt para la presentación
- [x] Preparar entrega
- [x] Pulir README.md
- [x] Entregar y presentar

### Organización carpetas
Lab-3_Grupo-7_TBD-BDA (Carpeta contenedora) ->
- [Backend](Backend) (Carpeta de Codigo funte con Controladores, lógica de negocios, modelos, y conexiones a BD)
- [Database](Database) (Carpeta con los archivos de creacion y poblado de la BD. junto con sentencias de Prueba)
- [frontend](frontend) (Carpeta con las vistas, componente, html, css, y js necesarios para UX)


## Instalación

### Requisitos y herramientas de desarrollo
Para ejecutar correctamente todo el proyecto, además de los archivos del repositorio se requieren las siguientes tecnologías:

* [MongoDB 7.0.4](https://www.mongodb.com/try/download/community) versión 12 o superior.
* [Visual studio code](https://code.visualstudio.com/download) deberia funcionar con cualquier versión, con la extensión de Spring Boot Tools.
* [Nuxt + VUE](https://nuxtjs.org) versión 2.

### Instrucciones de ejecución
- Inicializar aplicación:
Dirigirse a directorio de aplicación back-end desde terminal
$ cd ./Lab-3_Grupo-7_TBD-BDA/Backend

Ejecutar el proyecto, cuyo acceso será: http://localhost:8080
$ ./gradlew bootRun


- Inicializar pagina de acceso:
 Dirigirse a directorio de aplicación front-end desde terminal
$ cd ./Lab-3_Grupo-7_TBD-BDA/frontend

### Instalar dependencias necesarias para la ejecución
$ yarn install

Ejecutar el proyecto, cuyo acceso será: http://localhost:3000
$ yarn dev
$ yarn build

- Ingresar a <a href="http://localhost:3000/">http://localhost:3000/</a>
