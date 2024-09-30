// import java.util.*;
public class rectangle{
    public static void hollow_rectangle(int r,int c){
        for (int i = 1; i<= r; i++){
            for(int j = 1; j <= c; j++){
                if(i == 1 || i == r || j == 1 || j == c){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }System.out.println();
        }

    }
    public static void main(String args[]){
        // Scanner sc = new Scanner sc(System.in);  
        // System.out.print("Enter number of rows: ");
        // int r = sc.nextInt();
        // System.out.print("Enter number of columns: ");
        // int c = sc.nextInt();
        // int c -=se
        hollow_rectangle(4,3 );
    }
}