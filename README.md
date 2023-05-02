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



## ER
![Clinica(1)](https://user-images.githubusercontent.com/78553396/235637688-04400231-beb5-4b56-8ccb-646613a3ffcc.jpg)



## API Reference

#### Get all Citas

```http
  GET /api/Citas
```

#### Get Citas por cliente

```http
  GET /api/Citas/Cliente/{idcliente}
```

#### Put Citas
```http
  PUT /api/Citas/{id}
```

#### Post Citas
```http
  POST /api/Citas/
```


#### Delete Citas
```http
  DELETE /api/Citas/{id}
```



#### Get all Clientes

```http
  GET /api/Cliente
```

#### Get list of citas for cliente(error)
GET /Cliente/{idcliente}/citas


#### Post Cliente
```http
  POST /api/Cliente
```

#### Get Cliente por id

```http
  GET /api/Cliente/{idcliente}
```

#### Put Cliente
```http
  PUT /api/Cliente/{idcliente}
```

#### Delete Cliente
```http
  DELETE /api/Cliente/{idcliente}

```


#### Get all dentistas

```http
  GET /api/dentistas
```


#### Get dentistas por id

```http
  GET /api/dentistas/{id}
```

#### Put dentista
```http
  PUT /api/dentistas/{id}
```

#### Delete dentista
```http
  DELETE /api/dentistas/{id}

```

