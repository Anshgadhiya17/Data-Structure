import java.util.*;
public class Multiplication_of_Matrix{
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
		if (m==q && n==p) {
			int c[][] = new int[m][q];
			for (int i=0 ; i<m ; i++ ) {
				for (int j=0 ; j<q ; j++ ) {
					c[i][j] = 0;
					for (int k=0 ; k<n  ; k++ ) {
						c[i][j] += a[i][k]*b[k][j];
					}
				}
			}
			for (int i=0 ; i<m ; i++ ) {
				for (int j=0 ; j<q ; j++ ) {
					System.out.print(c[i][j]+" ");
				}
				System.out.println();
			}
		}
	}
}