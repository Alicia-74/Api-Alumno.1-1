# Api-Alumno.1-1

## Descripción

La API-Alumnos es una API REST diseñada para gestionar información sobre alumnos y sus datos de contacto. Permite realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) sobre los alumnos y sus contactos.

## Características

- **Consultar Todos los Alumnos:** Obtiene una lista de todos los alumnos sin mostrar su información de contacto.
- **Consultar un Solo Alumno:** Accede a los datos de un alumno específico sin su información de contacto.
- **Consultar Datos de Contacto:** Muestra los datos de contacto de un alumno, incluyendo su ID.
- **Crear Nuevo Alumno:** Permite insertar un nuevo alumno junto con su información de contacto.
- **Borrar Alumno:** Elimina un alumno.

## Tecnologías Utilizadas

- **Java**: Lenguaje de programación principal.
- **Spring Boot**: Framework para crear aplicaciones Java.
- **Hibernate**: ORM para la gestión de la base de datos.
- **MySQL**: Base de datos relacional utilizada para almacenar la información.
  
## Endpoints

### Alumnos

- **GET** `/api/v1/alumno`: Consulta todos los alumnos.
- **GET** `/api/v1/alumno/{id}`: Consulta un alumno por su ID.
- **GET** `/api/v1/alumno/{id}/contacto`: Consulta los datos de contacto de un alumno por su ID.
- **POST** `/api/v1/alumno/insert`: Crea un nuevo alumno.
- **DELETE** `/api/v1/alumno/delete/{id}`: Borra un alumno.

### Contactos

- **GET** `/api/v1/contacto/telf/{telefono}`: Consulta contactos por teléfono.
- **POST** `/api/v1/contacto/insert`: Crea un nuevo contacto.
- **PUT** `/api/v1/contacto/edit/{id}`: Actualiza la información de un contacto.
- **DELETE** `/api/v1/contacto/delete/{id}`: Elimina un contacto.

## Ejemplo de Solicitudes

### Crear Alumno

```json
{
  "alumnoId": 1,
  "name": "Juan",
  "surname": "Pérez",
}
```
### Crear Contacto

```json
 {
    "contactoId": 4,
    "direccion": "Calle Fernando, 7",
    "telf": "123456789",
    "alumnos_idalumno": 1
  }
```
