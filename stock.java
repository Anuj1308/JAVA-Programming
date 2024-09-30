import java.util.*;
public class stock{
    public static int buysellstock(int prices[]){
        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++){
            if (buyprice < prices[i]){
                int profit = prices[i] - buyprice;
                maxprofit = Math.max(maxprofit, profit);
            }
            else {
                buyprice = prices[i];
            }
        }
        return maxprofit;
    }

    public static void main(String args[]){
        int prices[] = {5, 7, 4 ,10, 16};
        System.out.println(buysellstock(prices));

    }

}