package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class insert {
	public static void main(String args[]) {  
		try{  
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection(
		"jdbc:mysql://192.168.100.3:4567/madang?useSSL=false", "kwonsungmin","1234");  
		Statement stmt=con.createStatement();
		
		stmt.executeUpdate("INSERT INTO Book(bookid, bookname, publisher, price) VALUES (11,'스포츠 의학','한솔의학서적',90000)"); //1반환
		ResultSet rs=stmt.executeQuery("SELECT * FROM Book"); 
		
		while(rs.next())  
			System.out.println(rs.getInt(1)+"  "+ rs.getString(2)+"  "+rs.getString(3));  
		
		con.close();  
		}catch(Exception e){ System.out.println(e);}  
		}
}