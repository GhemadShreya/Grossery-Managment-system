# Grossery-Managment-system
![Java](https://img.shields.io/badge/Java-17-blue)
![Maven](https://img.shields.io/badge/Maven-3.8.6-red)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-15-green)
![JDBC](https://img.shields.io/badge/JDBC-4.2-orange)

The Grocery Management System is a console-based application built using Core Java, JDBC, and PostgreSQL. It allows users to perform CRUD (Create, Read, Update, Delete) operations on product record stored in a PostgreSQL database. The application is menu-driven, providing a simple and intuitive interface for managing employee data.

## Features

-**Add User**: Add a user in the database.
-**Add Product**: Add a new product record to the database.
-**View All Product**: Fetch and display all products records.
-**Delete Product**: Delete an product record by ID.
-**Menu-Driven Interface**: Easy-to-use console-based menu for seamless navigation.
-Use Collectios For retrive all product list.
---
## Technologies Used

- **Core Java**: For implementing the application logic and OOPs concepts.
- **JDBC (Java Database Connectivity)**: For connecting to and interacting with the PostgreSQL database.
- **PostgreSQL**: For storing and managing employee data.
- **Maven**: For project dependency management and building the project.

---

## Dependencies

The project uses the following dependencies:

- **PostgreSQL JDBC Driver**: For connecting to the PostgreSQL database.
  ```xml
  <dependency>
      <groupId>org.postgresql</groupId>
      <artifactId>postgresql</artifactId>
      <version>42.6.0</version>
  </dependency>
  ```

---

## Prerequisites

Before running the project, ensure you have the following installed:

1. **Java Development Kit (JDK) 17 or higher**.
2. **Apache Maven 3.8.6 or higher**.
3. **PostgreSQL 15 or higher**.
4. create PostgreSQL database with the following table:
   ```sql
create table users (userId serial primary key,userName varchar(100),
email varchar(100),passwd varchar(100),role varchar(100));

create table categories(categoryId serial primary key,categoryName varchar(100));

create table products (productId serial primary key,productName varchar(100),
price float,quantity int,categoryId  int references categories(categoryId));

create table cartItems(cartId serial primary key,userId int references users(userId),
productId int references products(productId),quantity int);

create table orders (orderId serial primary key ,userId int references users(userId),
orderDate timestamp,totalPrice numeric(10,2));

create table orderItems(orderItemsId serial primary key, orderId int references orders(orderId),
productId int references products(productId),quantity int);


   ```

---


## Contact

For any questions or feedback, feel free to reach out:

- **Your Name** : Shreya Ghemad
- **Email**: shreyaghemad16@gmail.com  
- **GitHub**: [Amardole](https://github.com/Amardole)

---

Enjoy using the **Employee Management System**! 🚀

---

