package Array;
public class majorityelement {
    public int majorityElement(int[] nums) {
        int count=0,maximumoccurence=nums[0];
         for(int i=0;i<nums.length;i++){
             if(count==0){
                 maximumoccurence=nums[i];
                 count++;
             }
             else{
                 if(maximumoccurence==nums[i]){
                     count++;
                 }
                 else{
                     count--;
                 }
             }
         }
         return maximumoccurence;
    }
}
