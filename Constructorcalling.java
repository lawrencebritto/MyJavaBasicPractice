public class Constructorcalling extends Constructor 
{
	public void superexample()
	{
		System.out.println("The Name from super keyword                  :"+super.Sname);
		System.out.println("The Register Number from super keyword       :"+super.Sregisternumber);
	}
	public static void main(String[] args)
	{
		Constructor obj1=new Constructor("Program for Constructors");
		Constructorcalling obj2=new Constructorcalling();
		Constructor obj3=new Constructor("Syed Abuthahir",220261);
		obj2.superexample();
		Constructor obj4=new Constructor(obj1);
	}
}
