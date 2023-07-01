package mainservice;
import java.sql.PreparedStatement;
import DBUtil.DButill;
import bean.Bean_class;

public class Passingdata 
{
public static int enterdata(Bean_class bcobj)
	{
	int i=0;
	try
	{
		PreparedStatement pst=DButill.getDBConnection().prepareStatement("insert into student values(?,?,?,?,?)");
		pst.setInt(1, bcobj.getroll());
		pst.setString(2, bcobj.getstname());
		pst.setString(3, bcobj.getsclname());
		pst.setInt(4,  bcobj.getmark12());
		pst.setInt(5, bcobj.getmark10());
		i=pst.executeUpdate();
		
	}
	catch(Exception e)
	{
		e.printStackTrace();
		System.out.println("Exception in Passing Data");
	}
	
	if(i==1)
	{
		return 1;
	}
	else return 0;
		
	}

}

