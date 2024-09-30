import java.util.*;
public class invertedpyramid{
    public static void inverted_triangle(int n){
        for (int i = 1; i<= n; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();  
            }
          
        }

    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);  
        System.out.print("Enter number of lines: ");
        int n = sc.nextInt();
        inverted_triangle(n );
       
    }
    

    }
   