import java.util.*;
public class countsetbits{
    public static int countbits(int n){
        int count = 0;
        while(n>0) {
            if ((n & 1) != 0){
                count++;
            }
            n = n>>1;
        }

        return count;
    }

    public static void main(String args[]){
        System.out.print(countbits(15));
    }
}