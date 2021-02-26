PASOS PARA LEVANTAR EL AMBIENTE DE DESARROLO

Este proyecto contiene :
- cliente-ordencompra(frontend/angular)
- ordencompra(backend/spring)

**Instrucciones para levantar el ambiente de desarrollo backend**

El IDE SPRING TOOL SUITE 4 tiene un servidor Tomcat integrado que nos ayudara a desplegar la aplicacion,
el proyecto creara las tablas necesarias para su funcionamiento en la base de datos postgresql
Una vez levantado el servidor nuestro backend estara disponible en la direccion http://localhost:8080/ejercicio/*
 
NOTA: En primer lugar crear una base de datos en postgresql con el noombre: ejercicio

1.- Descargar en directorio local los proyectos
2.- Abrir el IDE SPRING TOOL SUITE 4 
3.- Importar proyecto Maven existente ordencompra 
4.- Dirigirnos a [path descargado proyecto]/ordencompra/src/main/resources
5.- Editar application.properties, que contiene las conecciones de la base de datos
6.- Iniciar servidor local embebido 

**Instrucciones para levantar el ambiente de desarrollo frontend**

Este proyecto esta realizado con angularCLI 9.1.14 que tiene un servidor para realizar las pruebas del proyecto

NOTA: Tenere instalado previamente angularCLI

1.- Descargar en directorio local los proyectos
2.- Abrir el IDE VISUAL STUDIOS CODE  
3.- Abrir Carpeta de proyecto cliente-ordencompra
4.- Abrir una terminal cmd y escribir: ng serve -o 
    (Este comando levantara un servidor de pruebas en el puerto 4200)