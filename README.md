# Reto postulacion training de Automatizacion de Pruebas en SoftK U

Se realiza la actividad propuesta de crear un metodo que permita crear y clasificar naves espaciales y un mecanismo para 
hacer consultas simples y avanzadas

- [Video Youtube]

## Authors

- [@Andres Amortegui]
- [@Repositorio]

## Installation
Servidor de base de datos Mysql, la conexion se encuentra en el archivo properties.
```bash
  spring.jpa.hibernate.ddl-auto=update
  spring.datasource.url=jdbc:mysql://${MYSQL_HOST:localhost}:3306/naves
  spring.datasource.username=root
  spring.datasource.password=12345
```
## Feedback
Usar apis para la creacion de proyectos es bastante util ya que un mismo backend
nos sirve para varios clientes ya sean web, movil o cualquier dispoitivo; es
idea ya que nos permite tener una escalabilidad alta al ser 100% indpendiente.
    
