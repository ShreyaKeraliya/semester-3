import java.util.*;
class Node{
    int data;
    Node link;
    public Node(int data){
        this.data = data;
    }
}
class Cir_ins_operation{
    Node first,last;
    public void insertAtFirstCLL(int data){
        Node n = new Node(data);
        if(first==null){
            n.link = n;
            first = n;
            last = n;
        }else{
            n.link = first;
            last.link = n;
            first = n;
        }
    }
    public void insertInOrderCLL(int data){
        Node n = new Node(data);
        Node save = first;
        if(first==null){
            n.link = n;
            first = n;
            last = n;
            return;
        }
        if(n.data<=first.data){
            n.link = first;
            last.link = n;
            first = n;
            return;
        }
        else{
            while((save!=last)&&(n.data>=save.link.data)){
                save = save.link;
            }
            n.link = save.link;
            save.link = n;
            if(save==last){
                last = n;
            }
        }
    }

    public void insertAtLastCLL(int data){
        Node n = new Node(data);
        if(first==null){
            n.link = n;
            first = n;
            last = n;
        }else{
            n.link = first;
            last.link = n;
            last = n;
        }
    }
    public void display(){
        Node temp = first;
        do{
            System.out.println(temp.data+" ");
            temp = temp.link;
        }
        while(temp!=first);
    }

    public void deleteNodeCLL(int data) {
        if (first == null) {
            System.out.println("Circular Linked List is empty");
        } else {
            Node save = first;
            Node temp = null;
            boolean found = false;
            while (true) {
                if (save.data == data) {
                    found = true;
                    break;
                }
                temp = save;
                save = save.link;
                if (save == first) {
                    break;
                }
            }
            if (!found) {
                System.out.println("Node not found!");
            } else {
                if (first == last) {
                    first = last = null;
                } else if (save == first) {
                    first = first.link;
                    last.link = first;
                } else {
                    temp.link = save.link;
                    if (save == last) {
                        last = temp;
                    }
                }
            }
        }
    }
    
}

 
       
        public class CLLOperations {
            public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            Cir_ins_operation c = new Cir_ins_operation();
            int x = sc.nextInt();
            while(x!=0){
                int y = sc.nextInt();
                if(y== 1){
                    System.out.println("insert at first");
                    int z = sc.nextInt();
                    c.insertAtFirstCLL(z);
                }
                else if(y== 2){
                    System.out.println("insert at last");
                    int z = sc.nextInt();
                    c.insertAtLastCLL(z);
                }
                else if(y== 3){
                    System.out.println("insert at any position");
                    int z = sc.nextInt();
                    c.insertInOrderCLL(z);
                }
                else if(y== 4){
                    System.out.println("Circular LinkedList display");
                    c.display();
                }
                else if(y== 5){
                    System.out.println("Delete A Node In Circular LinkedList");
                    int z = sc.nextInt();
                    c.deleteNodeCLL(z);
                }
                else {
                    return;
                }
                x--;
            }
        }
    }