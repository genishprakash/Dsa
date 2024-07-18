var lengthOfLongestSubstring = function(s) {
    if(s.length===0){
        return 0
    }
    let maxLength=1,leftIndex=0
    for(let itr1=1;itr1<s.length;itr1++){
        let isFound=false
        for(let itr2=leftIndex;itr2<itr1;itr2++){
            let left = s.charAt(itr2)
            let right= s.charAt(itr1)
            if(left===right){
                leftIndex=itr2+1
            }
        }
        maxLength=Math.max(maxLength,(itr1-leftIndex)+1)
        
    } 
    return maxLength  
};