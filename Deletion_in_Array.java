
import java.util.Scanner;

public class Deletion_in_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array :");
        int n = sc.nextInt();
        int arr[] = new int [n];
        
        for(int i=0;i<n;i++){
            System.out.println("enter elements:");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter index you want delete");
        int a = sc.nextInt();

        int temp=0;
        for(int i=a;i<n-1;i++){
             temp = arr[i+1];
             arr[i] = temp;  
        }

        for(int i=0;i<n-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
}