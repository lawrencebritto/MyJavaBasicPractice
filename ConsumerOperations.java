public class ConsumerOperations {

	public static Consumer searchid(Consumer[] Consumerarr,int id)
	{
		for(Consumer element:Consumerarr)
		{
			if(element.getId()==id)
			{
				return element;
			}
		}
		return null;
	}
	public static Consumer updateid(Consumer[] Consumerarr,Consumer obj)
	{
		for(Consumer element:Consumerarr)
		{
			if(element.getId()==obj.getId())
			{
				element.setId(obj.getId());
				element.setName(obj.getName());
				element.setDept(obj.getDept());
				return element;
			}
		}
		return null;
	}
	public static Consumer[] grouping(Consumer[] Consumerarr,String dept)
	{
		int count=0,element=0;
		for(Consumer loopobj:Consumerarr)
		{
			if(loopobj.getDept()==dept)
			{
				count++;
			}
		}
		if(count!=0)
		{
		Consumer[] arr=new Consumer[count];
		for(Consumer loopobj:Consumerarr)
		{
			if(loopobj.getDept()==dept)
			{
				arr[element]=loopobj;
				element++;
			}
		}
		return arr;
		}
		return null;
	}
	public static void main(String args[])
	{
		Consumer obj=new Consumer(100,"law","mca");
		Consumer obj1=new Consumer(101,"bri","mba");
		Consumer obj2=new Consumer(102,"syed","mca");
		Consumer obj3=new Consumer(103,"kicha","mba");
		Consumer obj4=new Consumer(104,"pacha","mca");
		
		Consumer[] Consumerarr= new Consumer[]{obj,obj1,obj2,obj3,obj4};
		
		Consumer id=searchid(Consumerarr,102);
		if(id!=null)
		{
			System.out.println(id.getId()+" "+id.getName()+" "+id.getDept());
		}else
		{
			System.out.println("Element not found");
		}
		Consumer obj5=new Consumer(103,"vettukilli","mba");
		Consumer update=updateid(Consumerarr,obj5);
		if(update!=null)
		{
			System.out.println(update.getId()+" "+update.getName()+" "+update.getDept());
		}else
		{
			System.out.println("Element not found");
		}
		Consumer[] groupbydept=grouping(Consumerarr,"mba");
		for(Consumer elements:groupbydept)
		{
			System.out.println(elements.getId()+" "+elements.getName()+" "+elements.getDept());
		}
	}
}
