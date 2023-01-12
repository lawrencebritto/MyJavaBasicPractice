import java.util.*;
public class parentclass
{
	Scanner in =new Scanner(System.in);
	int acc;
	String name;
	parentclass()
	{
		System.out.println("Geting User Data From Parent Class");		
	}
	public void getdata()
	{
		System.out.print("Enter the acc.no  :");
		acc=in.nextInt();
		System.out.print("Enter your name   :");
		name=in.next();
	}	
}
