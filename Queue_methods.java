import java.util.*;
public class Queue_methods{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size: ");
		int n=sc.nextInt();
		Queue q1 = new Queue(n);
		while(true){
			System.out.println("1 for enqueue and 2 for dequeue:");
		    int a=sc.nextInt();
		    switch(a){
		    	case 1:
		    		System.out.println("element to insert:");
		    		int y=sc.nextInt();
		    		q1.enqueue(y);
		    		for (int i=0;i<n;i++) {
		    			System.out.print(q1.que[i]+" ");
		    		}
		    		break;
	    		case 2:
		    		int delete=q1.dequeue();
		    		System.out.println("deleted element: "+delete);
		    		break;
		    }
		}

	}
}
class Queue{
	int front=-1,rear=-1;
	int que[];
	Queue(int size){
		que = new int[size]; 
	}
	 void enqueue(int y){
	 	rear=rear+1;
		if(rear>=que.length){
			System.out.println("queue overflow");
			rear=rear-1;
			return;
		}
		else{
			que[rear]=y;
			
		}
		if(front==-1){
			front=0;
		}

	}
	 int dequeue(){
		if(front==-1){
			System.out.println("underflow:");
			return 0;
		}

		int y=que[front];
		que[front]=0;
		
		if(front==rear){
			front=-1;
			rear=-1;
		}
		else {
			front++;
		}

		return y;
	}
}