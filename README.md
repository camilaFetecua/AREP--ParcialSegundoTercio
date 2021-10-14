# AREP--ParcialSegundoTercio

Diseñe un prototipo de calculadora de microservicios que tenga un servicios de matemáticas con al menos dos funciones implementadas y desplegadas en al menos dos instancias virtuales de EC2. Además debe implementar un service proxy que recibe las solicitudes de servicios y se las delega a las dos instancias usando un algoritmo de round-robin. Asegúrese que se pueden configurar las direcciones y puertos de las instancias en el porxy usando variables de entorno del sistema operativo. Cada estudiante debe seleccionar para desarrollar dos funciones matemáticas de acuerdo a los dos últimos dígitos de su cédula como se especifica en la lista (Si sus dos últimos dígitos de su cédula son el mismo use el siguiente dígito que sea diferente). Todas las funciones reciben un solo parámetro de tipo "Double" y retornan una parámetro de tipo "Double".

## Bitacora
1. Se crea el proyecto usando Maven, se crea la clase principal.
  ![Imagen](https://github.com/camilaFetecua/Arep-AppSecure/blob/master/Imagenes/1.PNG)
2. Verificamos el funcionamiento de manera local 
  ![Imagen](https://github.com/camilaFetecua/Arep-AppSecure/blob/master/Imagenes/1.PNG)
3. Conectamos la consola de AWS.
    ![Imagen](https://github.com/camilaFetecua/Arep-AppSecure/blob/master/Imagenes/1.PNG)
4. Creamos las instancias.
   ![Imagen](https://github.com/camilaFetecua/Arep-AppSecure/blob/master/Imagenes/1.PNG)
   
5. Instalamos Java en las instancias con el comando sudo yum install java-1.8.0-openjdk-devel
6. Modificamos el grupo de seguridad
  ![Imagen](https://github.com/camilaFetecua/Arep-AppSecure/blob/master/Imagenes/1.PNG)
7. Comprimimos el archivo y lo subimos a cada instancia.
  ![Imagen](https://github.com/camilaFetecua/Arep-AppSecure/blob/master/Imagenes/1.PNG)
08. Descompirmimos el archivo
  ![Imagen](https://github.com/camilaFetecua/Arep-AppSecure/blob/master/Imagenes/1.PNG)
09. Ejecutamos el proyecto en cada Instancia
  ![Imagen](https://github.com/camilaFetecua/Arep-AppSecure/blob/master/Imagenes/1.PNG)
10. Probamos el funcionamiento
   ![Imagen](https://github.com/camilaFetecua/Arep-AppSecure/blob/master/Imagenes/1.PNG)

## Video

## Autor
Maria Camila Fetecua Garcia
## Licencia
