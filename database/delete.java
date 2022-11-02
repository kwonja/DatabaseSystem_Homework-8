package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class delete {
	public static void main(String args[]) {  
		try{  
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection(
		"jdbc:mysql://192.168.100.3:4567/madang?useSSL=false", "kwonsungmin","1234");  
		Statement stmt=con.createStatement();
		
		stmt.executeUpdate("DELETE FROM Book WHERE bookid=8"); //1¹ÝÈ¯
		ResultSet rs=stmt.executeQuery("SELECT * FROM Book"); 
		
		while(rs.next())  
			System.out.println(rs.getInt(1)+"  "+ rs.getString(2)+"  "+rs.getString(3));  
		
		con.close();  
		}catch(Exception e){ System.out.println(e);}  
		}
}
