import java.util.*;
public class Student_details{
	public static void main(String[] args) {
		Stu[] s= new Stu[5];
		for (int i=0 ; i<5 ; i++ ) {
			s[i] = new Stu();
			s[i].getDetail();
			s[i].printDetail();
		}
	}
}
class Stu{
	int en;
	String name;
	int sem;
	double cpi;
	public void getDetail(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Enrollment No : ");
		this.en = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter a name : ");
		this.name = sc.nextLine();
		System.out.println("Enter a sem : ");
		this.sem = sc.nextInt();
		System.out.println("Enter a CPI : ");
		this.cpi = sc.nextDouble();
	}
	public void printDetail(){
		System.out.println("Enrollment No : "+this.en);
		System.out.println("Name : "+this.name);
		System.out.println("Semester : "+this.sem);
		System.out.println("CPI : "+this.cpi);
	}
}