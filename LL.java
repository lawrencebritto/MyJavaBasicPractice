import java.util.*;
public class LL {
	LLnode head;
	LLnode insertInBeg(int key,LLnode head)
	{
		LLnode tmp=new LLnode(key);
		if(head==null)
		{
			head=tmp;
		}else
		{
			tmp.next=head;
			head=tmp;
		}
		return head;
	}
	LLnode insertInEnd(int key,LLnode head)
	{
		LLnode tmp=new LLnode(key);
		LLnode tmp1=head;
		if(tmp1==null)
		{
			head=tmp;
		}else
		{
			while(tmp1.next!=null)
			{
				tmp1=tmp1.next;
			}
			tmp1.next=tmp;
		}
		return head;
	}
	LLnode insertAtPos(int key,int pos,LLnode head)
	{
		LLnode tmp=new LLnode(key);
		LLnode tmp1=head;
		if(pos==1)
		{
			tmp.next=head;
			head=tmp;
		}else
		{
			for(int i=1;tmp1!=null&&i<pos;i++)
				tmp1=tmp1.next;
			tmp.next=tmp1.next;
			tmp1.next=tmp;
		}
		return head;
	}
	LLnode delete(int pos,LLnode head)
	{
		LLnode tmp=head;
		if(pos==1)
			head=tmp.next;
		else
		{
			for(int i=1;tmp!=null && i<pos-1;i++)
				tmp=tmp.next;
			tmp.next=tmp.next.next;
		}
		return head;
	}
	
	int length(LLnode head)
	{
		LLnode ttmp=head;
		int c=0;
		if(ttmp==null)
			return 0;
		else
		{
		 while(ttmp!=null)
			{	ttmp=ttmp.next;
				c++;
			}
		}
		return c;
	}
	
	
	LLnode reverse(LLnode head)
	{
		LLnode prevLNode=null,curLNode=head,nextLNode=null;
		while(curLNode!=null)
		{
			nextLNode=curLNode.next;
			curLNode.next=prevLNode;
			
			prevLNode=curLNode;
			curLNode=nextLNode;
		}
		
		head=prevLNode;
		return head;
	}
	
	
	void display(LLnode head)
	{
		LLnode ttmp=head;
		while(ttmp!=null)
			{System.out.print(ttmp.data+" ");
			 ttmp=ttmp.next;
			}
	}
	
	public static void main(String[] args)
	{
		LL l=new LL();
		l.head=null;
		Scanner in=new Scanner(System.in);
		 do
	{
 System.out.println("\n********* MENU *********");
	 System.out.println("\n1.Insert In End");
	 System.out.println("\n2.Insert In Beg");
	 System.out.println("\n3.Insert At A  Particular Pos");
	 System.out.println("\n4.Delete At a Pos");
	 System.out.println("\n5.Length");
	 System.out.println("\n6.Reverse");
	 System.out.println("\n7.Display");
	 System.out.println("\n8.EXIT");
	 System.out.println("\nenter ur choice : ");
	 int n=in.nextInt();
	 switch(n)
		{case 1: System.out.println("\nenter the value ");
			  l.head=l.insertInEnd(in.nextInt(),l.head);
			 break;
		 case 2: System.out.println("\nenter the value");
			 l.head=l.insertInBeg(in.nextInt(),l.head);
			 break;
		 case 3: System.out.println("\nenter the value");
			 l.head=l.insertAtPos(in.nextInt(),in.nextInt(),l.head);
			 break;
		 case 4: 
			 l.head=l.delete(in.nextInt(),l.head);
			 break;
		 case 5: 
			System.out.println(l.length(l.head));
			 break;
		 case 6: 
			 l.head=l.reverse(l.head);
			 break;
		 case 7: 
			l.display(l.head);
		 		 break;
		 case 8: System.exit(0);
		 		 break;
		 default: System.out.println("\n Wrong Choice!");
		 		  break;
		}
	 System.out.println("\n do u want to cont... ");
	}while(in.nextInt()==1);
 }
}

