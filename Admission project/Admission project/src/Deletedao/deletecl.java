package Deletedao;

import java.util.Scanner;

import bean.Bean_class;
import delpass.delete;

public class deletecl {
	public static void main(String[] args) 
	{
		int roll;
		
		Scanner sc=new Scanner (System.in);
		int i=1;
		while(true) {
		System.out.println("Enter the data :"+i);
		Bean_class bcobj=new Bean_class();
		System.out.println("Roll : ");
		roll=sc.nextInt();
		bcobj.setroll(roll);
		int ans=delete.deldata(bcobj);
		System.out.println((ans==i)? "deleted":"not deleted");
		i++;
		System.out.println("To Quit enter (Y)");
		String chk=sc.next();
		if(chk.equals("y")) {
			break;
		}
		
		}sc.close();
	}
}
