import java.util.*;
public class num{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        String type = ((A % 2) == 0)? "Even" : "Odd";
        System.out.println(type);
    }    
}    