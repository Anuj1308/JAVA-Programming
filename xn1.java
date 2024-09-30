public class xn1{
    public static int power(int a, int n){
        if (n==0){
            return 1;
        }
        int x = power(a, n/2);
        int halfpower = x * x;

        //n is odd
        if(n%2 != 0){
            halfpower = a*halfpower;
        }

        return halfpower;
    }

    public static void main(String args[]){
        System.out.println(power(2, 10));
    }
    
}

