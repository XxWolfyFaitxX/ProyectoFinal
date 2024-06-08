# ProyectoFinal
En este repositorio definiremos la planificación de nuestro proyecto final para la clase de programación en 4 generación.

### Descripción del Proyecto: Sistema de Subastas en Línea
Objetivo del Proyecto:
El objetivo de este proyecto es desarrollar un sistema de subastas en línea que permita a los usuarios registrarse, listar artículos para subasta, realizar ofertas y administrar sus subastas. Los administradores del sistema podrán gestionar usuarios, artículos y monitorear las subastas activas. Este proyecto será desarrollado utilizando Java como lenguaje de programación y Apache NetBeans como entorno de desarrollo, con soporte para bases de datos SQL, SQL Oracle y PostgreSQL.

### Funcionalidades del Sistema:
#### Registro e Inicio de Sesión:

Autenticación para usuarios y administradores.
Registro de nuevos usuarios con validación de datos.
Navegación restringida a usuarios autenticados.
Mecanismo para registrarse en el sistema.

#### Perfil del Usuario:
Actualización de datos personales y de contacto.
Visualización del historial de subastas y ofertas.

#### Gestión de Subastas:
Creación de subastas con detalles del artículo y precio inicial.
Restricción de artículos prohibidos en subasta (ej. armas).
Gestión de fechas de inicio y finalización de subastas.
Visualización de subastas disponibles y activas.
Realización de ofertas en subastas activas.
Cancelación y/o finalización de subastas por el usuario propietario y el administrador.
Panel de Administración:
Registro y gestión de usuarios y sus permisos.
Gestión de artículos y subastas (editar, eliminar, agregar).
Monitoreo de subastas activas y su estado.

### Tecnologías y Herramientas Utilizadas:

#### Backend:
Java con Spring Boot: Framework principal para el desarrollo del backend.
Spring Data JPA con Hibernate: Para la persistencia de datos.
Spring Security: Para la autenticación y gestión de roles.

#### Bases de Datos:
SQL
SQL Oracle
PostgreSQL

#### Frontend:
Thymeleaf: Para renderizar vistas HTML.
Bootstrap o CSS: Para el diseño de la interfaz de usuario.

### Entorno de Desarrollo:
Apache NetBeans: Como entorno de desarrollo integrado (IDE).
Herramientas de Desarrollo:

Maven: Para la gestión del proyecto.
GitHub: Para el control de versiones.
Estructura del Proyecto:
El proyecto seguirá una estructura estándar para aplicaciones Spring Boot:
src/main/java/com/subasta/:

config/: Configuración de seguridad y base de datos.
controller/: Controladores para la lógica del frontend.
model/: Modelos JPA para representar entidades.
repository/: Repositorios JPA para el acceso a datos.
service/: Servicios para la lógica de negocios.
SubastaApplication.java: Clase principal para ejecutar la aplicación.
main/resources/:

static/: Archivos estáticos como CSS y JS.
templates/: Plantillas Thymeleaf para las vistas.
application.properties: Configuración de la aplicación.
Criterios de Evaluación:
El proyecto será evaluado con base en los siguientes criterios:

### Funcionalidad: Cumplimiento de las operaciones CRUD y lógica de negocio.
Calidad del Código: Claridad, organización y buenas prácticas.
Diseño de Base de Datos: Estructura adecuada y relaciones entre entidades.
Seguridad: Implementación de autenticación y autorización.
Interfaz de Usuario: Experiencia de usuario y diseño responsivo.
Entregables:
#### Presentación para la defensa del proyecto:

Ejecución del proyecto, algoritmos complejos, configuraciones, alcances y limitaciones.
Preparación para defender la solución y responder preguntas sobre las implementaciones.
Tiempo de presentación y defensa: 20 minutos por grupo.
Código fuente completo en repositorio de GitHub:

Comentado adecuadamente siguiendo buenas prácticas.

### Documentación:
Manual de configuración y despliegue de la aplicación.
Manual del usuario detallado con instrucciones de uso.
Aspectos Importantes:
El proyecto se entregará en tres fases con rúbricas específicas para cada una.
El plagio será penalizado con la pérdida de la nota.
Los proyectos pueden realizarse en grupos de hasta 3 personas.
Entregas tardías serán penalizadas.
