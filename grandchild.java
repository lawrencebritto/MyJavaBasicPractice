import java.util.*;
public class grandchild extends childclass {
	grandchild()
	{
		System.out.println("Displaying From Grand Child Class");
	}
	public void display()
	{
		System.out.println("Your acc.no       :"+acc);
		System.out.println("Your name         :"+name);
		System.out.println("Your balance is   :"+total);
	}
	public static void main(String[] args)
	{
		Scanner cin=new Scanner(System.in);
		grandchild obj=new grandchild();
		obj.getdata();
		System.out.print("Enter 1 to deposit\n2 to withdraw\n3 to checkbalance :");
		int choice=cin.nextInt();
		switch(choice)
		{
		case 1:
		{
			System.out.print("Enter deposit amt:");
			int d=cin.nextInt();
			obj.deposit(d);
			obj.display();
			break;
		}
		case 2:
		{
			System.out.print("Enter withdraw amt:");
			int w=cin.nextInt();
			obj.withdraw(w);
			obj.display();
			break;
		}
		case 3:
		{
			obj.display();
			break;
		}
		default:
		{
			System.out.println("Invalid Input");
			break;
		}
		}
	}
}
