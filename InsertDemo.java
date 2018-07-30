import java.util.*;

import java.sql.*;


public class InsertDemo{

	public static void main(String[] args)

	{
	
		Scanner sc = new Scanner(System.in);
		System.out.println("ROll no:");
		int rollNo = Integer.parseInt(sc.nextLine());
		System.out.println("Full name:");
		String name = sc.nextLine();
		System.out.println("Address: ");
		String address  = sc.nextLine();
		System.out.println("Gender: ");
		String gender = sc.nextLine();
		System.out.println("Course : ");
		String course = sc.nextLine();
		Connection cn = DatabaseConnection.getConnection();
		try{
		Statement stat = cn.createStatement();
		String sql = "INSERT INTO student (roll_no , name, address, gender, course) values ("+rollNo+",'"+name+"','"+address+"','"+gender+"','"+course+"')";

		
		
		stat.executeUpdate(sql);
		}catch(SQLException e)
		{
			e.printStackTrace();
			}
				System.out.println("Inserted");
	}

}