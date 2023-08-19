import java.util.*;
public class Queue_using_Linkedlist {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        QueueLL ll = new QueueLL();
        int data=0;
        int val;
        while(true){
            System.out.println("1 -> Enqueue\n2 -> Dequeue\n3 -> display");
            val = sc.nextInt();
            switch(val){
                case 1:
                        System.out.println("Enter number to insert : ");
                        data = sc.nextInt();
                        ll.Enqueue(data);
                    break;
                case 2:
                    ll.dequeue();
                break;
                case 3:
                ll.display();
                break;
            }
        }
    }

    class node{
        int data;
        node link;
        node(int data){
            this.data=data;
            this.link=null;
        }
    }
    
    node head;
    public QueueLL(){
        head = null;
    }

    public void Enqueue(int data){
        node newNode = new node(data);

        if(head == null){
            head = newNode;
        }else{
            node save = head;
            while(save.link!=null){
                save=save.link;
            }
            save.link=newNode;
            save=newNode;
        }
    }

    public void dequeue(){
        node save = head;
        if(head == null){
          System.out.println("linked list is empty");
        }
        else if(save.link==null){
            head=null;
            System.out.println("NOW LINKED LIST IS EMPTY");
        }
        else{
            head=head.link;
        }
    }

    public void display(){
        node save=head;
        while(save!=null){
            System.out.print(save.data+" -- ");
            save=save.link;
        }
        
        System.out.println("null");
    }
}