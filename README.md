# Java CSV File Reader

A simple Java project that demonstrates how to read employee data from a CSV file using three different approaches.

## Features

* Read CSV files using Scanner
* Read CSV files using BufferedReader
* Read CSV files using OpenCSV
* Parse employee records and display them in the console
* Compare different file-reading techniques

## Technologies Used

* Java
* OpenCSV
* Maven
* IntelliJ IDEA

## Project Structure

```text
src/
 ├── main/
 │   ├── java/
 │   │   ├── Way1BufferedReader.java
 │   │   ├── Way2Scanner.java
 │   │   └── Way3OpenCsv.java
 │   └── resources/
 │       └── employees.csv
```

## Approaches Implemented

### 1. Scanner

Uses the Scanner class to read CSV data line by line.

### 2. BufferedReader

Uses BufferedReader for efficient file reading and manual parsing using the split() method.

### 3. OpenCSV

Uses the OpenCSV library to simplify CSV parsing and handle CSV records efficiently.

## Sample CSV Format

```csv
id,name,email,phone,city,salary
1,Srinivas,srinivas@gmail.com,9876543210,Hyderabad,50000
2,Ravi,ravi@gmail.com,9876543211,Bengaluru,55000
```

## Learning Outcomes

* Java File Handling
* Working with CSV files
* Exception Handling
* External Library Integration
* Maven Dependency Management

## Author

Srinivas Dappu

LinkedIn: https://www.linkedin.com/in/dappusrinivas/

