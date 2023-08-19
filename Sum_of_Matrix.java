import java.util.*;
public class Sum_of_Matrix{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a row and column : ");
		int m = sc.nextInt();
		int n = sc.nextInt();
		int a[][] = new int[m][n];
		System.out.println("Enter a first Matrix : ");
		for (int i=0 ; i<m ; i++ ) {
			for (int j=0 ; j<n ; j++ ) {
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter a row and column : ");
		int p = sc.nextInt();
		int q = sc.nextInt();
		int b[][] = new int[p][q];
		System.out.println("Enter a second Matrix : ");
		for (int i=0 ; i<p ; i++ ) {
			for (int j=0 ; j<q ; j++ ) {
				b[i][j] = sc.nextInt();
			}
		}
		if (m==p && n==q) {
			int c[][] = new int[m][n];
			for (int i=0 ; i<m ; i++ ) {
				for (int j=0 ; j<n ; j++ ) {
					c[i][j] = a[i][j] + b[i][j];
				}
			}
			System.out.println("new matrix: ");

			for (int i=0 ; i<m ; i++ ) {
				for (int j=0 ; j<n ; j++ ) {
					System.out.print(c[i][j]+" ");
				}
				System.out.println();
			}
		}
	}
}