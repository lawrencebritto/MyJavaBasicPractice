public class Threadinterface implements Runnable
{
	public void run()
	{
		for(int i=0;i<3;i++)
		{
			System.out.println("Name of "+Thread.currentThread().getName()+" value of - "+i);
		}
	}
	public static void main(String[] args)
	{
		Threadinterface obj=new Threadinterface();//runnable object
		Thread tobj=new Thread(obj);//This is thread object 
		tobj.start();//which start is used to call method
		Threadinterface obj1=new Threadinterface();
		Thread tobj1=new Thread(obj1);
		tobj1.start();
		Threadinterface obj2=new Threadinterface();
		Thread tobj2=new Thread(obj2);
		tobj2.start();
		Threadinterface obj3=new Threadinterface();
		Thread tobj3=new Thread(obj3); 
		tobj3.start();
	}
}
