public class Amazon 
{
	 private int availablestock=50;
	 public synchronized void purchasestock(int request)
	 {
		 if(availablestock>request)
		 {
			 availablestock=availablestock-request;
			 System.out.println(Thread.currentThread().getName()+"\nPurchase successfull and available stock is :"+availablestock);
		 }else
		 {
			 System.out.println(Thread.currentThread().getName()+"\nSorry for your inconvenience,stock is unavailable currently "); 
			 try {
				wait();
				availablestock=availablestock-request;
				System.out.println(Thread.currentThread().getName()+"\nPurchase successfull and available stock is :"+availablestock);
			} catch (InterruptedException e) {
			}
		 }
	 }
	 public synchronized void addstock(int stock)
	 {
		 availablestock=availablestock+stock;
		 System.out.println(Thread.currentThread().getName()+"\nStock successfull added by the owner        :"+availablestock);
		 notifyAll();
	 }
}
