# Grocery Management System

![Java](https://img.shields.io/badge/Java-17-blue)
![Maven](https://img.shields.io/badge/Maven-3.8.6-red)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-15-green)
![JDBC](https://img.shields.io/badge/JDBC-4.2-orange)

The **Grocery Management System** is a console-based application built using Core Java, JDBC, and PostgreSQL. It allows users to perform CRUD (Create, Read, Update, Delete) operations on grocery data stored in a PostgreSQL database. The application features a menu-driven interface, offering a simple and intuitive experience for managing users, categories, products, and billing.

---

## ✅ Features

- **Add User**: Register a new user in the system.
- **Add Category**: Add a new product category.
- **Add Product**: Add a new product under a specific category.
- **View All Products**: Display all products with their details.
- **View Categories**: Display all categories.
- **View Users**: Display registered users.
- **Buy Products & Generate Bill**: Select products, specify quantity, and calculate the total bill.
- **Menu-Driven Interface**: Easy-to-use console navigation.
- **Uses Collections**: To handle and display product lists.

---

## 🛠️ Technologies Used

- **Core Java**: For implementing application logic and OOP concepts.
- **JDBC (Java Database Connectivity)**: For database operations.
- **PostgreSQL**: For storing user, product, and billing data.
- **Maven**: For dependency and project build management.

---

## 📦 Dependencies

The project uses the following Maven dependency:

```xml
<dependency>
    <groupId>org.postgresql</groupId>
    <artifactId>postgresql</artifactId>
    <version>42.6.0</version>
</dependency>
```
---
## 🔧 Prerequisites
Before running the project, make sure you have:

Java Development Kit (JDK) 17 or higher

Apache Maven 3.8.6 or higher

PostgreSQL 15 or higher

A PostgreSQL database with the following schema:

``` sql
-CREATE TABLE users (
    userId SERIAL PRIMARY KEY,
    userName VARCHAR(100),
    email VARCHAR(100),
    passwd VARCHAR(100),
    role VARCHAR(100)
);

-CREATE TABLE categories (
    categoryId SERIAL PRIMARY KEY,
    categoryName VARCHAR(100)
);

-CREATE TABLE products (
    productId SERIAL PRIMARY KEY,
    productName VARCHAR(100),
    price FLOAT,
    quantity INT,
    categoryId INT REFERENCES categories(categoryId)
);

-CREATE TABLE cartItems (
    cartId SERIAL PRIMARY KEY,
    userId INT REFERENCES users(userId),
    productId INT REFERENCES products(productId),
    quantity INT
);

-CREATE TABLE orders (
    orderId SERIAL PRIMARY KEY,
    userId INT REFERENCES users(userId),
    orderDate TIMESTAMP,
    totalPrice NUMERIC(10,2)
);

-CREATE TABLE orderItems (
    orderItemsId SERIAL PRIMARY KEY,
    orderId INT REFERENCES orders(orderId),
    productId INT REFERENCES products(productId),
    quantity INT
);
```

---

## 📸 Screenshot

![GroceryManagement System Demo](https://github.com/GhemadShreya/Grossery-Managment-System/commit/77e14b4389fd9e988f7a01882d5963a1c12be311)

---
## 👤 Contact
For any questions or feedback, feel free to connect:-

-**Name**: Shreya Ghemad

-**Email**: shreyaghemad16@gmail.com

-**GitHub**: https://github.com/GhemadShreya

🎉 Enjoy using the Grocery Management System!
Built with ❤️ in Core Java.
