/*
 * This solution is based on dynamic programming.
 * 
 */
public class bestimetobuyandsellstockII {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE,profit=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
                //Find the minimum value.
            }
            else{
                profit+=prices[i]-min;
                //Sum up all the profits for every selling stock.
                min=prices[i];
                //Update the minimum value
            }
        }    
        return profit;
    }
}
