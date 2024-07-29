import java.util.Scanner;

class Node {
    int data;
    Node link;

    Node(int data) {
        this.data = data;
        this.link = null;
    }
}

class LinkedList {
    Node head;
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
    public void sort(){
        Node save = first;
        Node temp1 = null;
        Node temp2 = null;
        while(save!=null){
            temp1 = save;
            temp2 = save.link;
            while (temp2!=null) {
                if(temp2.data < temp1.data){
                    int temp3 = temp1.data;
                    temp1.data = temp2.data;
                    temp2.data = temp3;
                }
                temp2 = temp2.link;
            }
            save = save.link;
        }
    }
    // void removeDuplicates() {
    //     Node current = head;
    //     while (current != null && current.link != null) {
    //         if (current.data == current.link.data) {
    //             current.link = current.link.link;
    //         } else {
    //             current = current.link;
    //         }
    //     }
    // }
    public void removeDup(){
        Node save = first,temp=null;
        while(save!=null){
            temp=save.link;
            while (temp!=null) {
                if(save.data == temp.data){
                    save.link = temp.link;
                }
                temp = temp.link;
            }
            save = save.link;
        }
    }
    
    public void display(){
        while(first!=null){
            System.out.print(first.data+"~>");
            first = first.link;
        }
        System.out.println();
    }
}

public class RemoveDuplicates {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the list: ");
        int x = sc.nextInt();
        while (x!=0) {
            System.out.println("Enter the element: ");
            int y = sc.nextInt();
            list.insert(y);
            x--;  
        }
        list.sort();

        list.removeDup();

        System.out.print("List after removing duplicates: ");
        list.display();
    }
}