# PruebaTecnicaSOA
se implementa un servicio web SOAP en Java.  y se implementa un servicio proxy en el Oracle Service Bus (OSB) mediante el cual realiza el consumo del servicio web SOAP 
### Pre Requisitos

- IDE con jdk 1.8 configurado
- OBS, JDeveloper configurados en sus verciones 12.2.1.4.0
-  Base de datos MySQL 8.0.33 configurada en el puerto 3306 user root y password 123456

### Deploy de los recursos necesarios

-  Se debe descargar el repositorio.
- Ejecute los comandos SQL almacenado en PruebaTecnicaSOA\script BD\Script_creacion_bd_table_tecnical_test.sql
- Mediante el IDE seleccionado abrir el proyecto tecnical.test, el cual procederemos a instalar y ejecutar ya sea mediante los comando mvn clean install, mvn compile, spring-boot:run -f pom.xml o mediante las herramientas del IDE
- En la herramienta  JDeveloper se debe abrir la aplicacion TecnicalTestSBAplication, y luego desplegar en el servidor WebLogic
- En la herramienta JDeveloper se debera abrir el archivo TecnicalTestSBProject y se le dara click derecho en el proxy CrudServiceProxySOAP para luego dar click en la opcion run.
- Luego de esto se debara abrir la consola OBS en donde se evidenciaran las dos operaciones creadas en el proyecto java, saveTestData y GetTesData.
- En el apartado Payload se deberan ingresar los datos solicitados mediante el wsdl.
- Se mostrara la respuesta de la operacion realizada.


