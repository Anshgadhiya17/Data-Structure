import java.util.*;


public class Linkedlist_Sort {

    public static void sortLink(Node head){
        Node p , temp;
        int b;
        p = head;
        while (p!=null) {
            temp = p.link;
            while (temp!=null) {
                if (p.info > temp.info) {
                    b = p.info;
                    p.info = temp.info;
                    temp.info = b;
                }
                temp = temp.link;
            }
             p = p.link;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size of linked list : ");
        int x =sc.nextInt();
        Node head = new Node();
        head = LinkedList.insert(head, x);
        LinkedList.travarsal(head);
        sortLink(head);
        LinkedList.travarsal(head);
    }
}
