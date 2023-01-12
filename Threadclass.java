
import java.io.*;
public class Threadclass extends Thread
{
	public void run()
	{
		for(int i=0;i<3;i++)
		{
			System.out.println("Name of "+Thread.currentThread().getName()+" value of - "+i);
		}
	}
	public static void main(String[] args) throws Exception
	{
		Threadclass obj=new Threadclass();
		obj.start();
		Threadclass obj1=new Threadclass();
		obj1.start();
		Threadclass obj2=new Threadclass();
		obj2.start();
		Threadclass obj3=new Threadclass();
		obj3.start();
	}
}
