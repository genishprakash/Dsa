/*
Problem: Best time to buy and sell stock
Language: java
Time complexity:O(n)
Space complexity:O(1)
*/
public class besttimetobuyandsellstock {
    public int maxProfit(int[] prices) {
        int max=prices[0],min=prices[0], fi=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<min){
                if(max-min>fi)
                    fi=max-min;
                min=prices[i];
                max=0;

            }
            if(prices[i]>max){
                max=prices[i];
            }
        } 
        if(max-min>fi)
            fi=max-min;  
        return fi;
    }
    /*
     * Updated solution 
     */
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE, profit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
            }
            else if (prices[i]-min>profit){
               profit=prices[i]-min;
            }
        } 
         
        return profit;
    }
}

