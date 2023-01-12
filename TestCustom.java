import java.util.*;
public class TestCustom 
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter your age :");
		int age=obj.nextInt();
		try {
			if(age<18)
			{
				throw new custom("age not valid");
			}else
			{
				System.out.print("Valid");
			}
		}catch(custom e){
			System.out.println("Exception caught");
			e.printStackTrace();
		}
	}
}
