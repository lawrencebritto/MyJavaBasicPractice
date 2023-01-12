import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;
public class Collection
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("1-ArrayList\n2-LinkedList\n3-Vector\n4-SortedSet\n5-Set\n6-Stack\n7-Queue:");
		int choose=obj.nextInt();
		switch(choose)
		{
		case 1:
		{
			ArrayList<Integer>num= new ArrayList<Integer>();
			num.add(12);
			num.add(29);
			num.add(42);
			num.add(15);
			num.add(21);
			num.add(30);
			Iterator<Integer>iteratorobj=num.iterator();
			while(iteratorobj.hasNext())
			{
				Integer mod=iteratorobj.next();
				if(mod%2==0)
				{
					iteratorobj.remove();
				}
			}
			System.out.print("ArrayList "+num);
			break;
		}
		case 2:
		{
			LinkedList<String> str= new LinkedList<String>();
	        str.add(0,"Syed");
	        str.add(1,"is");
	        str.add(2,"good");
	        str.add(3,"boy");
	        System.out.println("Initial LinkedList " + str);
	        str.set(2, "bad");
	        System.out.println("Updated LinkedList " + str);
	        break;
		}
		case 3:
		{
			  Vector<Integer> v = new Vector<Integer>();
			  for (int i = 1; i <= 5; i++)
		        {
		            v.add(i);
		        }
		        System.out.println(v);
		        v.remove(3);
		        System.out.println("Vector "+v);
		        break;
		}
		case 4:
		{
			SortedSet<Character> ts= new TreeSet<Character>();
			ts.add('A');
	        ts.add('B');
	        ts.add('C');
	        ts.add('B');
	        ts.add('D');
	        ts.add('B');
	        ts.add('A');
	        ts.add('D');
	        System.out.println("Initial TreeSet " + ts);
	        ts.remove('D');
	        System.out.println("After removing element " + ts);
			break;
		}
		case 5:
		{
			 Set<Integer> hs = new HashSet<Integer>();
			 hs.add(34);
		     hs.add(23);
		     hs.add(45);
		     hs.add(12);
		     System.out.println("Set is " + hs);
		     Integer check =10;
		     System.out.println("If set Contains " + check + " : "+ hs.contains(check));
		     break;
		}
		case 6:
		{
			Stack<String> stack = new Stack<String>();
			stack.push("Students");
	        stack.push("are");
	        stack.push("good");
	        System.out.println("Initial Stack: " + stack);
	        System.out.println("Popped element: "+ stack.pop());
	        stack.push("not");
	        stack.push("always");
	        stack.push("good");
	        System.out.println("Stack after pop and push operation: "+ stack);
	        break;
		}
		case 7:
		{
	        Queue<Integer> q = new LinkedList<>();
	        for (int i = 0; i < 5; i++)
	        {
	            q.add(i);
	        }
	        System.out.println("Elements of queue "+ q);
	        q.remove();
	        System.out.println("Queue after removing"+ q);
	        int head = q.peek();
	        System.out.println("Top element "+ head);
	        int size = q.size();
	        System.out.println("Size of queue "+ size);
	        break;
		}
		default:
		{
			System.out.println("Invalid Input");
			break;
		}
		}
	}
}
