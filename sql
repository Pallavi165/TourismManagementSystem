

## SQL Script (create_tables.sql)

```sql
-- Create Database
CREATE DATABASE IF NOT EXISTS tourism_db;
USE tourism_db;

-- Admin Table
CREATE TABLE IF NOT EXISTS admin (
    username VARCHAR(50) PRIMARY KEY,
    password VARCHAR(50)
);

INSERT INTO admin (username, password) VALUES ('admin', 'admin123');

-- Destination Table
CREATE TABLE IF NOT EXISTS destination (
    dest_id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    location VARCHAR(100),
    description VARCHAR(200)
);

-- Tour Package Table
CREATE TABLE IF NOT EXISTS tour_package (
    package_id INT AUTO_INCREMENT PRIMARY KEY,
    package_name VARCHAR(100),
    dest_id INT,
    price DOUBLE,
    days INT,
    FOREIGN KEY (dest_id) REFERENCES destination(dest_id)
);

-- Tourist Table
CREATE TABLE IF NOT EXISTS tourist (
    tourist_id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    phone VARCHAR(15),
    email VARCHAR(100)
);

-- Booking Table
CREATE TABLE IF NOT EXISTS booking (
    booking_id INT AUTO_INCREMENT PRIMARY KEY,
    tourist_id INT,
    package_id INT,
    booking_date DATE,
    FOREIGN KEY (tourist_id) REFERENCES tourist(tourist_id),
    FOREIGN KEY (package_id) REFERENCES tour_package(package_id)
);
