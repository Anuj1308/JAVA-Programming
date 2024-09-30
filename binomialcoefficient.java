import java.util.*;
public class functionfactorial{
    public static int factorial(int n){
        int f = 1;
        for( int i = 1; i <= n; i++ ){
            f = f*i;
        }
        return f;
    }

    public static int binocoeff(int n,int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);
        int ncr = fact_n/(fact_nmr*fact_r);
        return ncr;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter r: ");
        int r = sc.nextInt();
        int bc = binocoeff(n , r);
        System.out.print("Binomial Coefficient is: " + bc);
    }
}