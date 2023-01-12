import java.util.*;
public class Constructor
{
	int registerNo,total=0,average,i;
	String name;
	Scanner obj=new Scanner(System.in);
	String Sname="Yuvaraj";
	int Sregisternumber=220262;
	Constructor()//default constructor
	{
		System.out.print("Enter your Name                              :");
		name=obj.nextLine();
		System.out.print("Enter your Register Number                   :");
		registerNo=obj.nextInt();
		System.out.println("The Name from default constructor            :"+name);
		System.out.println("The Register Number from default constructor :"+registerNo);
	}
	Constructor(String str)//single parametrized constructor
	{
		System.out.println(str);
	}
	Constructor(String name,int registerNo)// double parametrized constructor
	{
		this.name=name;
		this.registerNo=registerNo;
		System.out.println("The Name from this keyword                   :"+name);
		System.out.println("The Register Number from this keyword        :"+registerNo);
	}
	Constructor(Constructor str)
	{
		System.out.print("Copy constructor called");
	}	
}
