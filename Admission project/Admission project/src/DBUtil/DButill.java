package DBUtil;
import java.sql.Connection;
import java.sql.DriverManager;
public class DButill 
{
	public static Connection getDBConnection() 
    {
        Connection  con= null;
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college1","root","7708499025");
            return con;
        }
        catch(Exception e)
        {
            e.printStackTrace();
            
        }return con;
    }
}


