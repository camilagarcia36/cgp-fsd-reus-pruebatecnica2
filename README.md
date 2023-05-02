# CLINICA
Prueba tecnica api Clinica. 
1.    Introducción

En el presente proyecto del Bootcamp Full Stack correspondiente a la parte Spring Framework se espera que el alumno demuestre todos los conocimientos adquiridos en desarrollo de APIs. 

2.    Descripción 

Desde el departamento de producto nos piden crear el backend correspondiente al sistema de gestión de citas para una Clínica Dental.

Para ello el cliente deberá ser capaz de registrarse en la aplicación, hacer login & logout y acceder a su área de cliente, todo ello visualmente desde el navegador.(*** en este punto el registro y login no son necesarios) En su área de cliente deberá poder ver una lista de las citas que tiene a futuro, crear citas, modificarlas y anularlas.

También existirá una zona de usuario con sus datos personales, que solo podrá ver él mismo. Además, los dentistas deberán poder registrarse como profesionales, hacer login y logout y ver todas las citas y clientes registrados.

Teniendo en cuenta los requisitos, llegamos a la conclusión de que este sería el mínimo de endpoints convenientes:

    1.Perfil de usuario
    2.Modificación de datos del perfil
    3.Creación de citas
    4.Modificación de citas
    5.Anulación de citas
    6.Ver todas las citas que tengo como cliente (solo las propias) --- Da error 'Parameter value [1] did not match expected type [com.ejercicio.dto.Cliente (n/a)]' que no he conseguido solventar. 
    7.Ver todas las citas existentes (como dentista) X
    8.Ver todos los clientes registrados (como dentista) X



#ER
https://github.com/camilagarcia36/cgp-fsd-reus-pruebatecnica2/blob/main/Clinica(1).jpg
#API

GET CITAS
localhost:8181/api/Citas
