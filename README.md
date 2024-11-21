This Java program demonstrates Database Definition Language (DDL) operations using JDBC. It includes methods for creating, altering, truncating, and dropping tables in a MySQL database. The program leverages the Statement interface to execute SQL commands and provides functionality to manage the schema and structure of a table named Product.

Key Features:

Create Table:

Creates a Product table with columns: pId (Primary Key), pName (varchar), and pPrice (int).
Method: CreateTable().

Alter Table:

Add Column: Adds a new column pQty (int) to the Product table.
Method: AlterTableAddColumn().

Delete Column: Removes the pPrice column from the Product table.
Method: AlterTableDelColumn().

Truncate Table:

Deletes all records from the Product table while retaining its structure.
Method: TruncateTable().

Drop Table:

Completely removes the Product table from the database.
Method: DropTable().
