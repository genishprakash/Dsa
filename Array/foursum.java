import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class foursum {
   
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer> > res = new ArrayList<List<Integer> >(); 
        Set<List<Integer>> s = new HashSet<>();
        for(int i=0;i<nums.length-3;i++){
            int j=i+1;
            while(j<nums.length-2){
                int low=j+1,high=nums.length-1;
                while(low<high){
                    long sum=nums[low];
                    sum+=nums[high];
                    sum+=nums[i];
                    sum+=nums[j];
                    if(sum==target){
                        s.add(Arrays.asList(nums[i], nums[j], nums[low],nums[high]));
                        low++;
                        high--;
                    }
                    else if(sum<target){
                        low++;
                    }
                    else{
                        high--; 
                    }
                }
                j++;
            }
        }  
        res.addAll(s);
        return res;
    }
}

