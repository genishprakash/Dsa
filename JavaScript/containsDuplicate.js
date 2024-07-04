var containsDuplicate = function(nums) {
    let set=new Array()
    for(let index=0;index<nums.length;index++){
        if(set.includes(nums[index])){
            return true
        }
        set.push(nums[index])
    }
    return false
};

var containsDuplicate = function(nums) {
    let set=new Array()
    for(let index=0;index<nums.length;index++){
        if(set.includes(nums[index])){
            return true
        }
        set.push(nums[index])
    }
    return false
};