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

A continuación, se enumeran todas las fases de compilación de default, cleany los siteciclos de vida, que se ejecutan en el orden dado hasta el punto especificado.

#### Clean Lifecycle

![image](https://user-images.githubusercontent.com/25957863/151661924-3e63cc25-11c2-4b19-b238-c430438c7008.png)

#### Default Lifecycle

![image](https://user-images.githubusercontent.com/25957863/151662046-de33d286-6ba9-490d-b3bf-77be6516204f.png)
![image](https://user-images.githubusercontent.com/25957863/151662055-db28f25e-dd42-4ab4-9100-5413306409a4.png)

#### Site Lifecycle

![image](https://user-images.githubusercontent.com/25957863/151662093-c8606ead-2969-4d36-bd77-ff23e7c71e73.png)

### Para qué sirven los plugins

Un Maven plugin se encarga de centralizar una serie de tareas que son comunes a la construcción del software y están fuertemente relacionadas . Así pues cada plugin dispone de varias tareas a ejecutar. Por ejemplo el plugin de Compile dispone de dos tareas a cada tarea se la denomina Maven Goal.

>Tomado de: https://www.arquitecturajava.com/que-es-un-maven-goal/#:~:text=Un%20Maven%20plugin%20se%20encarga,se%20la%20denomina%20Maven%20Goal.

### Qué es y para qué sirve el repositorio central de maven

El repositorio central de Maven es la ubicación predeterminada para que Maven descargue todas las bibliotecas de dependencia del proyecto para su uso. Para cualquier biblioteca involucrada en el proyecto, Maven primero busca en la carpeta .m2 del Repositorio local, y si no encuentra la biblioteca necesaria, busca en el Repositorio central y carga la biblioteca en el repositorio local.

>Tomado de: https://geekflare.com/es/apache-maven-for-beginners/

##
