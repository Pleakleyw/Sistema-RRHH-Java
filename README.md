# Sistema de Registro de Personal - Java

Este proyecto es una aplicación de escritorio desarrollada en Java para la empresa **Atenas Multiservice S.A.C.**, dedicada a la gestión de recursos humanos.

## Funcionalidades principales

- Registro completo de trabajadores (datos personales, laborales y académicos)
- Consulta de trabajadores filtrados por contrato, estado, etc.
- Exportación de datos a PDF (iText)
- Validación de acceso mediante login
- Uso de base de datos local (MySQL)
- Arquitectura basada en MVC y DAO
- Aplicación de principios SOLID y prueba unitaria (JUnit)

## Tecnologías utilizadas

- Java 8+
- NetBeans IDE
- MySQL / XAMPP
- JUnit 4.13.2
- iText 5.0.5
- Git + GitHub

## Instrucciones de ejecución

1. Clonar el repositorio
2. Importar el proyecto en NetBeans
3. Configurar conexión a base de datos en `Conexion.java`
4. Ejecutar el archivo `Menu.java`

## Estructura

- `DAO/`: lógica de base de datos
- `model/`: clases de datos
- `prysistema/`: interfaz gráfica y flujo principal
- `test/`: prueba unitaria con JUnit

---