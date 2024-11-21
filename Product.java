package JDBCDDL_21Nov;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Product {

	public void CreateTable() throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/person?useSSL=false","root","root");
		Statement s = conn.createStatement();
		s.execute("Create table product(pId int Primary key, pName varchar(30), pPrice int)");
		System.out.println("Table Created Successfully");
		conn.close();
	}
	
	public void AlterTableAddColumn() throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/person?useSSL=false","root","root");
		Statement s = conn.createStatement();
		s.execute("Alter Table Product Add pQty int");
		System.out.println("Column Added Successfully");
		conn.close();
	}
	
	public void AlterTableDelColumn() throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/person?useSSL=false","root","root");
		Statement s = conn.createStatement();
		s.execute("Alter Table Product Drop column pPrice");
		System.out.println("Column Deleted Successfully");
		conn.close();
	}
	
	public void DropTable() throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/person?useSSL=false","root","root");
		Statement s = conn.createStatement();
		s.execute("Drop Table Product");
		System.out.println("Table Droped Successfully");
		conn.close();
	}
	
	public void TruncateTable() throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/person?useSSL=false","root","root");
		Statement s = conn.createStatement();
		s.execute("Truncate Table Product");
		System.out.println("Records Deleted Successfully");
		conn.close();
	}
	
	public static void main(String[] args) throws Exception {
		
		Product p1 = new Product();
		p1.CreateTable();
		//p1.AlterTableAddColumn();
		//p1.AlterTableDelColumn();
		//p1.DropTable();
		//p1.TruncateTable();
	}
}
