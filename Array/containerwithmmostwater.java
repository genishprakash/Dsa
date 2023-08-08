package Array;
public class containerwithmmostwater {
    // Two pointer approach
    public int min(int x,int y){
        return (x<y)?x:y;
    }
    public int maxArea(int[] arr) {
        int max=0;
        int end=arr.length-1,start=0;
        while(start<arr.length){
            if(end==start){
                break;
            }
            int min=min(arr[start],arr[end]);
            int curr_max=min*(end-start);
            if(curr_max>max){
                max=curr_max;
            }
            if(arr[start]<arr[end]){
                start++;
            }
            else{
                end--;
            }
        }
        return max;
    }
}
