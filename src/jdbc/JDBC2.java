package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC2 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
Class.forName("com.mysql.cj.jdbc.Driver");
String URL="jdbc:mysql://localhost:3306/niki";
String password="root";
String username="root";

Connection con=DriverManager.getConnection(URL,password,username);
System.out.println("connected strongly");

Statement nt=con.createStatement();
System.out.println("statement created");

// nt.execute("create database niki");
System.out.println("created");
//nt.execute("create table Dam (name varchar (23),city varchar (21), location varchar (30))");
System.out.println("table dam created");
nt.execute("insert into dam values 'pari','awasari','pune'");
System.out.println("value inserted");
nt.executeUpdate("alter table dam add column city");
System.out.println("added");
ResultSet rs=nt.executeQuery("select*from manager");
while (rs.next());
{
	
}


	}

}
