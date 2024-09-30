public class sumofnnumbers {
    public static int calcsum(int n){
        if (n == 0){
            return 1;
        }
        int snm = calcsum(n-1);
        int sn = n +snm;
        return sn;
    }

    public static void main (String args[]){
        int n = 10;
        System.out.println(calcsum(n));
    }
}
