import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class findallsuplicates {
    public List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        List<Integer> arr=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                arr.add(nums[i]);
                continue;
            }
            set.add(nums[i]);
        }
        return arr;
    }
    public List<Integer> findDuplicates1(int[] nums) {
        
        List<Integer> arr=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            
            if(nums[Math.abs(nums[i])-1]<0){
                arr.add(Math.abs(nums[i]));
            }
            nums[Math.abs(nums[i])-1]=(nums[Math.abs(nums[i])-1])*-1;
        }
        return arr;
    }
}
