import java.util.*;
public class decimaltobinary{
    public static void dectobin(int n){
        int power = 0;
        int binum = 0;
        int x = n;
        while(n > 0 ){
            int rem = n % 2;
            binum = binum + (rem * (int)Math.pow(10 ,power));
            power++;
            n = n/2;
        }
        System.out.print("Binary form of " + x + "= " + binum);
    }


    public static void main (String args[]){
        System.out.print("Enter the binary number: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        dectobin(x);
    }
}
