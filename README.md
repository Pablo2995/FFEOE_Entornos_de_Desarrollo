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
