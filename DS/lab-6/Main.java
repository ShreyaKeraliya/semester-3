
import java.util.Scanner;

class Node {
    int info;
    Node link;
    public  Node(int data){
        this.info = info;
        this.link = null;
    }
}
 class LinkedList {
    Scanner sc =new Scanner(System.in);
    public Node first = null;
    public  void insertAtFirst(){
        int x= sc.nextInt();
        Node n = new Node(x);
        if (first==null){
            first = n;
        }
        else{
            n.link = first;
            first = n;
        }
    }
    public  void insertAtEnd(){
        int x= sc.nextInt();
        Node n1 = new Node(x);
        Node save = first;
        if (first==null){
            first = n1;
        }
        else{
            
            while(save.link!=null){
                save = save.link;
            }
            save.link = n1;
        }
    }
    public void display(){
        Node value;
        value = first;
        while(value.link!=null){
            System.out.println(value.info);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        LinkedList LL = new LinkedList();
        LL.insertAtFirst();
        LL.insertAtEnd();
        LL.display();
    }
}