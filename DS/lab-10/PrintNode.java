import java.util.*;
public class PrintNode {
    class Node{
        int info;
        Node link;

        public Node(int data){
            this.info = data;
            this.link = null;
        }
    }
    Node first = null;

    public void insertNode(int data){
        Node n = new Node(data);
        first=n;
    }
    public void print(){
        System.out.println(first.info);
    }

    public static void main(String[] args) {
        PrintNode pn = new PrintNode();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the info of node:");
        int in = sc.nextInt();
        pn.insertNode(in);
        pn.print();
    }
    
}
