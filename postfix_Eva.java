import java.util.*;
public class postfix_Eva {
    public static void main(String[] args){
        Stack<Integer> stack= new Stack<>();
        String str = "546+*493/+*";
        int ans=0;
        for(int i=0;i<str.length();i++){
            char temp = str.charAt(i);
            if(Character.isLetterOrDigit(temp)){
                stack.push(Character.getNumericValue(temp));
            }else{
                if(stack.size()==1){
                    System.out.println("error");
                    return;
                }
                int v2 = stack.pop();
                int v1 = stack.pop();
                if(temp=='+')  ans = (v1+v2);
                if(temp=='-')  ans = (v1-v2);
                if(temp=='*')  ans = (v1*v2);
                if(temp=='/')  ans = (v1/v2);
                stack.push(ans);
            }
        }
        System.out.println(stack.pop());
    }
}