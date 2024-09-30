import java.util.*;
public class calculator{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        char operator = sc.next().charAt(0);
        switch (operator){
            case '+' : System.out.print(A + B);
            break;
            case '-' : System.out.print(A - B);
            break;
            case '*' : System.out.print(A * B);
            break;
            case '/' : System.out.print(A / B);
        }
    }
}        