import java.util.*;
public class subarrays{
    public static void printsubarrays(int numbers[]){
        int totalsubarrays = 0;
        for (int i = 0; i <numbers.length; i++){
            int start = i;
            for (int j = i; j < numbers.length; j++){
                int end = j;
                for (int k = start; k <= end; k++){
                    System.out.print(numbers[k] + " ");
                }
                System.out.println();
                totalsubarrays++;
            }
            System.out.println();
        }
        System.out.print("Total subarrays = " + totalsubarrays);
    }

    public static void main (String args[]){
        // Scanner sc = new scanner (System.in);
        int numbers[] = {2, 3, 4, 5, 6, 7};
        // System.out.print("Enter the start: ");
        // int start = sc.nextInt();
        printsubarrays(numbers);

    }
}