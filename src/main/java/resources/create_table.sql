CREATE DATABASE IF NOT EXISTS gas_account_db;

USE gas_account_db;

CREATE TABLE IF NOT EXISTS accounts (
                                        id INT AUTO_INCREMENT PRIMARY KEY,
                                        username VARCHAR(50) NOT NULL,
    password VARCHAR(255) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    phone_number VARCHAR(15),
    unique_number VARCHAR(50) UNIQUE
    );
