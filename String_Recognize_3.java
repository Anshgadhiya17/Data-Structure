import java.util.*;

public class String_Recognize_3{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter str");
		String str = sc.nextLine();
		int ans = ab.check(str);

		if(ans==1){
				System.out.println("valid");
		}
		else{
				System.out.println("not valid");
		}

	}
	public static int check(String str){
		Stack<Character> s = new Stack<>();
		int n = str.length();
		int i = 0;
		char next;
		while(i<n){
			next = str.charAt(i);
			s.push(next);
			i++;
		}
		int a=0;
		int b=0;
		char x;
		while(!s.isEmpty()){
			x=s.pop();
			if(x=='a'){
				a++;
			}
			else if(x=='b'){
				b++;
			}
			else{
				return 0;
			}

		}
		if(a==b){
			return 1;
		}
		else{
			return 0;
		}
	}
}