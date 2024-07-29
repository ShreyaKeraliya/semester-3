import java.util.Scanner;
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
	public LinkedList copy(){
		if(this.first==null){
			return this;
		}
		LinkedList l2=new LinkedList();
		Node temp=this.first;
		while(temp.link!=null){
			Node temp2=new Node(temp.data);
			if(l2.first==null){
				l2.first=temp2;
			}
			temp2.data=temp.data;
			temp2.link=temp.link;
			temp=temp.link;
			temp2=temp2.link;
		}
		return l2;
	}
}
public class Copy{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		char ch;
		System.out.println("Copy Linked List");
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
		LinkedList l2=l1.copy();
		System.out.print("\nCopied Linked List: ");
		l2.display();
	}
}