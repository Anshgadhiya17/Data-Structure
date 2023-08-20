import java.util.*;
public class StackLL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackLL ll = new StackLL();
        int data=0;
        int val;
        while(true){
            System.out.println("1 -> PUSH\n2 -> POP\n3 -> display");
            val = sc.nextInt();
            switch(val){
                case 1:
                        System.out.println("Enter number to insert : ");
                        data = sc.nextInt();
                        ll.PUSH(data);
                    break;
                case 2:
                    // System.out.println("Enter number to insert first :");
                    // data = sc.nextInt();
                    ll.POP();
                break;
                case 3:
                ll.display();
                break;
            }
        }
    }
    class Node{
        int data;
        Node link;
        Node(int data){
            this.data=data;
            this.link=null;
        }
    }
    Node top=null;  

    public void PUSH(int data){
        Node newnode=new Node(data);

        if(top==null){
            top=newnode;
        }else{
            newnode.link=top;
            top=newnode;
        }   
    }

    public void POP(){
        if(top==null){
            System.out.println("STACK UNDERFLOW");
        }else{
            top=top.link;
            // top.link=null;
        }
    }

    public void display(){
        Node save=top;
        while(save.link!=null){
            System.out.print(save.data+" -- ");
            save=save.link;
        }
        
        System.out.println("null");
    }
}