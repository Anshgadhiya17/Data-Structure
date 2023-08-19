import java.util.*;

public class Linkedlist_Insert {

    public static Node insertHead(Node head) {
        Scanner sc = new Scanner(System.in);
        Node n = LinkedList.create();
        System.out.println("Enter a number : ");
        int x = sc.nextInt();
        n.info = x;
        n.link = head;
        head = n;
        return head;
    }

    public static Node insertEnd(Node head){
        Scanner sc = new Scanner(System.in);
        Node n;
        n = LinkedList.create();
        System.out.println("Enter a element : ");
        int y = sc.nextInt();
        n.info = y;
        Node m = head;
        while(m.link!=null){
            m = m.link;
        }
        m.link = n;
        n.link = null;
        return head;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size of linked list : ");
        int x = sc.nextInt();
        Node head = new Node();
        head = LinkedList.insert(head, x);
        int z = 0;
        while (z != 1) {
            System.out.println("Enter 1 for insert in head \n Enter 2 for insert on end \n Enter 3 for break : ");
            int a = sc.nextInt();
            switch (a) {
                case 1:
                    head = insertHead(head);
                    break;
                case 2:
                    head = insertEnd(head);
                    break;
                case 3:
                    z++;
                    break;
            }
        }
        LinkedList.travarsal(head);
    }
}