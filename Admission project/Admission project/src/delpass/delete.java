package delpass;

import java.sql.PreparedStatement;

import DBUtil.DButill;
import bean.Bean_class;

public class delete {
	public static int deldata(Bean_class bcobj)
	{
	int i=0;
	try
	{
		PreparedStatement pst=DButill.getDBConnection().prepareStatement("delete from student where roll=(?)");
		pst.setInt(1, bcobj.getroll());
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
