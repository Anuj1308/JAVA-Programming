import java.util.*;
public class optimised_prime{
    public static boolean isprime(int n){
        boolean isprime = true;
        if (n == 2){
            return true;
        }
        for(int i = 2; i <= Math.sqrt(n) ;i++){
            if (n % i == 0){
                isprime = false;
            }
            
        }
        return isprime;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value: ");
        int n = sc.nextInt();
        boolean prime = isprime(n);
        System.out.print(prime);
    }
}