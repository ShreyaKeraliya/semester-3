import java.util.Scanner;
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
    public void insert(int data){
        Node n = new Node(data);
        if(first==null){
            first=n;
        }else{
            n.link = first;
            first = n;
        }
    }
    public void reverse(){
        if(first == null || first.link==null){
            return;
        }
        Node pred = first;
        Node save = first.link;
        while(save!=null){
            Node succ = save.link;
            save.link = pred;
            pred = save;
            save = succ;
        }
        first = pred;
        System.out.println("List is reversed");
    }
    public void display(){
       Node temp = first;
        while(temp!=null){
            System.out.print(temp.info+" ");
            temp = temp.link;
        }
        System.out.println();
}
}

public class ReverseLL {
    public static void main(String[] args) {
        LL l = new LL();
        while(true){
        System.out.println("Enter 1 to insert node in ll");
        System.out.println("Enter 2 reverse the ll");
        System.out.println("Enter 3 to display");
        System.out.println("Enter 4 to exit");
        Scanner sc = new Scanner(System.in);
        int o = sc.nextInt();
        if(o==1){
            int x = sc.nextInt();
            l.insert(x);
        }
        if (o==2) {
            l.reverse();
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
