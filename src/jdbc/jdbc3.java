package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class jdbc3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   try {
	Class.forName("Com.mysql.cj.jdbc.Driver");
   String URL="jdbc:mysql://localhost:3306/emps";
   String password="root";
   String name="root";
  
	Connection don=DriverManager.getConnection(URL, name, password);
   System.out.println("connected");
   Statement st= don.createStatement();
   System.out.println("statement is created");
    ResultSet RS=st.executeQuery("select * from manager");
    while(RS.next())
    {
    	System.out.println(RS.getString(1)+" "+RS.getString(2)+" "+RS.getInt(3));
    	
    }
   }
    catch(Exception e)
    {
    	e.printStackTrace();
    	System.out.println("exception occured");
    }
	
	}

}
