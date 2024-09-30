public class tilingproblem {
    public static int tilingproblem(int n){
        if (n == 0 || n == 1){
            return 1;
        }
        
        //2 * n (floor size)

        //vertical choice
        int verticaltiles = tilingproblem(n - 1);

        //horizontal choice
        int horizontaltiles = tilingproblem(n - 2);
          
        int totalways = verticaltiles + horizontaltiles;

        return totalways;
    }

    public static void main(String args[]){
        System.out.println(tilingproblem(10));
    }
}
