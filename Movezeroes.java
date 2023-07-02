/* Problem : Move Zeroes
   Language : Java
   Time complexity:O(n)
   Space complextity:O(1)
*/
public class Movezeroes {
    public void moveZeroes(int[] nums) {
        int count=0,dest=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[dest++]=nums[i];
            }
            else{
                count++;
            }
        }
        for(int i=0;i<count;i++){
            nums[dest++]=0;
        }
      
    }
}
