import java.util.*;
public class Doubly_LinkedList{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LinkedList l1=new LinkedList();
		int data;
		while(true){
            System.out.println("1 --> addlast\n2 --> addfirst\n3 --> deletelast\n4 --> deletefirst\n5 --> deletewherever\n6 --> Display");
            data = sc.nextInt();

            switch(data){

                case 1:
                    System.out.println("Enter element to Insert at last");
                    data = sc.nextInt();
                    l1.addlast(data);
                break;

                case 2:
                    System.out.println("Enter element to Insert at first");
                    data = sc.nextInt();
                    l1.addfirst(data);
                break;

                case 3:
                    l1.deletelast();
                break;
                case 4:
                    l1.deletefirst();
                break;
                case 5:
                    System.out.println("Enter element to dalete that element");
                    data = sc.nextInt();
                    l1.delete(data);
                break;

                case 6:
                   l1.display();
                break;

            }
        }
	}
}
class Node{
	int data;
	Node lptr;
	Node rptr;
	// Node l;
	// Node r;
	Node(int data){
		this.data=data;
		this.lptr=null;
		this.rptr=null;
		// this.l=null;
		// this.r=null;

	}
}
class LinkedList{
	Node first;

	public void addfirst(int data){
		Node newnode = new Node(data);
		if(first==null){
			first=newnode;
			newnode.lptr=null;
			newnode.rptr=null;
		}
		else{
			newnode.rptr=first;
			newnode.lptr=null;
			first.lptr=newnode;
			first=newnode;
			// l=newnode;
		}

	}
	public void addlast(int data){
		Node newnode = new Node(data);
		Node save=first;
		if(first==null){
			first=newnode;
			newnode.lptr=null;
			newnode.rptr=null;
		}
		else{
			while(save.rptr!=null){
				save=save.rptr;
			}
				newnode.lptr=save;
			    newnode.rptr=null;
			    save.rptr=newnode;
			    save=newnode;
		}
    }

    public void deletefirst(){
    	Node save=first;
    	if(save==null){
			System.out.println("empty");
		}
		else if(save.rptr==null){
			first=null;
			System.out.println("now it is empty");
		}
		first=first.rptr;
		first.lptr=null;
    }

    public void deletelast(){
		Node save=first;
		if(save==null){
			System.out.println("empty");
		}
		else if(save.rptr==null){
			first=null;
			System.out.println("now it is empty");
		}
		else{
			Node prec=save;
			while(save.rptr!=null){
				prec=save;
				save=save.rptr;
			}
			prec.rptr=null;
		}

	}

	public void delete(int x){
		Node save=first;
		// Node prec=save;
		if(save==null){
			System.out.println("empty");
		}

		else if(x==first.data){
			first=first.rptr;
			// System.out.println("now it is empty");
		}
		else{
			while(save!=null){
			
			if(x==save.data){
				if(save.rptr==null){
					// System.out.println("hello");
					save.lptr.rptr=null;
					save.lptr=null;
				}
				else{
				save.lptr.rptr=save.rptr;
				save.rptr=save.lptr;
				
				}
				break;
				
			}
		save=save.rptr;

		}

	}
		
}
	public void display(){
        Node temp = first;
        while(temp!=null){
            System.out.println(temp.data);
            System.out.println(temp.rptr);
            temp=temp.rptr;
        }

        // System.out.println(temp.data);
        // System.out.println(temp.rptr);
        System.out.println();
    }
}