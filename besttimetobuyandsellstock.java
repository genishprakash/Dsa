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
}
