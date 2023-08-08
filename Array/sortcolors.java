public class sortcolors {
    /*
     * The first solution is selection sort
     * Time complexitiy : O(n*n)
     * Space complexitiy:O(1)
     */
    public void sortColors1(int[] nums) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
    }
    /*
     * The second solution is using Dutch Flag algorithm
     * Time complexitiy : O(n)
     * Space complexitiy:O(1)
     */
    public static void swap(int a,int b,int[]nums){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
    public void sortColors(int[] nums) {
        int low=0,mid=0,high=nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                swap(low,mid,nums);
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                swap(high,mid,nums);
                high--;
            }
        }
    }
}
