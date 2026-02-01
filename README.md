**1. Introduction
1.1 Project Title
**
_**VoyageEase – Tourism Management System
**_
1.2 Technology Used

Programming Language: Core Java

Database: MySQL

Connectivity: JDBC

Interface: Command Line (Menu Driven)

IDE: VS code

OS: Windows / Linux

**2. Problem Statement**

Traditional tourism management involves manual handling of destinations, tour packages, tourists, and bookings. This process is time-consuming, error-prone, and inefficient. There is a need for a computerized system that automates tourism operations and maintains records securely.

**3. Objective of the System**

To automate tourism management activities

To manage destinations and tour packages efficiently

To register tourists and handle bookings

To store and retrieve data using MySQL

To provide a simple menu-driven interface

4**. Scope of the Project**

The system is designed for small to medium tourism agencies.
It supports:

Admin authentication

Destination management

Tour package booking

Tourist registration

Booking record maintenance

Future enhancements can include online payments, GUI, and report generation.

**5. System Requirements**
**5.1 Hardware Requirements**

Processor: Intel i3 or above

RAM: Minimum 4GB

Hard Disk: 500MB free space

**5.2 Software Requirements**

Java JDK 8 or above

MySQL Server

MySQL Connector/J

Eclipse / IntelliJ IDE

**6. System Architecture**

The system follows a three-layer architecture:

Presentation Layer

Menu-driven command line interface

Business Logic Layer

Java classes handling logic (Booking, Destination, Tourist)

Data Access Layer

JDBC used to connect Java application with MySQL database

**7. Database Design**
**7.1 Tables Used**
Admin Table

Stores admin login credentials.

Field	Type
username	VARCHAR
password	VARCHAR
Destination Table

Stores tourist destinations.

Field	Type
dest_id	INT (PK)
name	VARCHAR
location	VARCHAR
description	VARCHAR
Tour Package Table

Stores tour package details.

Field	Type
package_id	INT (PK)
package_name	VARCHAR
dest_id	INT (FK)
price	DOUBLE
days	INT
Tourist Table

Stores tourist details.

Field	Type
tourist_id	INT (PK)
name	VARCHAR
phone	VARCHAR
email	VARCHAR
Booking Table

Stores booking records.

Field	Type
booking_id	INT (PK)
tourist_id	INT (FK)
package_id	INT (FK)
booking_date	DATE
**8. Functional Modules
8.1 Admin Login**

Secure login for admin

Validates username and password from database

**8.2 Destination Management**

Add new tourist destinations

Stores location and description

**8.3 Tourist Registration**

Register tourists with basic details

**8.4 Tour Package Booking**

Book tour packages for registered tourists

Stores booking date automatically

**8.5 View Records**

View destinations and bookings

**9. Input and Output Design
**
Input:

Admin credentials

Destination details

Tourist details

Package and booking selections

Output:

Confirmation messages

Booking success status

Display of stored records

**10. Exception Handling**

SQL Exceptions handled using try-catch blocks

Invalid menu choices handled gracefully

Database connection failures handled safely

**11. Security Features**

Admin authentication

Use of PreparedStatement to prevent SQL Injection

Restricted access to management features

**12. Limitations**

Command-line interface only

Single admin user

No online payment integration

No GUI support
