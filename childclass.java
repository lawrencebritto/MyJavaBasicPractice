import java.util.*;
public class childclass extends parentclass {
	int total=10000;
	childclass()
	{
		System.out.println("Calculation From Child Class");
	}
	public void deposit(int d)
	{
		total=total+d;
	}
	public void withdraw(int w)
	{
		if(w>total)
		{
			System.out.println("Insufficient balance");
		}else
		{
		total=total-w;
		}
	}
}
