import java.util.*;

class Queue {
    int n;
    int f;
    int r;
    int q[];

    public Queue(int n) {
        this.n = n;
        f = -1;
        r = -1;
        q = new int[n];
    }

    public void enqueue(int y) {
        if (r >= n) {
            System.out.println("Queue Overflow");
        } else {
            r = r + 1;
            q[r] = y;
        }
        if (f == -1) {
            f = f + 1;
        }
        System.out.println("Element is enqueued");
    }

    public void dequeue() {
        if (f == -1) {
            System.out.println("Queue Underflow");
        }
        int y = q[f];
        if (f == r) {
            f = r = -1;
        } else {
            f++;
        }
        System.out.println("Element" + " " + +y + "is dequeued");
    }

    public void display() {
        for (int i = f; i <= r; i++) {
            System.out.print(q[i] + " ");
        }
        System.out.println();
    }
}

public class Queue_Implement {
    public static void main(String[] args) {
        Queue qi = new Queue(5);
        System.out.println("Enter the element to be queued");
        boolean flag = true;
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        while (flag) {
            System.out.println("Enter 1 to enqueue:");
            System.out.println("Enter 2 to dequeue");
            System.out.println("Enter 3 to display");
            System.out.println("Enter 4 to exit");
            int o = sc.nextInt();
            if (o == 1) {
                int y = sc.nextInt();
                qi.enqueue(y);
            }
            if (o == 2) {
                qi.dequeue();
            }
            if (o == 3) {
                qi.display();
            }
            if (o == 4) {
                flag = false;
                break;
            }
        }

    }

}
