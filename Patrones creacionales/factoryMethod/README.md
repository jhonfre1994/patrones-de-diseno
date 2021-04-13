# Singleton

Tambien conocido como Método fábrica, Constructor virtual.

es un patrón de diseño creacional que proporciona una interfaz para crear objetos en una superclase, mientras permite a las subclases alterar el tipo de objetos que se crearán.

## Problema :disappointed:

Imagina que estás creando una aplicación de que dibuja diferntes figuras. La primera versión de tu aplicación sólo es capaz de manejar la figura triangulo.

Al cabo de un tiempo, te ves en la necesidad de agregar muchas mas figuras mas figuras. 

Pero, ¿qué pasa con el código? En este momento, la mayor parte de tu código está acoplado a la clase triangulo. 
Para añadir mas figuras a la aplicación habría que hacer cambios en toda la base del código. Además, si más tarde decides añadir otro tipo de figura a 
la aplicación, probablemente tendrás que volver a hacer todos estos cambios.

## Solución :smiley:

El patrón Factory Method sugiere que, en lugar de llamar al operador new para construir objetos directamente, se invoque a un método fábrica. 
No te preocupes: los objetos se siguen creando a través del operador new, pero se invocan desde el método fábrica. Los objetos devueltos por el método fábrica
son objetos de diferentes figuras.

A simple vista, puede parecer que este cambio no tiene sentido, ya que tan solo hemos cambiado el lugar desde donde invocamos al constructor. Sin embargo, 
piensa en esto: ahora puedes sobrescribir el método fábrica en una subclase y cambiar la clase de las figuras creados por el método.

No obstante, hay una pequeña limitación: las subclases sólo pueden devolver figuras de distintos tipos si dichos productos tienen una clase base o interfaz en común. 
Además, el método fábrica en la clase base debe tener su tipo de retorno declarado como dicha interfaz.


## Pros
  
 :heavy_check_mark: Evitas un acoplamiento fuerte entre el creador y los productos concretos.
 
 :heavy_check_mark: Principio de responsabilidad única. Puedes mover el código de creación de producto a un lugar del programa, haciendo que el código sea más fácil de mantener.
 
 :heavy_check_mark: Principio de abierto/cerrado. Puedes incorporar nuevos tipos de figuras en el programa sin descomponer el código cliente existente.
 
 ## Contras
 
 :x: Puede ser que el código se complique, ya que debes incorporar una multitud de nuevas subclases para implementar el patrón. La situación ideal sería introducir el
 patrón en una jerarquía existente de clases creadoras.
 
 
