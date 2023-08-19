import java.util.Scanner;

public class Insert_in_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n :");
        int n = sc.nextInt();
        int arr[] = new int [n+1];
        
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter index and element you want to place :");
        int a = sc.nextInt();
        int x = sc.nextInt();
        

        
        int temp=0;
        for(int i=a;i<n+1;i++){
            temp = arr[i];
            arr[i] = x;
            x = temp;
        }

        for(int i=0;i<n+1;i++){
            System.out.print(arr[i]+" ");
        }
    }
}