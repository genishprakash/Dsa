package Array;
import java.util.HashMap;
public class subarrayequalstok {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int prefix_sum=0,res=0;
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            prefix_sum+=nums[i];
            if(map.containsKey(prefix_sum-k)){
                res+=map.get(prefix_sum-k);
                
            }
            if(map.containsKey(prefix_sum)){
                map.put(prefix_sum,map.get(prefix_sum)+1);
            }
            else{
                map.put(prefix_sum,1);
            }
        }
        return res;
    }
}
