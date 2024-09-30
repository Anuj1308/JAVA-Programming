import java.util.*;
public class multiply{
    public static int product( int a, int b){
        int c = a*b;        
        return c;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();   
        int x = product(a , b);
        System.out.println("Product is: " +x);
    }
}