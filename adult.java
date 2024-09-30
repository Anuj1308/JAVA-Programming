import java.util.*;
public class number{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age >= 18 ){
            System.out.print("Adult");            
        }
        else if (age >= 13 && age < 18){
            System.out.print("Teenager");          
        }
        else {
            System.out.print("Child");
        }

    }
}