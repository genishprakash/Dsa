public class maxpointsobtainfromcards{
    public int maxScore(int[] cardPoints, int k) {
        int max=0,sum=0;
        for(int i=0;i<k;i++){
            sum+=cardPoints[i];
        }
        if(sum>max){
            max=sum;
        }
        int clone=k-1;
        for(int i=cardPoints.length-1;i>=cardPoints.length-k;i--){
            sum-=cardPoints[clone];
            sum+=cardPoints[i];
            clone--;
            if(sum>max){
                max=sum;
            }
        }
        return max;
    }
}