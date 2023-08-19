import java.util.Stack;

public class String_Recognize_1 {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        String s = "ab";
        String p = s;
        int next = -1;
        char nextchar;
        while(s.length()!=next+1){
            nextchar = s.charAt(++next);
            if(nextchar=='b'){
                stack.push(nextchar);
            }
        }
        System.out.println("Stack elements: " + stack);

        next = -1;

        while(s.length()!=next+1){
            nextchar = p.charAt(++next);//1b 2a 3a 4a 5b 6b 7b 8a 9b
            if(nextchar=='a' && !stack.empty()){
                stack.pop();
            }
            else if((nextchar=='a') && stack.empty()){
                System.out.println("invalid");
                --next;
                break;
            }
        }
        System.out.println("Stack elements: " + stack);
            if(stack.empty() && (s.length()==next+1)){
                System.out.println("Valid");
            }
            else if(((!stack.empty() && s.length()==next+1))){
                System.out.println("INvalid");
            }
    }
}
