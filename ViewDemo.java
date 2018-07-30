import java.util.*;
import java.sql.*;

public class ViewDemo{
	
	public static void main(String[] args){
	  Scanner sc = new Scanner (System.in);
	  System.out.println("Enter Roll No:  to display info.: ");
	  int rollNo = Integer.parseInt(sc.nextLine());
	  Connection cn = DatabaseConnection.getConnection();
	  try{
		Statement stat = cn.createStatement();
	  
		String sqlQuery = "select * from student whore roll_no="+rollNo;
		ResultSet rs = stat.executeQuery(sqlQuery);
		while(rs.next())
			{
		  
				int roll =Integer.parseInt(rs.getString("roll_no"));
				String name = rs.getString("name");
				String  address = rs.getString("address");
		  
				System.out.println("Roll no "+roll);
				System.out.println("Name" +name);
				System.out.println("address "+address);
		  
		  
		  
			}
		}
		catch(SQLException e ){
		
					e.printStackTrace();
				}

	}
	
}