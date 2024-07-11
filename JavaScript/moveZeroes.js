var moveZeroes = function(nums) {
    let zeroPointer=0;
    for(let i=0;i<nums.length;i++){
        if(nums[i]!==0){
            [nums[zeroPointer],nums[i]]=[nums[i],nums[zeroPointer]]
            zeroPointer++
        }
    }
    return nums
};