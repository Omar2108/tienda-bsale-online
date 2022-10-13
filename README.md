# API TIENDA ONLINE PRODUCTOS
Este proyecto esta desarrollado en Java con el framework Spring Boot version 2.7.3, como dependencia se utilizo Spring web, JPA, conector de MySQL, Lombok, y una base de datos SQL MySQL. Subido a un hosting gratuito como Heroku, la direccion principal de la api es: https://tienda-bsale-online.herokuapp.com/


## ENDPOINT
link:  https://tienda-bsale-online.herokuapp.com/v1/products/all , mediante este endpoint podra obtener todos los productos almacenados en la tabla productos de la base de datos. Métodos de petición HTTP utilizado GET.

link: https://tienda-bsale-online.herokuapp.com/v1/products/filter/{nameProduct} , mediante este endpoint podra obtener todos los productos almacenados en la tabla productos de la base de datos, que coincidan con el nombre del producto ingresado recibe un parametro tipo string. Métodos de petición HTTP utilizado GET.

link:  https://tienda-bsale-online.herokuapp.com/v1/category/all , mediante este endpoint podra obtener todas las categorias almacenados en la tabla categorias de la base de datos. Métodos de petición HTTP utilizado GET.

link: https://tienda-bsale-online.herokuapp.com/v1/category/filter/{nameCategory} , mediante este endpoint podra obtener todos las categorias almacenados en la tabla categorias de la base de datos, que coincidan con el nombre de la categoria ingresado recibe un parametro tipo string. Métodos de petición HTTP utilizado GET.

## Documentación
Visite la documentación en linea en: https://tienda-bsale-online.herokuapp.com/swagger-ui/index.html#/ , para obtener la guía más actualizada.


## Descarga y registro de cambios:
Siempre se recomienda descargar desde GitHub la última versión.
###  Usando la línea de comando:
####  via Git:
    git clone https://github.com/Omar2108/tienda-bsale-online.git
    
 ### Instalacion de Dependencias
    npm install 
	npm install --legacy-peer-deps --force

### Levantamiento de la aplicacion 
#### En Desarrollo
     npm run devstart
#### En Produccion 
    npm start

## Compatibilidad con navegadores
- IE / Edge
- Firefox
- Chrome
- Safari
- Opera


## Contribución
1. Crea un Fork del repositorio.
2. Clonar en tu maquina mediante git clone https://github.com/Omar2108/tienda-bsale-online.git
3. Crear una nueva rama.
4. Realiza tus cambios.
5. Manda tu pull request.

## Licencia
MIT






