import java.util.*;
public class Swap_two_numbers{
	public static void swap(int a,int b){
		int temp = a;
		a = b;
		b = temp;
		System.out.println("New value of a : "+a);
		System.out.println("New value of b : "+b);

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of a : ");
		int a = sc.nextInt();
		System.out.println("Enter value of b : ");
		int b = sc.nextInt();
		Swap.swap(a,b);
	}
}