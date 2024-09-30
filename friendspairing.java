public class friendspairing {
    public static int friendsPairing(int n){

        if (n == 1 || n == 2){
            return n;
        }
        //choice
        //single
        int fnm1 = friendsPairing(n-1);

        //pair
        int fnm2 = friendsPairing(n-2);
        int pairways = (n-1)* fnm2;

        //total ways
        int totalways = fnm1 +pairways;

        return totalways;
    }

    public static void main(String args[]){
        System.out.print(friendsPairing(4));
    }
}
