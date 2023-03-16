# buque
Ejercicio planteado: Se desea una aplicación que permita gestionar las actividades que puede realizar un barco carguero
(buque de carga). Básicamente, este tipo de embarcaciones se encargan de transportar contenedores (que contienen
diferentes tipos de artículos) entre diferentes ciudades.
Todo buque carguero cuenta con un área de plataforma en la cual se ubican los contenedores a ser transportados, un límite
de carga (que indica el máximo peso permitido), un estado, que puede ser “Zarpado” para indicar que se encuentra
navegando, o “Arribado” para indicar que se encuentra en muelle o puerto, fecha de arribo, fecha zarpado, y siempre permite
conocer el número de contenedores cargados, y la valoración total de su carga.
De cada contenedor se puede conocer el área que ocupa, su peso y su valor.
Para la construcción del programa se requiere modelar la clase Contenedor con atributos para el área, peso, valor y
métodos habituales. 

Así mismo, se requiere modelar la clase Buque o Barco, y se le solicita para ello:
1. Identificar atributos requeridos para modelar la clase
2. Incluir método constructor por defecto
3. Incluir método constructor sobrecargado con valores para el área de plataforma y limite peso de un buque.
Nota. Siempre que se crea un buque, su estado inicial es “Arribado”.
4. Incluir métodos getter y setter para los atributos
5. Incluir un método cargarContenedor (área, peso, valor), este método simulara la carga de un contenedor al buque. Se
debe tener en cuenta que solo es posible cargar contenedores a un buque si este se encuentra en “Arribado”. Este
método, deberá retornar un String con el resultado de la operación, es decir, si fue exitosa o si no, si este es el caso,
debe indicar la causa (se superó el área del buque, el limite de peso, o está navegando el buque).
6. Incluir método areaDisponible (), este método permitirá conocer el área que actualmente tiene disponible un buque para
alojar contenedores. Recuerde que cada vez que se carga un contenedor en un buque, disminuye su área disponible
para nuevos contenedores.
7. Incluir método pesoPermitido (), este método permitirá conocer el peso que actualmente permite un buque para alojar
contenedores. Recuerde que cada vez que se carga un contenedor en un buque, disminuye el peso permitido para
nuevos contenedores.
8. Incluir método valorCarga (), este método debe retornar el valor total del buque por concepto de todos los contenedores
que han sido cargados.
9. Incluir método contenedoresCargados (), permitirá conocer el numero de contenedores que han sido cargados al buque.
10. Incluir método duracionViaje (): deberá retornar el número de días que tardará el buque en realizar su viaje.
11. Crear la clase.
12. Sobrecargar el método cargarContenedor, para que desarrolle la misma funcionalidad, pero recibiendo como parámetro
un objeto de tipo contenedor.
13. Crear los diagramas de clases correspondientes


Para probar la aplicación, se solicita crear una clase principal y en ella:

1 . Crear un buque
2. Cargar dos o tres contenedores, utilice los dos métodos (analizar resultado)
3. Imprimir área y peso disponible del buque (analizar resultado)
4. Cambiar estado a “Zarpado”
5. Cargar un nuevo contenedor (ver resultado)
6. Imprimir duración del viaje, contenedores transportados y valoración de la carga (analizar resultado)
