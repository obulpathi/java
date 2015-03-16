DROP DATABASE IF EXISTS BankDatabase;

CREATE DATABASE BankDatabase;

USE BankDatabase;

CREATE TABLE BankDatabase
(
   AccountNumber int NOT NULL PRIMARY KEY,
   PIN int NOT NULL,
   AvailableBalance double NOT NULL,
   TotalBalance double NOT NULL
) ;

