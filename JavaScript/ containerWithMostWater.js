var maxArea = function(height) {
    let left=0,right=height.length-1,maxWater=0
    while(left<right){
        const currentAmountOfWater=Math.min(height[left],height[right])*(right-left)
        maxWater=Math.max(maxWater,currentAmountOfWater)
        if(height[left]>height[right]){
            right--
        }
        else{
            left++;
        }
    }
    return maxWater
};