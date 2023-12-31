# API learn-with-me


# Descripción

"Learn-With-Me" es una potente API diseñada para brindar una experiencia de aprendizaje en línea segura y eficiente. Esta API ofrece una amplia gama de funcionalidades que permiten a los usuarios registrarse, iniciar sesión y gestionar contenido educativo de manera fácil y segura. Con un enfoque en la seguridad, "Learn-With-Me" utiliza la tecnología de Spring Framework y JWT (JSON Web Tokens) para garantizar la protección de los datos y la autenticación de los usuarios.

# Detalles

**Endpoint: Registro**

Solicitud: Post

Descripción: Se enviaran los datos para el registro tomando en cuenta estas validaciones

consideraciones:ningún carácter debe estar en blanco o vacío , todos son string.

nombreCompleto , apellidoCompleto = recibe solo letras mayúsculas, minúsculas, máx 30 caracteres,

dni = recibe solo número máximo 8 caracteres,

username = corresponde al campo de email, caracteres alfanumérico debe tener @ y y un punto (.),

password = recibe caracteres alfanumérico, un carácter especial, mínimo 8 y max 15 caracteres,

rol= solo letras,

fechaNacimiento= debe ser del pasado, solo números, formato yyyy-mm-dd,

pais= solo letras 

Una vez registrados devuelve el token.

url: https://learn-with-me-production.up.railway.app/Api/v1/auth/registro

ejemplo:
{
    "nombreCompleto": "lean",
    "apellidoCompleto": "withme",
    "dni": "12548484",
    "username": "learnwithmee@gmail.com",
    "password": "prba123#A",
    "rol" :"alumno",
    "fechaNacimiento": "1999-06-05",
    "pais": "argentina"
}


**Endpoint: Login**

Solicitud: Post
url: https://learn-with-me-production.up.railway.app/Api/v1/auth/login

Descripción: Se envia usuario y contraseña,aplican las mismas validaciones del registro para username y password
una vez logueado devuelve el token.

ejemplo:

{
    "username": "profesor@gmail.com",
    "password": "prba123#A"
}



**Endpoint: Notificación**

Descripción: Una vez el usuario está en la pagina en construccion dejará su email para
ser notificado cuando este disponible una sección , aplican las mismas validaciones del registro para email.

Solicitud: Post

url: https://learn-with-me-production.up.railway.app/Api/v1/notificacion/recibirEmail

ejemplo:
{
    "username": "pruebates1@gmail.com"
}



**Endpoint: Guardar test**

Descripción: Una vez el alumno realiza el test se guarda en l bd se debe enviar el resultado del test más el id del alumno por path variable

Solicitud: Post

url:https://learn-with-me-production.up.railway.app/Api/v1/test/guardarTest/1

ejemplo:

{
    "resultado": "audiovisual"
}

**Endpoint: Lista de alumnos**

Descripción: Devuelve una lista de alumnos

Solicitud: Get

url: https://learn-with-me-production.up.railway.app/Api/v1/admin/listarAlumnos

ejemplo:

[
    {
        "id": 1,
        "nombreCompleto": "cambiodato",
        "apellidoCompleto": "vargaas",
        "dni": "12345678",
        "fechaNacimiento": "2022-04-01",
        "pais": "argentian"
    },
    {
        "id": 3,
        "nombreCompleto": "pruebaprofe",
        "apellidoCompleto": "pruebaprof",
        "dni": "12548484",
        "fechaNacimiento": "2023-06-05",
        "pais": "argentina"
    },
    {
        "id": 4,
        "nombreCompleto": "lean",
        "apellidoCompleto": "withme",
        "dni": "12548484",
        "fechaNacimiento": "1999-06-05",
        "pais": "argentina"
    }
]



**Endpoint: Buscar alumno por id**

Descripción: Devuelve un alumno según el id que se le envía por la path variable

Solicitud: Get

url:https://learn-with-me-production.up.railway.app/Api/v1/admin/buscarPorId/1

ejemplo:

{
    "id": 1,
    "nombreCompleto": "cambiodato",
    "apellidoCompleto": "vargaas",
    "dni": "12345678",
    "fechaNacimiento": "2022-04-01",
    "pais": "argentian"
}



**Endpoint: Eliminar por id**

Descripción: Elimina un alumno con el id recibido por la path variable de la bd

Solicitud: Delete

url: https://learn-with-me-production.up.railway.app/Api/v1/admin/eliminarPorId/4

ejemplo:

Usuario eliminado con éxito


**Endpoint: Actualizar los datos del alumno por id**

Descripción: Se actualiza los datos del usuario por el id recibido en la path variable, más la posibilidad de cambiar la foto que se le asignó por defecto al registrarse, se debe enviar un multipart/form-data
Solicitud: Put

url:https://learn-with-me-production.up.railway.app/Api/v1/alumno/actualizarAlumnoPorID/1



# Tecnologia empleada

Java 

Jpa

Spring Boot

Spring Framework

Spring Security

Jwt

Hibernate

Lombok

Mysql

Spring Tool Suit

Visual Studio Code

Postman

Se utilizó la plataforma Railway para el deploy

# Contacto

email:

leonardovargasfp@gmail.com

varela.ig98@gmail.com

linkedin:

https://www.linkedin.com/in/leonardo-vargas1/

https://www.linkedin.com/in/ignaciovarela98/

