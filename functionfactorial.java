import java.util.*;
public class functionfactorial{
    public static int factorial(int n){
        int f = 1;
        for( int i = 1; i <= n; i++ ){
            f = f*i;
        }
        return f;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int f = factorial(n);
        System.out.print("Factorial of the given number: " + f);
    }
}