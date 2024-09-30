import java.util.*;
public class numberpyramid{
    public static void pyramid(int n){
        for (int  i = 1; i <= n; i++){
            
            for (int j = 1; j<= n-i ; j ++){
                System.out.print(" ");  
            }
            for (int j = 1; j<=i ; j ++){
                System.out.print(i + " ");
            }
            
            System.out.println();
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        pyramid(n);
    }
}
