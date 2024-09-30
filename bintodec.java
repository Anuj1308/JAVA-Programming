import java.util.*;
public class bintodec{
    public static void bintdec(int x ){
        int y = x;
        int p = 0;
        int d = 0;
        while ( x > 0){
            int lastdigit = x % 10;
            d = d + (lastdigit * (int)Math.pow(2 , p));
            p++;
            x = x/10;    
        }
        System.out.print("Decimal form of " + y + " is " + d);
        }

    public static void main (String args[]){
        System.out.print("Enter the binary number: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        bintdec(x);
        
    }    
}