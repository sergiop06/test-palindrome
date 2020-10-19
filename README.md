# test-palindrome
Prueba backend grupo dot 

##Descripción
Este repositorio contiene el codigo fuente correspondiente a la prueba para la posicion de backend engineer del grupo dot realizada por Sergio Perez.

###Despliegue 

_sobre la raiz del proyecto se deben ejecutar los siguientes comandos
```
1. mvn clean install -DskipTests=true

2. docker-compose up --build
```

####Consumo del proyecto 

1. se debe registrar in usuario el cual se autorizará para realizar el consumo del servicio palindromo
```
Peticion de tipo post al endpoint : localhost:8080/users/sign-up
En el body de la peticion deberá ir el nombre de usuario y contraseña que se desea utilizar en formato json , por ejemplo 
{
    "username": "admin",
    "password": "password"
}
```
