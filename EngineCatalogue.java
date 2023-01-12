import java.util.*;
public class EngineCatalogue extends BMW implements Engine
{
	public void CarEngine()
	{
		int m=31,c=2998,noc=6,fc=46;
		String f="Petrol",p="5000-6000rpm",t="Automatic",mt="450Nm";
		System.out.println("ARAI Mileage             :"+m);
		System.out.println("Engine Displacement (cc) :"+c);
		System.out.println("Max Power                :"+p);
		System.out.println("Fuel Tank Capacity       :"+fc);
		System.out.println("Fuel Type                :"+f);
		System.out.println("No. of cylinder          :"+noc);
		System.out.println("Max Torque               :"+mt);
		System.out.println("Transmission             :"+t);
	}
	public void BikeEngine()
	{
		int mi=35,cc=331,noc=1,fc=11;
		String f="Petrol",p="35PS",b="Disc",mt="28Nm";
		System.out.println("ARAI Mileage             :"+mi);
		System.out.println("Engine Displacement (cc) :"+cc);
		System.out.println("Max Power                :"+p);
		System.out.println("Fuel Tank Capacity       :"+fc);
		System.out.println("Fuel Type                :"+f);
		System.out.println("No. of cylinder          :"+noc);
		System.out.println("Max Torque               :"+mt);
		System.out.println("Brake Type               :"+b);
	}
	public static void main(String[] args)
	{
		EngineCatalogue obj=new EngineCatalogue();
		Scanner in=new Scanner(System.in);
		System.out.print("Enter 1 for Car Engine\n2 for Bike Engine    :");
		int choice=in.nextInt();
		switch(choice)
		{
		case 1:
		{
			obj.CarEngine();
			break;
		}
		case 2:
		{
			obj.BikeEngine();
			break;
		}
		default:
		{
			System.out.print("Invalid Input");
			break;
		}
		}
	}
}
