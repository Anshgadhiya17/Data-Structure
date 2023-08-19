import java.util.*;
public class LinkedList{
	public static void main(String[] args) {
	LinkedList l1 = new LinkedList();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.insertFirst(50);
		l1.insertFirst(60);
		l1.insertFirst(70);
		l1.deleteFirst();
		l1.insertLast(100);
		l1.insertLast(200);
		l1.deleteSpecified(60);
		l1.display();
		

	}
}
class Node{
	int info;
	Node link;
	Node(int data){
		this.info = data;
		this.link = null;
	}
}

class LinkedList{
	Node first;

	public void add(int num){
		Node newnode = new Node(num);
		if (first == null) {
			first = newnode;
		}else{
			Node temp = first;
			while(temp.link!=null){
				temp = temp.link;
			}
			temp.link = newnode;
		}
	}


	public void insertFirst(int number){
		Node newnode = new Node(number);
		if(first==null){
			first.info=newnode.info;
			first.link=null;
			System.out.println("null");
		}
		newnode.info=number;
		newnode.link=first;
		first=newnode;
}
	

	public void deleteFirst(){
		first=first.link;

	}

	public void insertLast(int number1){
		Node newnode = new Node(number1);
		Node save=first;
		while(save.link!=null){
			save=save.link;
		}
		newnode.info=number1;
		save.link=newnode;
		newnode.link=null;
	}
	public void deleteLast(){
		Node save=first.link;
		while(save!=null){
			save=save.link;
		}
		save=null;
	}

	public int deleteSpecified(int x){
		Node temp = first;
		if(x==first.info){
			first=first.link;
		}
		else{
				while(temp.link.info!=x){
						temp=temp.link;
				}
				temp.link=temp.link.link;
			}	
		return 0;
	}
	public void display(){
		Node temp = first;
		while(temp.link!=null){
			System.out.println(temp.info);
			System.out.println(temp.link);
			temp = temp.link;
			
		}
		System.out.println(temp.info);
		System.out.println(temp.link);
	}

}