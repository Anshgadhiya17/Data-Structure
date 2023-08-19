import java.util.Scanner;

public class Circularly_Linkedlist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CLLall ll = new CLLall();
        int data=0;
        while(true){
            System.out.println("1 --> addlast\n2 --> addfirst\n3 --> deletelast\n4 --> deletefirst\n5 --> deletewherever\n6 --> Display");
            data = sc.nextInt();

            switch(data){

                case 1:
                    System.out.println("Enter element to Insert at last");
                    data = sc.nextInt();
                    ll.addlast(data);
                break;

                case 2:
                    System.out.println("Enter element to Insert at first");
                    data = sc.nextInt();
                    ll.addfirst(data);
                break;

                case 3:
                    ll.deletelast();
                break;
                case 4:
                    ll.deletefirst();
                break;
                case 5:
                    System.out.println("Enter element to dalete that element");
                    data = sc.nextInt();
                    ll.delete(data);
                break;

                case 6:
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
    public CLLall(){
        head = null;
    }
    public void addlast(int data){
        node newNode = new node(data);

        if(head == null){
            head = newNode;
            newNode.link = head;
        }else{
            node save = head;
            while(save.link!=head){
                save=save.link;
            }
            save.link=newNode;
            newNode.link = head;
        }
    }

    public void addfirst(int data){
        node newNode = new node(data);

        node save = head;
        if(head == null){
            head = newNode;
            newNode.link = head;
        }else{
            while(save.link!=head){
                save=save.link;
            }
            newNode.link=head;
            head=newNode;
            save.link = head;
        }
    }
    
    public void deletelast(){
        node save = head;
        if(save == null){
          System.out.println("linked list is empty");
        }
        else if(save.link==head){
            head=null;
            System.out.println(":NOW LINKED LIST IS EMPTY");
        }
        else{
           node prece = save;
           while(save.link!=head){
            prece=save;
            save=save.link;
           }
           prece.link=head;
        }
    }
    public void deletefirst(){
        node save = head;
        if(head == null){
          System.out.println("linked list is empty");
        }
        else if(save.link==head){
            head=null;
            System.out.println("NOW LINKED LIST IS EMPTY");
        }
        else{
            while(save.link!=head){
                save=save.link;
            }
            save.link = head.link;
            head = head.link;
        }
    }
    public void delete(int x){
        node save = head;
        if(head == null){
            System.out.println("linked list is empty");
        }
        else if(save.link==head && save.data==x){
            head=null;
            System.out.println(" NOW LINKED LIST IS EMPTY");
        }
        else if(x==save.data){
            while(save.link!=head){
                save=save.link;
            }
            save.link = head.link;
            head = head.link;
        }
        else{
            node prece = head;
            while(x!=save.data && save.link!=head){
                prece = save;
                save=save.link;
            }
            if(x!=save.data){
                System.out.println("element not found");
            }else{
                prece.link=save.link;
            }
        }
    }
    public void display(){
        node save = head;
        while(save.link!=head){
            System.out.print(save.data+" --> ");
            save=save.link;
        }

        System.out.print(save.data+" --> ");
        System.out.print(save.link.data+"(head node)");
        System.out.println();
    }

}