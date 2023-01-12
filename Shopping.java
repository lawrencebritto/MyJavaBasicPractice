import java.text.SimpleDateFormat;
import java.util.Date;
public class Shopping 
{
	public static void main(String[] args)
	{
		Date dateobj=new Date();
		SimpleDateFormat formatobj=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		String dd=formatobj.format(dateobj);
		System.out.println("Date: "+dd);
		final Amazon token=new Amazon();
		Thread t1=new Thread(new Runnable() {
			public void run()
			{
				token.purchasestock(20);
			}
		});
		Thread t2=new Thread(new Runnable() {
			public void run()
			{
				token.purchasestock(20);
			}
		});
		Thread t3=new Thread(new Runnable() {
			public void run()
			{
				token.purchasestock(20);
			}
		});
		t1.setName("User1");
		t2.setName("User2");
		t3.setName("User3");
		t1.start();
		t2.start();
		t3.start();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		Thread t4=new Thread(new Runnable() {
			public void run()
			{
				token.addstock(100);
			}
		});
		t4.setName("Owner");
		t4.start();
	}
}

