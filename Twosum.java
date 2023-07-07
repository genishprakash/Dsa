/*
 * This solution is done using Hashmap
 * Time complextiy:O(nlogn)
 * Space complexity:O(n)
 *
 */
public class Twosum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> arr=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(arr.containsKey(target-nums[i])){
                return new int []{arr.get(target-nums[i]),i};
            }
            arr.put(nums[i],i);
        }
        return new int []{0,0};
    }
    
}
