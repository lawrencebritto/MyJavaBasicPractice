import java.util.*;
class TestException {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int z=0;
System.out.println("1.multi catch \t 2.rithmetic Exception \t 3.User defined exception");
       while(z==0)
       {
           System.out.println("Enter the option:");
           int option=sc.nextInt();
           
           switch(option)
           {
               case 1:
 System.out.println("1.MULTIPLECATCH BLOCK\n");
           try{    
                int a[]=new int[5];    
                a[5]=30/0;    
               }    
               catch(ArithmeticException e)  
                  {  
    System.out.println("Arithmetic Exception occurs");  
                  }    
               catch(ArrayIndexOutOfBoundsException e)  
                  {  
System.out.println("ArrayIndexOutOfBounds Exception occurs");  
                  }    
               catch(Exception e)  
                  {  
                   System.out.println("Parent Exception occurs");  
                  }             
                   break;
                   case 2:
System.out.println("2.ARRAY INDEX OUT OFBOUNDS EXCEPTION");
                         try{    
                int a[]=new int[5];    
                System.out.println(a[10]);  
               }    
               catch(ArrayIndexOutOfBoundsException e)  
                  {  
                   System.out.println("ArrayIndexOutOfBounds Exception occurs");  
                  }    
               break;
               case 3:
 System.out.println("USER DEFINED EXCEPTIONS");
                   try{
		System.out.println("Starting of try block");
		throw new SampleException("This is My error Message");
	}
	catch(SampleException exp){
		System.out.println("Catch Block") ;
		System.out.println(exp) ;
	}
      break;
      default:
      System.out.println("Invalid option!!");
           }
           System.out.println("continue 0 or not 1?");
           z=sc.nextInt();
       }
       System.out.println("Exit");
    }
}
