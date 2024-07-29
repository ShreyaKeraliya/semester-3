import java.util.*;
class LL{
class Node{
    int info;
    Node link;

    public Node(int data){
        this.info=data;
        this.link=null;
    }
}
    public Node first=null;
    public void insertAtFirst(int data){
        Node n = new Node(data);
        if(first==null){
            first = n;
        }
        else{
            n.link = first;
            first = n;
        }
    }
    public void insertAtEnd(int data){
        Node n1 = new Node(data);
        if(first==null){
            first=n1;
        }else{
            Node save = first;
            while(save.link!=null){
                save = save.link;
            }
            save.link = n1;
        }
    }

    public void insertAtOrd(int data){
        Node n2 = new Node(data);
        if(first==null){
            first =  n2;
        }
        if(n2.info<=first.info){
            n2.link=first;
            first=n2;
        }
        Node save=first;
        while(save.link!=null && n2.info>=save.link.info){
            save=save.link;
        }
        n2.link=save.link;
        save=n2;
    }
    public void delete(int data){
        if(first==null){
            System.out.println("List is empty");
        }
        else{
            Node save=first;
            Node pred=null;
            while(save.info!=data || save.link!=null){
                pred=save;
                save = save.link;
            }
            if (save.info!=data) {
                System.out.println("The data to be deleted does not exist");
            }if (save.info==data) {
                save=save.link;
                pred.link=save.link;
            }
        }
    }

    public void deleteLast(){
        if(first==null){
            System.out.println("List is empty");
        }
        else{
            Node save = first;
            Node pred = null;
            while(save.link!=null){
                save = save.link;
                
            }
            pred = save;
            pred.link=null;
        }
        System.out.println("last element is deleted");
        display();
    }
    public void display(){
        Node value = first;
        System.out.println("Linked List:");
        while(value!=null){
            
            System.out.print(value.info+"->");
            value=value.link;
        }
        System.out.println("null");
    }
    
}
public class LinkedList{
    public static void main(String[] args) {
        LL ll = new LL();
        boolean flag=true;
        while (true) {
            System.out.println("Enter 1 for insertion at first position:");
            System.out.println("Enter 2 for insertion at last position:");
            System.out.println("Enter 3 for insertion in ordered list:");
            System.out.println("Enter 4 for deletion of element:");
            System.out.println("Enter 5 for display of linked list:");
            System.out.println("Enter 6 for break");
            System.out.println("Enter 7 for delete at last");
            Scanner sc = new Scanner(System.in);
            int o = sc.nextInt();
            if(o==1){
                System.out.println("Enter the element to be insertrd at first:");
                int x = sc.nextInt();
                ll.insertAtFirst(x);
            }
            if(o==2){
                System.out.println("Enter the element to be insertrd at last:");
                int x = sc.nextInt();
                ll.insertAtEnd(x);
            }
            if(o==3){
                System.out.println("Enter the element to be insertrd in ordered in list:");
                int x = sc.nextInt();
               ll.insertAtOrd(x);
            }
            if(o==4){
                System.out.println("Enter the element to be deleted:");
                int x = sc.nextInt();
                ll.delete(x);
            }
            if(o==5){
                ll.display();
            }
            if(o==6){
                flag=false;
                break;
            }
            if(o==7){
                ll.deleteLast();
            }
        }
    }
}