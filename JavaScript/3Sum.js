var threeSum = function(nums) {
    nums.sort((a,b)=>a-b)
    const result=[]
    for(let itr1=0;itr1<nums.length-2;itr1++){
        if(itr1!==0 && nums[itr1]===nums[itr1-1]){
            continue;
        }
        let left=itr1+1,right=nums.length-1
        
        while(left<right){
            sum=nums[itr1]+nums[left]+nums[right]
            if(sum===0){
                const sumValues=[nums[itr1],nums[left],nums[right]]
                result.push(sumValues)
                left++
                while(nums[left]===nums[left-1] && left<right){
                    left++
                }
            }
            else if(sum<0){
                left++
            }
            else{
                right--
            }
        }
    }
    return result
};