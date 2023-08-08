package Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class threesum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer> > res = new ArrayList<List<Integer> >(); 
        Set<List<Integer>> s = new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int low=i+1,high=nums.length-1;
            while(low<high){
                int sum=nums[low]+nums[high]+nums[i];
                if(sum==0){
                    s.add(Arrays.asList(nums[i], nums[low], nums[high]));
                    low++;
                    high--;
                }
                else if(sum<0){
                    low++;
                }
                else{
                    high--;
                }
            }
        }  
        res.addAll(s);
        return res;  
    }
}
