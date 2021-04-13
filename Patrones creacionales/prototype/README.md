# Prototype

Tambien conocido como Prototipo, Clon, Clone.

es un patrón de diseño creacional que nos permite copiar objetos existentes sin que el código dependa de sus clases.

## Problema :disappointed:

Digamos que tienes un objeto y quieres crear una copia exacta de él. ¿Cómo lo harías? En primer lugar, debes crear un nuevo objeto de la misma clase. 
Después debes recorrer todos los campos del objeto original y copiar sus valores en el nuevo objeto.

## Solución :smiley:

El patrón Prototype delega el proceso de clonación a los propios objetos que están siendo clonados. El patrón declara una metodo clonar dentro de la clase. 
Esta metodo permite clonar el objeto ya que devuelve la instancia de la clase actual.

En otras implementaciones se puede crear el metodo clonar por medio de una interfaz, esto permitiendo desacoplar el metodo clonar direcamente de la clase y tambien
pueda ser implemantado por otras clases que tambien deseen ser clonadas.
  
  
## Pros
  
 :heavy_check_mark:  Puedes clonar objetos sin acoplarlos a sus clases concretas.
 
 :heavy_check_mark: Puedes evitar un código de inicialización repetido clonando prototipos prefabricados.
 
 :heavy_check_mark: Puedes crear objetos complejos con más facilidad.
 
 :heavy_check_mark: Obtienes una alternativa a la herencia al tratar con preajustes de configuración para objetos complejos.
 
 
 ## Contras
 
 :x: Clonar objetos complejos con referencias circulares puede resultar complicado
 
 
