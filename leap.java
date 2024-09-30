import java.util.*;
public class leap{
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        
        if (year % 4 == 0){
            System.out.print("Leap year.");
            if ( year % 100 == 0){
                System.out.print("Leap year.");
            }  
            else if(year % 400 == 0){
                System.out.print("Leap year.");
            }
            else {
                System.out.print("Not a leap year.");
            }    
        }

        else {
                System.out.print("Not a Leap year.");
        }
         
        }
    }
