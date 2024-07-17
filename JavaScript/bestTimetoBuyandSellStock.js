var maxProfit = function(prices) {
    let min=prices[0],maxProfit=0;
    for(let index=1;index<prices.length;index++){
        if(prices[index]>=min){
            maxProfit=Math.max(maxProfit,prices[index]-min)
        }
        if(prices[index]<min){
            min=prices[index]
        }
    }
    return maxProfit
};