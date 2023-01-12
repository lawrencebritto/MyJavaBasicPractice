public class AnonymousThread 
{
	public synchronized void loop()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(Thread.currentThread().getName()+" the value is :"+i);
		}
	}
	public static void main(String[] args)
	{
		final AnonymousThread an=new AnonymousThread();
		Thread obj=new Thread(new Runnable(){
			public void run()
			{
				an.loop();
			}
		});
		Thread obj1=new Thread(new Runnable(){
			public void run()
			{
				an.loop();
			}
		});
		Thread obj2=new Thread(new Runnable(){
			public void run()
			{
				an.loop();
			}
		});
		Thread obj3=new Thread(new Runnable(){
			public void run()
			{
				an.loop();
			}
		});
		obj.start();
		obj1.start();
		obj2.start();
		obj3.start();
	}
}
