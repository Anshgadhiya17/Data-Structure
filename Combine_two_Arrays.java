import java.util.*;
public class Combine_two_Arrays{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter n1 :");
        int n1 = sc.nextInt();
        int a1[] = new int [n1];


        System.out.println("Enter n2 :");
        int n2 = sc.nextInt();
        int a2[] = new int [n2];
    	for(int i=0;i<n1;i++){
            a1[i] = sc.nextInt();
    	}

    	for(int i=0;i<n2;i++){
            a2[i] = sc.nextInt();
    	}

    	int n=n1+n2;
    	int b[]=new int[n];
    	 for(int i=0;i<n1;i++){
    	 	b[i]=a1[i];
    	 }
    	 for(int i=0;i<n2;i++){
    	 	b[i+n1]=a2[i];
    	 }
    	 for(int i=0;i<n;i++){
    	 	System.out.print(b[i]+" ");
    	 }



	}
}