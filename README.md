# Star Wars Movie Searcher 🌌

¡Bienvenido a tu espacio de Star Wars! Este proyecto es una aplicación de consola desarrollada en **Java** que permite a los usuarios buscar información detallada sobre las películas de la saga utilizando la API pública [SWAPI](https://swapi.py/api/films/).

##  Tecnologías y Conceptos Aplicados
- **Java 17+**: Uso de Records, Listas y Programación Orientada a Objetos.
- **Gson (Google)**: Biblioteca para la conversión de objetos Java a JSON y viceversa.
- **HttpClient**: Para realizar peticiones asíncronas a la API externa.
- **Manejo de Archivos (File I/O)**: Generación de un archivo `.json` con el resumen de las búsquedas.
- **Arquitectura DTO**: Separación entre los datos crudos de la API (Record) y la lógica de negocio (Clase).

##  Características
- **Búsqueda interactiva:** El usuario puede ingresar el ID de un episodio (1-6) para obtener su información.
- **Tratamiento de Datos:** Mapeo de campos de la API (en inglés y formato snake_case) a atributos de clase en español y formato camelCase.
- **Historial de búsqueda:** Se mantiene una lista en memoria de todas las películas consultadas durante la sesión.
- **Persistencia:** Al finalizar (escribiendo "salir"), el programa exporta el historial a un archivo llamado `titulos.json` con formato *Pretty Printing*.

##  Estructura del Código
- `Principal`: Clase con el método `main` que gestiona el ciclo de vida del programa y el menú.
- `ConecctionAPI`: Clase encargada de la infraestructura de red y peticiones HTTP.
- `TituloStarWar`: Clase de negocio que representa una película con sus atributos limpios.
- `tituloAPI`: **Record** que sirve como puente para recibir los datos de la API.

##  Cómo ejecutarlo
1. Clona el repositorio.
2. Asegúrate de tener la dependencia de **Gson** en tu proyecto (puedes descargar el JAR o usar Maven/Gradle).
3. Ejecuta la clase `Principal`.
4. Ingresa el número de episodio y, al terminar, busca el archivo `titulos.json` en la carpeta raíz.

---
Desarrollado con la Fuerza por **Natanael** 🇦🇷
