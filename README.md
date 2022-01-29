# Laboratorio #2
## La herramienta Maven
-------------------------------

### Cuál es su mayor utilidad

Permite ejecutar un proyecto independientemente de sus módulos, dependendencias, librerías, etc. Facilitando así las tareas del desarrollador, haciendo el proceso de ejecución de este más práctico, y sencillo.

### Fases de maven

_**Validar**_ : Validar que el proyecto sea correcto y que toda la información necesaria esté disponible.

_**Compilar**_ : Compilar el código fuente del proyecto.

_**Prueba**_: Probar el código fuente compilado utilizando un marco de prueba de unidad adecuado. Estas pruebas no deberían requerir que el código sea empaquetado o implementado.

_**Paquete**_: Tomar el código compilado y empaquetarlo en su formato distribuible, como un JAR.

_**Verificar**_: ejecutar cualquier verificación de los resultados de las pruebas de integración para garantizar que se cumplan los criterios de calidad

_**Installar**_: Instalar el paquete en el repositorio local, para usarlo como dependencia en otros proyectos localmente.

_**Desplegar**_: Realizado en el entorno de compilación, copia el paquete final en el repositorio remoto para compartirlo con otros desarrolladores y proyectos.

### Ciclo de vida de la construcción

### Para qué sirven los plugins

### Qué es y para qué sirve el repositorio central de maven