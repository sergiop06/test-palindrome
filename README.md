# test-palindrome
Prueba backend grupo dot 

## Descripción
Este repositorio contiene el codigo fuente correspondiente a la prueba para la posicion de backend engineer del grupo dot realizada por Sergio Perez.

### Despliegue 🚀

_sobre la raiz del proyecto se deben ejecutar los siguientes comandos
```
1. mvn clean install -DskipTests=true

2. docker-compose up --build
```

#### Consumo del proyecto 🚀

1. se debe registrar in usuario el cual se autorizará para realizar el consumo del servicio palindromo
```
Peticion de tipo POST al endpoint : localhost:8080/users/sign-up
```
En el body de la peticion deberá ir el nombre de usuario y contraseña que se desea utilizar en formato json , por ejemplo
```
    {
        "username": "admin",
        "password": "password"
    }
```

2. Una vez registrado un usuario, se debe realizar el login utilizando las credenciales anteriores. De esta forma obtendremos el token JWT que nos permitira consumir el endpoint /palindromo
```
Peticion de tipo post al endpoint : localhost:8080/login
```
En el body de la peticion deberá ir el nombre de usuario y contraseña del usuario que se registró en el punto anterior. Esto en formato JSON, por ejemplo: 
```
    {
        "username": "admin",
        "password": "password"
    }
```    
Al ser exitosa la peticion anterior, podremos observar un header de respuesta llamado Authorization, que tiene como contenido la palabra Bearer junto con el token JWT que debemos utilizar para el siguiente consumo. 
**El contenido de dicho header debe ser agregado al Header llamado Authorization del siguiente punto **


3. Consumo enpdoint /palindromo

Este endpoint permite extraer el substring palindrome mas largo de una palabra.

```
Peticion de tipo POST a la ruta: **localhost:8080/palindromo**
```
Body de la peticion 
    
En el body de la peticion se debe enviar la palabra sobre la cual se desea extraer el substring, en formato JSON: 
    
    {
        "word": "12345654321"
    }
    
