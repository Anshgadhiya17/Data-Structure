import java.util.*;
public class prefix_Eva {
    public static void main(String[] args){
        Stack<Integer> stack= new Stack<>();
        String str = "+-*2211685";
        int ans=-1;
        for(int i=str.length()-1;i>=0;i--){
            char temp = str.charAt(i);
            if(Character.isLetterOrDigit(temp)){
                    stack.push(Character.getNumericValue(temp));
            }
            else{
                 if(stack.size()<=1){
                    System.out.println("error");
                    return;
                }
                int v2 = stack.pop();
                int v1 = stack.pop();
                if(temp=='+')  ans = (v2+v1);
                if(temp=='-')  ans = (v2-v1);
                if(temp=='*')  ans = (v2*v1);
                if(temp=='/')  ans = (v2/v1);
                stack.push(ans);
            }
        }
        System.out.println(stack.pop());
    }
}