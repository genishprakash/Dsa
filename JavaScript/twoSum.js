var twoSum = function(nums, target) {
    const mapObj={}
    for(let index=0;index<nums.length;index++){
        const diff=target-nums[index]
        if(diff in mapObj){
            return [mapObj[diff],index]
        }
        mapObj[nums[index]]=index;
    }
   
    
};

var twoSum = function(nums, target) {
    const map=new Map();
    for(let index=0;index<nums.length;index++){
        if(map.has(target-nums[index])){
            return [map.get(target-nums[index]),index]
        }
        map.set(nums[index],index);
    }
    
};

var twoSum = function(nums, target) {
    for(let index=0;index<nums.length;index++){
        for(let compareIndex=index+1;compareIndex<nums.length;compareIndex++){
            if(nums[index]+nums[compareIndex]===target){
                return [index,compareIndex]
            }
        }
    }
    
};