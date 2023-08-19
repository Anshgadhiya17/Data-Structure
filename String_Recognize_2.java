import java.util.*;
import java.io.*;

public class String_Recognize_2{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str = sc.nextLine();
		int ans = Str.rev(str);
		if (ans == 1) {
			System.out.println("Valid");
		}
		else{
			System.out.println("Not Valid");
		}
	}
	public static int rev(String str){
		Stack<Character> s = new Stack<>();
		int n = str.length();
		System.out.println(s.isEmpty());
		
		int i = 0;
		char next = str.charAt(0);
		while(next!='c'){
			s.push(next);
			i++;
			next = str.charAt(i);
			if (next==' '){
				return 0;
			}
		}
		System.out.println(s);
		char x ;
		while(!s.isEmpty()){
			i++;
			next = str.charAt(i);
			//System.out.println(next);
			x = s.pop();
			//System.out.println(x);
			if (next!=x) {
				return 0;
			}
		}
		next = str.charAt(i+1);
		if (next==' ') {
			return 1;
		}
		else{
			return 0;
		}
	}
}