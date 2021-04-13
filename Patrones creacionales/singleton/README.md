# Singleton

Tambien conocido como Instancia única.

Es un patrón de diseño creacional que nos permite asegurarnos de que una clase tenga una única instancia, a la vez que proporciona un punto de acceso global a dicha instancia.

## Problema :disappointed:

El patrón Singleton resuelve dos problemas al mismo tiempo, vulnerando el Principio de responsabilidad única:

* Garantizar que una clase tenga una única instancia. ¿Por qué querría alguien controlar cuántas instancias tiene una clase? El motivo más habitual es controlar el acceso a algún 
recurso compartido, por ejemplo, una base de datos o un archivo. De esta manera se evita que cada vez que se solicite el recurso se cree una nueva instancia. 

* Se debe tener en cuenta que este comportamiento es imposible de implementar con un constructor normal, ya que una llamada al constructor siempre debe devolver un nuevo objeto 
por diseño y esto ocaciona que se cree un nuevo objeto en un diferente espacio de memoria.

Al igual que una variable global, el patrón Singleton nos permite acceder a un objeto desde cualquier parte del programa. No obstante, también evita que otro código 
sobreescriba esa instancia.

## Solución :smiley:

Todas las implementaciones del patrón Singleton tienen estos dos pasos en común:

* Hacer privado el constructor por defecto para evitar que otros objetos utilicen el operador new con la clase Singleton. 
* Crear un método de creación estático que actúe como constructor. Este método invoca al constructor privado para crear un objeto y lo guarda en un 
  campo estático. Las siguientes llamadas a este método validan si el objeto esta creado y lo devuelve el objeto almacenado en caché.
  
  
## Pros
  
 :heavy_check_mark: Puedes tener la certeza de que una clase tiene una única instancia.
 
 :heavy_check_mark: Obtienes un punto de acceso global a dicha instancia.
 
 :heavy_check_mark: El objeto Singleton solo se inicializa cuando se requiere por primera vez.
 
 ## Contras
 
 :x: Vulnera el Principio de responsabilidad única. El patrón resuelve dos problemas al mismo tiempo.
 
 :x: El patrón Singleton puede enmascarar un mal diseño, por ejemplo, cuando los componentes del programa saben demasiado los unos sobre los otros.
 
 :x: El patrón requiere de un tratamiento especial en un entorno con múltiples hilos de ejecución, para que varios hilos no creen un objeto Singleton varias veces.
 
 :x: Puede resultar complicado realizar la prueba unitaria del código cliente del Singleton porque muchos frameworks de prueba dependen de la herencia a la hora de 
 crear objetos simulados (mock objects). Debido a que la clase Singleton es privada y en la mayoría de los lenguajes resulta imposible sobrescribir métodos estáticos,
 tendrás que pensar en una manera original de simular el Singleton. O, simplemente, no escribas las pruebas. O no utilices el patrón Singleton.
 
 
