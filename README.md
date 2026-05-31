# Sistema de Gestión de Contenidos Audiovisuales

## Descripción

Proyecto desarrollado para la asignatura de Programación Orientada a Objetos.

El sistema permite administrar diferentes tipos de contenidos audiovisuales mediante el uso de herencia, polimorfismo y buenas prácticas de desarrollo de software.

Durante la complementación del proyecto se implementaron mecanismos de persistencia de datos, refactorización del código, principios SOLID, arquitectura MVC y pruebas de funcionamiento.

## Funcionalidades

- Gestión de películas.
- Gestión de series de televisión.
- Gestión de documentales.
- Gestión de podcasts.
- Gestión de videos TikTok.
- Uso de herencia y polimorfismo.
- Almacenamiento de datos en archivos CSV.
- Arquitectura MVC (Modelo-Vista-Controlador).
- Aplicación de principios SOLID.
- Pruebas de funcionamiento del sistema.

## Estructura del Proyecto

### Modelo

Paquete:

```
uni1a
```

Clases principales:

- ContenidoAudiovisual
- Pelicula
- SerieDeTV
- Documental
- Podcast
- VideoTiktok
- Actor
- Investigador
- Temporada
- ArchivoManager

### Vista

Paquete:

```
vista
```

Clase:

- AudiovisualView

### Controlador

Paquete:

```
controlador
```

Clase:

- AudiovisualController

## Manejo de Archivos

Se implementó la clase:

- ArchivoManager

La cual genera el archivo:

```
contenidos.csv
```

para almacenar información de los contenidos audiovisuales registrados.

## Pruebas

Se desarrollaron pruebas para validar el funcionamiento del sistema:

- ActorTest
- PeliculaTest

Resultados obtenidos:

```
TEST ACTOR: CORRECTO
TEST PELICULA: CORRECTO
```

## Tecnologías Utilizadas

- Java
- Apache NetBeans
- GitHub
- Programación Orientada a Objetos

## Autor

Jhon Siza

## Repositorio

Complementación de la Unidad 4:
- Manejo de archivos CSV
- Refactorización
- Principios SOLID
- Arquitectura MVC
- Pruebas del sistema

Actualización Unidad 4:
Implementación de MVC, SOLID, manejo de archivos CSV y pruebas.
