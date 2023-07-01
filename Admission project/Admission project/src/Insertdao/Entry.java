package Insertdao;
import bean.Bean_class;
import java.util.Scanner;
import mainservice.Passingdata;

public class Entry 
{
public static void main(String[] args) 
{
	int roll;
	String stname;
	String sclname;
	int mark12;
	int mark10;
	Scanner sc=new Scanner (System.in);
	int i=1;
	while(true) {
	System.out.println("Enter the data :"+i);
	Bean_class bcobj=new Bean_class();
	System.out.println("Roll : ");
	roll=sc.nextInt();
	System.out.println("Student name : ");
	stname=sc.next();
	System.out.println("School name : ");
	sclname=sc.next();
	System.out.println("Mark in 12th Standard : ");
	mark12=sc.nextInt();
	System.out.println("Mark in 10 : ");
	mark10=sc.nextInt();
	bcobj.setroll(roll);
	bcobj.setstname(stname);
	bcobj.setsclname(sclname);
	bcobj.setmark12(mark12);
	bcobj.setmark10(mark10);
	int ans=Passingdata.enterdata(bcobj);
	System.out.println((ans==i)? "added":"not added");
	i++;
	System.out.println("To Quit enter (Y)");
	String chk=sc.next();
	if(chk.equals("y")) {
		break;
	}
	
	}sc.close();
}
}
