import java.sql.*;

public class Database 
{

	public static void main(String[] args) 
	{
		
		try 
		{
			//connection to database  using dummy password
			Connection myConn = DriverManager.getConnection("jdbc:mysql://sql3.freesqldatabase.com:3306/sql3230343", "sql3230343", "dummy_password");

			//create statement
			Statement myStmt = myConn.createStatement();
			
			//execute SQL query
			ResultSet myRs = myStmt.executeQuery("select * from TM");
			
			//results set
			while (myRs.next())
			{
				System.out.println(myRs.getString("task_name")+ " | "+myRs.getString("task_desc")+ " | "+myRs.getString("task_size"));
				
			}
				
		}
		
		catch (Exception exc)
		{
			exc.printStackTrace();
		}
		
	}
	
}
