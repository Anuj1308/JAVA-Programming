import java.util.*;
public class diamondpattern{
    public static void diamond(int n){
        for (int  i = 1; i <= n; i++){
            
            for (int j = 1; j<= n - i ; j ++){
                System.out.print(" ");  
            }
            for (int j = 1; j<= (2*i) - 1 ; j ++){
                System.out.print("*");       
            }
            System.out.println();image.png
        }
        for (int  i = n; i >= 1; i--){
            for (int j = 1; j<= n - i ; j ++){
                System.out.print(" ");  
            }
            for (int j = 1; j<= (2*i) - 1 ; j ++){
                System.out.print("*");
            }   
            
            System.out.println();
    }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        diamond(n);
    }
}