# Abstract Factory

Tambien llamado Fábrica abstracta

es un patrón de diseño creacional que nos permite producir familias de objetos relacionados sin especificar sus clases concretas.

## Problema :disappointed:

Imagina que estás creando un simulador de tienda de muebles. Tu código está compuesto por clases que representan lo siguiente:

Una familia de productos relacionados, digamos: Silla + Sofá.

Algunas variantes de esta familia. Por ejemplo, los productos Silla + Sofá están disponibles en estas variantes: Moderna, Victoriana, ArtDecó.

cada tipo de producto puede estar disponible en Moderna, Victoriana, ArtDecó.

Necesitamos una forma de crear objetos individuales de mobiliario para que combinen con otros objetos de la misma familia ya que no es permitido convinar las diferentes variantes.


## Solución :smiley:

Lo primero que sugiere el patrón Abstract Factory es que declaremos de forma explícita interfaces para cada producto diferente de la familia de productos 
(por ejemplo, silla o sofá). Después podemos hacer que todas las variantes de los productos sigan esas interfaces. Por ejemplo, todas las variantes
de silla pueden implementar la interfaz Silla y de igual manera que las variantes de las mesas pueden implementar la interfaz Mesa.
  
Ahora bien, ¿qué hay de las variantes de los productos? Para cada variante de una familia de productos, creamos una clase de fábrica independiente basada en la
interfaz FábricaAbstracta. Una fábrica es una clase que devuelve productos de un tipo particular. Por ejemplo, la FábricadeSafas sólo puede crear objetos 
de SofaModerna, SofaVictoriana y MesillaArtDeco.

El código cliente tiene que funcionar con fábricas y productos a través de sus respectivas interfaces abstractas. Esto nos permite cambiar el tipo de fábrica que
pasamos al código cliente, así como la variante del producto que recibe el código cliente, sin descomponer el propio código cliente.

## Pros
  
 :heavy_check_mark: Puedes tener la certeza de que los productos que obtienes de una fábrica son compatibles entre sí.
 
 :heavy_check_mark: Evitas un acoplamiento fuerte entre productos concretos y el código cliente.
 
 :heavy_check_mark: Principio de responsabilidad única. Puedes mover el código de creación de productos a un solo lugar, 
  haciendo que el código sea más fácil de mantener.
  
 :heavy_check_mark: Principio de abierto/cerrado. Puedes introducir nuevas variantes de productos sin descomponer el código cliente existente.
 
 ## Contras
 
 :x: Puede ser que el código se complique más de lo que debería, ya que se introducen muchas nuevas interfaces y clases junto al patrón.
 
