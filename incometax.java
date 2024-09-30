import java.util.*;
public class incometax{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        if (income < 500000){
            System.out.print("0% tax");
        }
        else if(income >= 500000 && income < 1000000){
            System.out.print("20% tax");
        }
        else {
            System.out.print("30% tax");
        }
    }
}