import java.util.*;
class LinkedList{
	class Node{
		int data;
		Node link;
		public Node(int data){
			this.data=data;
			this.link=null;
		}
	}
	public Node first=null;
	public void add(int data){
		Node newNode=new Node(data);
		if(first==null){
			first=newNode;
			System.out.println("Inserted Successfully");
			return;
		}
		Node temp=first;
		first=newNode;
		first.link=temp;
		System.out.println("Inserted Successfully");
	}
	public void display(){
		Node temp=first;
		if(temp==null){
			System.out.print("Empty");
			return;
		}
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp=temp.link;
		}
	}
	public LinkedList swapConsecutive(){
		if(first==null){
			return this;
		}
		if(first.link==null){
			return this;
		}
		Node prev=first;
		Node temp=first.link;
		Node next=temp.link;
		first=first.link;
		while(next!=null&&next.link!=null){
			temp.link=prev;
			prev.link=next.link;
			prev=next;
			temp=next.link;
			next=temp.link;
		}
		temp.link=prev;
		prev.link=next;
		return this;
	}
}
public class SwapConsecutive{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		char ch;
		System.out.println("Swap Consecutive Elements in Linked List");
		LinkedList l1=new LinkedList();
		int n;
		do{
			System.out.print("Enter a number to insert or -1 to exit: ");
			n=sc.nextInt();
			if(n==-1){
				break;
			}
			l1.add(n);
		}while(n!=-1);
		System.out.print("Linked List: ");
		l1.display();
		LinkedList l2=l1.swapConsecutive();
		System.out.print("\nLinked List with Swapped Elements: ");
		l2.display();
	}
}