package Array;
import java.util.HashMap;

public class subarraydivisiblebyk {
    public int subarraysDivByK(int[] nums, int k) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
                System.out.print(nums[j]+" ");
                if(sum%k==0){
                    
                    count++;
                }
            }
            System.out.println();
        }
        return count;
    }
    public int subarraysDivByK1(int[] nums, int k) {
        int count=0,prefixsum=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            prefixsum+=nums[i];
            int modulo_value=(prefixsum%k+k)%k;
            
            if(map.containsKey(modulo_value)){
                count+=map.get(modulo_value);
                map.put(modulo_value,map.get(modulo_value)+1);
            }
            else{
                map.put(modulo_value,1);
            }
        }
        
        return count;
    }
}
