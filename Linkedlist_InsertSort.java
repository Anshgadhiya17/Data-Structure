import java.util.*;

public class Linkedlist_InsertSort {

    public static Node insertSort(Node head){
        Scanner sc = new Scanner(System.in);
        Node m , save , n;
        m = LinkedList.create();
        System.out.println("Enter a number : ");
        int x = sc.nextInt();
        m.info = x;
        if (head==null) {
            m.link = null;
            return m;
        }
        if (m.info <= head.info) {
            m.link = head;
            return m;
        }
        save = head;
        n = save.link;
        while (save.link!=null && m.info >= n.info) {
            save = save.link;
            n = save.link;
        }
        m.link = save.link;
        save.link = m;
        return head;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size of linked list : ");
        int x =sc.nextInt();
        Node head = new Node();
        head = LinkedList.insert(head , x);
        Sort.sortLink(head);
        head = insertSort(head);
        LinkedList.travarsal(head);
    }
}
