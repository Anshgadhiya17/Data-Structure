import java.util.Scanner;

public class StackMethod {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size of array : ");
        int n = sc.nextInt();
        System.out.println();
        Method m = new Method(n);
        m.getDetail();
        System.out.println();
    } 
}

class Method {
    Scanner cs = new Scanner(System.in);
    int n ;
    int top = 0;
    int a[] ;
    public Method(int n){
        this.n = n;
        a = new int[n];
    }
    public void getDetail(){
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
        System.out.println("Enter 1 for \'Push\' \nEnter 2 for \'Pop\' \nEnter 3 for \'Peep\' \nEnter 4 for \'Change\' \nEnter 5 for \'Display\'");
        int x = cs.nextInt();
        switch (x){
            case 1 : push();
            break;
            case 2 : pop();
            break;
            case 3 : peep();
            break;
            case 4 : change();
            break;
            case 5 : display();
            break;
        }
    }
    public void push() {
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
        System.out.println("Enter a number you want to push : ");
        int x = cs.nextInt();
        if(top==n){
            System.out.println("Stack is full!!");
        }
        else{
           for(int i=0 ; i<x ; i++){
                if (top>=n) {
                    System.out.println("Stack Overflow!!");
                    break;
                }
                else{
                    top++;
                    a[top-1] = cs.nextInt();
                }
            }
        }
        System.out.println("Enter a 1 for another operation and 0 for break: ");
        int c = cs.nextInt();
        System.out.println(c);
        if(c==1){
            getDetail();
        }
    }
    public void pop(){
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
        System.out.println("Enter a number you want to pop :");
        int x = cs.nextInt();
        if (top==0) {
            System.out.println("Stack is Empty!!");
        }
        else{
            while(x!=0){
                if(top<=0){
                    System.out.println("Stack Underflow!!");
                    break;
                }
                else{
                    top--;
                    a[top] = 0;
                    x--;
                }
            }
        }
        System.out.println("Enter a 1 for another operation and 0 for break: ");
        int c = cs.nextInt();
        if(c==1){
            getDetail();
        }
    }
    public void peep(){
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
        System.out.println("Enter a index of number you want :");
        int x = cs.nextInt();
        if(top-x<0){
            System.out.println("Stack Underflow!!");
        }
        else{
            System.out.println("A number is : "+a[top-x]);
        }
        System.out.println("Enter a 1 for another operation and 0 for break: ");
        int c = cs.nextInt();
        if(c==1){
            getDetail();
        }
    }

    public void change() {
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
        System.out.println("Enter a index of number you want :");
        int x = cs.nextInt();
        System.out.println("Enter a new number : ");
        int y = cs.nextInt();
        if(top-x<0){
            System.out.println("Stack Underflow!!");
        }
        else{
            a[top-x] = y;
        }
        System.out.println("Enter a 1 for another operation and 0 for break: ");
        int c = cs.nextInt();
        if(c==1){
            getDetail();
        }
    }

    public void display(){
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
        if(top==0){
            System.out.println("Stack is Empty!!");
        }
        else{
            System.out.print("");
            System.out.println("Stack elements are : ");
            for(int i = top-1 ; i>=0 ; i--){
                System.out.print(a[i]+" ");
            }
            System.out.println();
        }
        System.out.println("Enter a 1 for another operation and 0 for break: ");
        int c = cs.nextInt();
        if(c==1){
            getDetail();
        }
    }
}