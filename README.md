# 💱 Conversor de Monedas Alura ONE

<div align="center">

![Java](https://img.shields.io/badge/Java-17+-orange?style=for-the-badge&logo=java)
![Gson](https://img.shields.io/badge/Gson-2.10-blue?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-Activo-success?style=for-the-badge)
![License](https://img.shields.io/badge/License-MIT-yellow?style=for-the-badge)

**Una aplicación de consola potente y eficiente para convertir divisas en tiempo real** 🚀

[Características](#-características) • [Instalación](#-instalación) • [Uso](#-uso) • [Arquitectura](#-arquitectura) • [API](#-api-utilizada)

</div>

---

## 📋 Descripción

Conversor de Monedas es una aplicación desarrollada en Java como parte del programa **Oracle Next Education (ONE)** en colaboración con **Alura LATAM**. Esta herramienta permite realizar conversiones de divisas de manera rápida y precisa utilizando tasas de cambio actualizadas en tiempo real a través de la API de ExchangeRate-API.

## ✨ Características

- 🌍 **Conversión en tiempo real** - Tasas de cambio actualizadas al instante
- 💼 **6 pares de divisas predefinidos** - Las conversiones más populares de Latinoamérica
- 🎯 **Interfaz intuitiva** - Menú de consola fácil de usar
- 🔒 **API Key encapsulada** - Seguridad y buenas prácticas de programación
- ⚡ **Arquitectura limpia** - Código modular y mantenible
- 🛡️ **Manejo de errores robusto** - Validación de entrada y excepciones controladas

## 🎯 Pares de Divisas Soportados

| # | Conversión | Descripción |
|---|------------|-------------|
| 1 | USD → ARS | Dólar estadounidense a Peso argentino |
| 2 | ARS → USD | Peso argentino a Dólar estadounidense |
| 3 | USD → BRL | Dólar estadounidense a Real brasileño |
| 4 | BRL → USD | Real brasileño a Dólar estadounidense |
| 5 | USD → COP | Dólar estadounidense a Peso colombiano |
| 6 | COP → USD | Peso colombiano a Dólar estadounidense |

## 🚀 Instalación

### Prerrequisitos

- Java JDK 17 o superior
- Biblioteca Gson (incluida en el proyecto)
- Conexión a Internet (para acceder a la API)

### Pasos de instalación

1. **Clona el repositorio**
```bash
git clone https://github.com/tu-usuario/conversorDeMonedasONE.git
cd conversorDeMonedasONE
```

2. **Configura tu IDE**
   - Abre el proyecto en IntelliJ IDEA
   - Asegúrate de que el JDK esté configurado correctamente

3. **Agrega la dependencia de Gson**

Si usas Maven, añade a tu `pom.xml`:
```xml
<dependency>
    <groupId>com.google.code.gson</groupId>
    <artifactId>gson</artifactId>
    <version>2.10.1</version>
</dependency>
```

Si usas Gradle, añade a tu `build.gradle`:
```gradle
dependencies {
    implementation 'com.google.code.gson:gson:2.10.1'
}
```

4. **Ejecuta la aplicación**
```bash
java -cp . com.aluracursos.conversor.main.Main
```

## 💻 Uso

### Ejecución básica

1. Ejecuta la clase `Main.java`
2. Selecciona una opción del menú (1-7)
3. Ingresa la cantidad a convertir
4. Visualiza el resultado de la conversión
5. Repite o selecciona opción 7 para salir

### Ejemplo de uso

```
Sea bienvenido/a al Conversor de Moneda =]

1) Dolar =>> Peso argentino
2) Peso argentino =>> Dolar
3) Dolar =>> Real brasileño
4) Real brasilenio =>> Dolar
5) Dolar =>> Peso colombiano
6) Peso Colombiano =>> Dolar
7) Salir
Elija una opcion valida:
> 1

Escribe la cantidad de USD que deseas convertir a ARS
> 100

==========================================================================================
RESULTADO DE LA CONVERSIÓN:
------------------------------------------------------------------------------------------
Moneda base: USD
Moneda destino: ARS
Tasa de conversión: 1015.50
Resultado: 100.0 USD = 101550.0 ARS
==========================================================================================
```

## 🏗️ Arquitectura

### Estructura del Proyecto

```
conversorDeMonedasONE/
│
├── src/
│   └── com/
│       └── aluracursos/
│           └── conversor/
│               └── main/
│                   ├── Main.java                    # Clase principal
│                   ├── ClienteWeb.java              # Cliente HTTP para la API
│                   └── ExchangeRateAPIDto.java      # DTO para datos de la API
│
├── conversorDeMonedasONE.iml
└── README.md
```

### Componentes Principales

#### 🎮 Main.java
- **Responsabilidad**: Interfaz de usuario y flujo del programa
- **Funcionalidades**: 
  - Menú interactivo
  - Validación de entrada
  - Manejo de excepciones
  - Presentación de resultados

#### 🌐 ClienteWeb.java
- **Responsabilidad**: Comunicación con la API externa
- **Funcionalidades**:
  - Encapsulación de la API Key
  - Realización de peticiones HTTP
  - Procesamiento de respuestas JSON
  - Conversión de JSON a objetos Java

#### 📦 ExchangeRateAPIDto.java
- **Responsabilidad**: Modelo de datos
- **Tipo**: Record (Java 17+)
- **Campos**:
  - `base_code`: Código de la moneda base
  - `target_code`: Código de la moneda destino
  - `conversion_rate`: Tasa de conversión

## 🔌 API Utilizada

### ExchangeRate-API

- **URL Base**: `https://v6.exchangerate-api.com/v6/`
- **Endpoint utilizado**: `/pair/{base}/{target}/{amount}`
- **Documentación**: [exchangerate-api.com](https://www.exchangerate-api.com/docs)
- **Tipo**: API REST
- **Formato de respuesta**: JSON

## 🛠️ Tecnologías Utilizadas

| Tecnología | Versión | Propósito |
|------------|---------|-----------|
| Java | 17+ | Lenguaje de programación principal |
| Gson | 2.10.1 | Serialización/Deserialización JSON |
| HttpClient | Java 11+ | Peticiones HTTP |
| ExchangeRate-API | v6 | Datos de tasas de cambio |

## 🎓 Conceptos Aplicados

- ✅ Programación Orientada a Objetos (POO)
- ✅ Records (Java 17+)
- ✅ Manejo de excepciones
- ✅ Consumo de APIs REST
- ✅ Procesamiento de JSON
- ✅ HTTP Client moderno de Java
- ✅ Encapsulación y ocultamiento de información
- ✅ Separación de responsabilidades
- ✅ Clean Code

## 📝 Mejoras Futuras

- [ ] Agregar más pares de divisas
- [ ] Implementar conversión personalizada (cualquier moneda a cualquier moneda)
- [ ] Guardar histórico de conversiones
- [ ] Interfaz gráfica (GUI)
- [ ] Modo offline con caché de tasas
- [ ] Exportar resultados a CSV/PDF
- [ ] Gráficas de tendencias de divisas
- [ ] Notificaciones de cambios significativos en tasas

## 👨‍💻 Autor

**Jose Eduardo Gijon Mora**
- GitHub: [EduardoGijon](https://github.com/EduardoGijon)

## 🙏 Agradecimientos

- **Oracle Next Education (ONE)** - Por el programa de formación
- **Alura LATAM** - Por los cursos y mentoría
- **ExchangeRate-API** - Por proporcionar la API gratuita

## 🌟 ¿Te gustó el proyecto?

Si este proyecto te fue útil, ¡no olvides darle una ⭐ en GitHub!

---

<div align="center">

**Desarrollado con ❤️ como parte del challenge de Oracle Next Education (ONE)**

[⬆ Volver arriba](#-conversor-de-monedas-alura-one)

</div>

