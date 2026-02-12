# 🚀 User Management API — Spring Boot

Backend REST desarrollado con Spring Boot aplicando Clean Architecture y principios básicos de Domain Driven Design (DDD).  
El proyecto implementa un sistema de gestión de usuarios con persistencia en PostgreSQL y documentación automática mediante Swagger.

Diseñado como proyecto de portafolio para demostrar estructura profesional backend, desacoplamiento de capas y buenas prácticas.

---

## 📖 Descripción general

Esta API permite crear y consultar usuarios mediante endpoints REST.

El sistema está dividido en capas independientes:

- API: recibe las peticiones HTTP
- Application: contiene los casos de uso
- Domain: reglas del negocio
- Infrastructure: persistencia en base de datos

Gracias a esta separación, el proyecto es escalable, testeable y mantenible.

---

## ⚙️ ¿Cómo funciona?

1. El cliente realiza una petición HTTP (Swagger o frontend).
2. El Controller recibe la solicitud.
3. Se ejecuta el Caso de Uso correspondiente.
4. El Dominio procesa la entidad.
5. El Adapter guarda o consulta datos en PostgreSQL.
6. Se devuelve la respuesta al cliente.

Toda la comunicación entre capas se realiza mediante interfaces.

---

## 🛠 Tecnologías utilizadas

- Java 21  
- Spring Boot  
- Spring Data JPA  
- PostgreSQL  
- Maven  
- Swagger / OpenAPI  

---

## 📂 Arquitectura

src/main/java

domain
├── model
└── repository

application
└── usecase

infrastructure
└── persistence

api
└── controller


---

## ▶ Cómo ejecutar el proyecto (levantar servidor)

### Requisitos

- Java 21
- PostgreSQL
- Git

---

### 1️⃣ Crear base de datos

En PostgreSQL:

```sql
CREATE DATABASE user_management;