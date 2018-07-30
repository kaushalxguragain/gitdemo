import java.sql.*;


public class DatabaseConnection{
	public static void main(String[] args){
		
		
		getConnection();
	}
public static Connection getConnection(){
	
	try{
	
	Class.forName("com.mysql.jdbc.Driver");          
	Connection cr = DriverManager.getConnection("jdbc:mysql://localhost:3306/csit_third","root", "");
	System.out.println("connected");
	return cr;
	}
	
    catch(Exception e){
		System.out.println("Exception: "+ e.getMessage());
		e.printStackTrace();
		return null;
	}	
	
	
 }
 
}