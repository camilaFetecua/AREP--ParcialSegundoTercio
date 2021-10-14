# AREP--ParcialSegundoTercio

Diseñe un prototipo de calculadora de microservicios que tenga un servicios de matemáticas con al menos dos funciones implementadas y desplegadas en al menos dos instancias virtuales de EC2. Además debe implementar un service proxy que recibe las solicitudes de servicios y se las delega a las dos instancias usando un algoritmo de round-robin. Asegúrese que se pueden configurar las direcciones y puertos de las instancias en el porxy usando variables de entorno del sistema operativo. Cada estudiante debe seleccionar para desarrollar dos funciones matemáticas de acuerdo a los dos últimos dígitos de su cédula como se especifica en la lista (Si sus dos últimos dígitos de su cédula son el mismo use el siguiente dígito que sea diferente). Todas las funciones reciben un solo parámetro de tipo "Double" y retornan una parámetro de tipo "Double".

## Bitacora
1. Se crea el proyecto usando Maven, se crea la clase principal.
2. Verificamos el funcionamiento de manera local
3. Conectamos la consola de AWS.
4. Se monta la imagen en Docker
5.Verificamos la creacion le las imagenes 
6. Modificamos el grupo de seguridad
7. Probamos el funcionamiento

## Video

## Autor
Maria Camila Fetecua Garcia
## Licencia
