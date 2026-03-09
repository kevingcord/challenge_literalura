# Literalura

**Literalura** es una aplicación desarrollada en **Java con Spring Boot** que consume la **API de Gutendex (Project Gutenberg)** para buscar libros y almacenarlos en una base de datos **PostgreSQL**.

La aplicación funciona mediante un **menú interactivo en consola**, permitiendo consultar libros, autores y estadísticas de lectura.

---

# Tecnologías utilizadas

* Java 17
* Spring Boot
* Spring Data JPA
* Hibernate
* PostgreSQL
* Maven
* API Gutendex

---

# Estructura del proyecto

```text
literalura
│
├── .mvn
├── resources
├── src
│   └── main
│       └── java
│           └── com.literalura
│
│               ├── model
│               │   ├── Autor.java
│               │   ├── Libro.java
│               │   ├── DatosAutor.java
│               │   ├── DatosLibro.java
│               │   └── DatosRespuesta.java
│               │
│               ├── repository
│               │   ├── AutorRepository.java
│               │   └── LibroRepository.java
│               │
│               ├── service
│               │   ├── ConsumoAPI.java
│               │   └── ConvierteDatos.java
│               │
│               ├── principal
│               │   └── Principal.java
│               │
│               └── LiteraluraApplication.java
│
├── resources
│   └── application.properties
│
├── target
├── .gitignore
└── pom.xml
```

---

# Configuración del proyecto

## 1 Clonar el repositorio

```bash
git clone https://github.com/kevingcord/challenge_literalura.git
cd challenge_literalura
```

---

## 2 Configurar PostgreSQL

Crear base de datos:

```sql
CREATE DATABASE literalura;
```

Configurar el archivo:

```
src/main/resources/application.properties
```

Ejemplo:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/literalura
spring.datasource.username=postgres
spring.datasource.password=tu_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

---

# Ejecutar el proyecto

Ejecutar con Maven:

```bash
mvn spring-boot:run
```

---

# Funcionalidades

La aplicación permite:

**Buscar libros por título** usando la API de Gutendex
**Guardar libros en la base de datos**
**Registrar autores automáticamente**
**Listar libros registrados**
**Listar autores registrados**
**Consultar autores vivos en determinado año**
**Filtrar libros por idioma**
**Ver número de descargas de libros**

---

# API utilizada

Se utiliza la API pública de **Gutendex**:

https://gutendex.com/

Ejemplo de consulta:

```
https://gutendex.com/books/?search=don+quijote
```

---

# Menú del sistema

Ejemplo de menú en consola:

```
1 - Buscar libro por título
2 - Listar libros registrados
3 - Listar autores registrados
4 - Listar autores vivos en un año
5 - Listar libros por idioma
0 - Salir
```

---

# Autor
Kevin Gamarra

Proyecto desarrollado con fines educativos para el **Challenge Literalura**.
