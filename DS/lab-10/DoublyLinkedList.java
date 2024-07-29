import java.util.*;


    class Node{
        int data;
        Node lpter;
        Node rpter;

        public Node(int data){
            this.data = data;
            this.lpter = null;
            this.rpter = null;
        }
    }
    class DLLoperations{
        Node first= null;
        public void insertAtFirstDLL(){
            Node n = new Node(data);
            if(first == null){
                first = n;
                n.lpter = null;
                n.rpter = null;
            }
            else{
                n.lpter = null;
                n.rpter = first;
                n.rpter.lpter = n;
                first = n;
            }
        }
        public void display(){
            Node save = first;
            while (save!=null) {
                System.out.println(save.data+"");
                save = save.rpter; 
            }
        }
    }


public class DoublyLinkedList {
    public static void main(String[] args) {
        DLLoperations D = new DLLoperations();
        D.insertAtFirstDLL(5);
        D.insertAtFirstDLL(15);
        D.insertAtFirstDLL(25);
        D.display();    
    }
    
}
