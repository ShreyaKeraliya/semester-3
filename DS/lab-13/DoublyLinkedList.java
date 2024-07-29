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
        public void insertAtFirstDLL(int data){
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
        public void insertAtLastDLL(int data){
            Node n = new Node(data);
            if(first == null){
                first = n;
            }
            else{
                Node save =first ; 
                while (save.rpter!= null) {
                    save = save.rpter;
                }
                n.lpter = save;
                n.rpter = null;
                n.lpter.rpter = n;
            }
        }
        public void insertInOrderCLL(int data,int P){
            Node n = new Node(data);
            Node save = first;
            if(P == 1){
                insertAtFirstDLL(data);
            }
            else{
                int currP = 1;
                while (save.rpter!= null && currP < P  ) {
                    save = save.rpter;
                    currP ++ ;
                }
                if(save.rpter == null){
                    insertAtLastDLL(data);
                }
                else{
                    n.rpter = save.rpter.lpter;
                    n.lpter = save.rpter;
                    save.rpter = n;
                    save.rpter.lpter = n;
                }
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
        Scanner sc = new Scanner(System.in);
        DLLoperations D = new DLLoperations();
        int x = sc.nextInt();
        while(x!=0){
            int y = sc.nextInt();
            System.out.println("enter 1 for insert at first , 2 for insert at last , 3 for insert at Position , 4 for display : ");
            if(y== 1){
                System.out.println("insert at first");
                int z = sc.nextInt();
                D.insertAtFirstDLL(z);
            }
            else if(y== 2){
                System.out.println("insert at last");
                int z = sc.nextInt();
                D.insertAtLastDLL(z);
            }
            else if(y== 3){
                System.out.println("insert at Position");
                int z = sc.nextInt();
                D.insertAtLastDLL(z);
            }
            else if(y== 4){
                D.display();  
            }  
            else {
                return;
            }
            x--;
    }
    
    }
}
