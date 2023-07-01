package updpass;

import java.util.Scanner;

import bean.Bean_class;
import Updatedao.uppass;

public class upass {
	public static void main(String[] args) 
	{
		int roll;
		String stname;
		Scanner sc=new Scanner (System.in);
		int i=1;
		while(true) {
		System.out.println("Enter the data :"+i);
		Bean_class bcobj=new Bean_class();
		System.out.println("Roll : ");
		roll=sc.nextInt();
		System.out.println("Student name : ");
		stname=sc.next();
		bcobj.setroll(roll);
		bcobj.setstname(stname);
		int ans=uppass.updata(bcobj);
		System.out.println((ans==i)? "updated":"not updated");
		i++;
		System.out.println("To Quit enter (Y)");
		String chk=sc.next();
		if(chk.equals("y")) {
			break;
		}
		
		}sc.close();
	}

}