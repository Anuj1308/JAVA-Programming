import java.util.*;
public class oddeve{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        if (A % 2 == 0){
            System.out.print("The number is even.");
        }
        else {
            System.out.print("The number is odd.");
        }

    }
}