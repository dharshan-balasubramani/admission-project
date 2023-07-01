package Updatedao;

import java.sql.PreparedStatement;

import DBUtil.DButill;
import bean.Bean_class;

public class uppass {
	public static int updata(Bean_class bcobj)
	{
	int i=0;
	try
	{
		PreparedStatement pst=DButill.getDBConnection().prepareStatement("update student set stname=(?) where roll=(?)");
		pst.setInt(2, bcobj.getroll());
		pst.setString(1, bcobj.getstname());
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
