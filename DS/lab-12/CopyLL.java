import java.util.*;
class LL{
    class Node{
        int info;
        Node link;
        public Node(int data){
            this.info = data;
            this.link = null;
        }
    }
    Node first = null;
    Node begin = null;
    public void insert(int data){
        Node n = new Node(data);
        if(first==null){
            first=n;
        }else{
            n.link = first;
            first = n;
        }
    }
     public void copyLL(){
        Node save = first;
        while (save.link!=null) {
            Node newNode = new Node(save.info);
            if(begin==null){
                begin = newNode;
            }
            else{
                Node save1 = begin;
                save1.link = newNode;
                save1 = newNode;
            }
            save = save.link;            
        }
        System.out.println("ll is copied");
     }
     public void display(){
        while(first!=null){
            System.out.print(first.info+" ");
            first = first.link;
        }
        System.out.println();
}
}
public class CopyLL{
    public static void main(String[] args) {
        LL l = new LL();
        while (true) {
        System.out.println("Enter 1 to insert node in ll");
        System.out.println("Enter 2 to copy the linked list");
        System.out.println("Enter 3 to display");
        System.out.println("Enter 4 for exit");
        Scanner sc = new Scanner(System.in);
        int o =sc.nextInt();
        if(o==1){
            int x = sc.nextInt();
            l.insert(x);
        }
        if(o==2){
            l.copyLL();
        }
        if(o==3){
            l.display();
        }
        if (o==4) {
            break;
        }
        }
    }
}