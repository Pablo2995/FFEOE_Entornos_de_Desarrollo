# ⏱️ Verificación y pruebas de una aplicación Spring Boot

## 📖 Descripción de la práctica

Este proyecto corresponde a la actividad formativa del módulo de **Entornos de Desarrollo**, centrada en la verificación y pruebas de una aplicación desarrollada con Spring Boot.

La práctica consiste en comprobar el correcto funcionamiento de una aplicación de gestión de fichajes mediante:

- Casos de prueba
- Pruebas unitarias
- Prueba de integración
- Depuración
- Verificación de resultados

---

# 🛠️ Tecnologías utilizadas

| Tecnología | Uso |
|---|---|
| Java | Lenguaje de programación |
| Spring Boot | Framework backend |
| Maven | Gestión de dependencias |
| JUnit 5 | Pruebas unitarias |
| Mockito | Simulación de dependencias |
| IntelliJ IDEA | Entorno de desarrollo |
| H2 / MySQL | Base de datos |

---

# ⚙️ Funcionalidades de la aplicación

La aplicación permite gestionar fichajes de empleados mediante operaciones básicas:

- ➕ Registrar fichajes
- 📋 Consultar fichajes
- 🔍 Buscar fichajes por ID
- ✏️ Modificar fichajes
- 🗑️ Eliminar fichajes
- 💾 Guardar información en base de datos

---

# 🧪 Casos de prueba realizados

## ✅ Caso de prueba 1 – Alta de fichaje

### Qué se prueba
Registrar un nuevo fichaje.

### Datos de entrada

```text
Empleado: Juan Pérez
Hora entrada: 08:00
Hora salida: 15:00
```

### Resultado esperado

```text
El fichaje se guarda correctamente en la base de datos.
```

---

## ✅ Caso de prueba 2 – Consulta de fichajes

### Qué se prueba
Mostrar todos los fichajes registrados.

### Datos de entrada

```text
Lista de fichajes almacenados en la base de datos.
```

### Resultado esperado

```text
La aplicación devuelve correctamente todos los fichajes.
```

---

## ✅ Caso de prueba 3 – Buscar fichaje por ID

### Qué se prueba
Buscar un fichaje concreto mediante su identificador.

### Datos de entrada

```text
ID = 1
```

### Resultado esperado

```text
Se devuelve correctamente el fichaje con ID 1.
```

---

## ✅ Caso de prueba 4 – Modificación de fichaje

### Qué se prueba
Modificar un fichaje existente.

### Datos de entrada

```text
Cambiar hora salida de 15:00 a 16:00.
```

### Resultado esperado

```text
El fichaje se actualiza correctamente.
```

---

## ✅ Caso de prueba 5 – Error de datos vacíos

### Qué se prueba
Verificar el comportamiento ante datos incorrectos o vacíos.

### Datos de entrada

```text
Empleado vacío o datos incompletos.
```

### Resultado esperado

```text
La aplicación muestra un error de validación y no guarda el fichaje.
```

---

# 🧩 Pruebas unitarias implementadas

Se implementaron pruebas unitarias sobre la lógica de negocio utilizando:

- JUnit 5
- Mockito

## Tests desarrollados

| Test | Función |
|---|---|
| `testObtenerTodos()` | Comprueba la obtención de fichajes |
| `testGuardar()` | Comprueba el guardado de fichajes |
| `testBuscarPorId()` | Comprueba la búsqueda por ID |

---

## Resultado de las pruebas unitarias

```text
3 tests passed
```

Las pruebas verificaron correctamente el funcionamiento de la capa de servicio.

---

# 🔗 Prueba de integración

Se realizó una prueba de integración utilizando:

```java
@SpringBootTest
```

La prueba verificó el funcionamiento conjunto entre:

- Servicio
- Repositorio
- Base de datos

## Resultado de la prueba de integración

```text
1 test passed
```

La prueba confirmó el correcto funcionamiento entre las diferentes capas de la aplicación.

---

# 🐞 Depuración realizada

Se utilizó el depurador de IntelliJ IDEA para analizar el comportamiento interno de la aplicación.

## Acciones realizadas

### ✅ Punto de ruptura (Breakpoint)

Se colocó un breakpoint en:

```java
return fichajeRepository.save(fichaje);
```

### ✅ Ejecución paso a paso

La aplicación se ejecutó en modo:

```text
Debug
```

utilizando la herramienta de depuración de IntelliJ IDEA.

### ✅ Inspección de variables

Durante la depuración se inspeccionaron variables como:

```text
fichaje
resultado
lista
```

permitiendo comprobar el flujo interno de ejecución.

---

# 📊 Resultados obtenidos

## ✅ Resultados correctos

- Las pruebas unitarias se ejecutaron correctamente.
- La prueba de integración verificó la comunicación entre capas.
- El depurador permitió analizar el flujo de ejecución.
- La aplicación funcionó correctamente.

## ⚠️ Errores e incidencias encontradas

Durante el desarrollo aparecieron algunos avisos relacionados con:

- Mockito
- ByteBuddy
- Java Agent Warnings

Ejemplo:

```text
WARNING: A Java agent has been loaded dynamically
```

Estos avisos no afectaron al funcionamiento de la aplicación.

También se corrigieron:

- Problemas de dependencias Maven
- Errores de importaciones
- Configuración de tests

---

# ▶️ Cómo ejecutar el proyecto

## 1️⃣ Abrir proyecto

Abrir el proyecto con IntelliJ IDEA como proyecto Maven.

## 2️⃣ Ejecutar la aplicación

Ejecutar la clase principal:

```text
FichajesApplication.java
```

---

# ▶️ Cómo ejecutar las pruebas

## Ejecutar pruebas unitarias

Ir a:

```text
src/test/java/com/fichajes/service/FichajeServiceTest.java
```

Clic derecho → Run

## Ejecutar prueba de integración

Ir a:

```text
src/test/java/com/fichajes/FichajeIntegrationTest.java
```

Clic derecho → Run

---

# 📂 Estructura del proyecto

```text
src
 ├── main
 │    └── java
 │         └── com.fichajes
 │              ├── controller
 │              ├── service
 │              ├── repository
 │              └── model
 │
 └── test
      └── java
           └── com.fichajes
                ├── FichajeIntegrationTest.java
                └── service
                     └── FichajeServiceTest.java
```

---

# 🎥 Vídeo demostración

Se realizó un vídeo demostrativo de entre 5 y 10 minutos mostrando:

- Funcionamiento de la aplicación
- Ejecución de pruebas
- Uso del depurador
- Explicación de errores encontrados

---

# 🎯 Conclusión

La realización de pruebas unitarias, pruebas de integración y tareas de depuración permitió verificar el correcto funcionamiento de la aplicación Spring Boot.

El uso de herramientas como JUnit, Mockito e IntelliJ IDEA facilitó la detección y resolución de errores durante el desarrollo.

Esta práctica permitió comprender la importancia de las pruebas y la verificación dentro del ciclo de desarrollo de software.

---

# 👨‍💻 Autor

Pablo Antonio Gallego Valenzuela 

Módulo: Entornos de Desarrollo  
Curso: DAW / DAM
