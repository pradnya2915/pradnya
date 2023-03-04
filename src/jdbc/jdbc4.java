package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;





public class jdbc4 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
     Class.forName("com.mysql.cj.jdbc.Driver");
    
    String URL="jdbc:mysql://localhost:3306/emps";
    String username="root";
    String password="root";
    System.out.println("Driver class is loaded ");
    
    Connection con=DriverManager.getConnection(URL,username,password);
    System.out.println("connected");
    Statement so=con.createStatement();
   // so.executeUpdate("insert into manager values ('"+name+"',+'"++"',+'"+password+"')");
   
    System.out.println("created Statement");
    
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the name");
     String name=sc.nextLine();
     System.out.println("enter the address");
    String address=sc.nextLine() ;
    System.out.println("enter the contact");
  int  contact=sc.nextInt();
   
    so.executeUpdate("insert into manager values('"+name+"','"+address+"','"+contact+"')");

}
}