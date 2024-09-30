import java.util.*;
public class reverse{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // while(n > 0){
        //     int lastdigit = n % 10;
        //     System.out.print(lastdigit + " ");
        //     n /= 10;`

        // }

        int reverse =0;

        while(n > 0){
            int lastdigit = n % 10;
            reverse = (reverse*10) + lastdigit;
            n = n/10;
            System.out.print(lastdigit);

        }
        
        

    }
}