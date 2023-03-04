package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Jdbc1 {

	public static void main(String[] args)throws Exception  {
		// TODO Auto-generated method stub
     Class.forName("com.mysql.cj.jdbc.Driver");
     String URL= "jdbc:mysql://localhost:3306/emps";
     String password="root";
     String username="root";
     
     Connection con=DriverManager.getConnection(URL,password,username);
     System.out.println("connected");
     Statement st=con.createStatement();
     System.out.println("Statement");
    // st.execute("create database emps");
     System.out.println("created");
     //String q="create database emps";
    // st.execute(q);
     //String e="create table manager(name varchar(40),address varchar(23),contact int)";
     //st.execute(e);
     System.out.println("table is created");
    // String f="insert into manager values ('nika','pune', 123456)";
    // st.execute(f);
     //String g="insert into manager values ('pradnya','pune', 976587)";
    // st.execute(g);
     System.out.println("value inserted");
     //String v="alter table manager add (city varchar (20))";
    // st.execute(v);
     System.out.println("column added");
   // st.executeUpdate("delete from manager where name='nika'");
    System.out.println("delete column");
   // st.executeUpdate("alter table manager drop column city");
    System.out.println("drop column city");
    st.executeUpdate ("insert into manager values('nikita','pune',3456)");
    System.out.println("nikita is inserted");
    st.executeQuery("select* from manager");
    System.out.println("already");
	}
	

}
