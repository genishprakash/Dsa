/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number[]}
 */
var topKFrequent = function(nums, k) {
    let map=new Map();
    for(let num of nums){
        if(map.has(num)){
            map.set(num,map.get(num)+1)
        }
        else{
            map.set(num,1)
        }
    }
    let sortedMap=new Map([...map.entries()].sort((a,b)=>{
        return b[1]-a[1]
    }))
    let arr=[]
    for(let [key,value] of sortedMap){
        if(k==0){
            break;
        }
        arr.push(key)
        k--
    }
    
    return arr
};

var topKFrequent = function(nums, k) {
    let map=new Map();
    for(let num of nums){
       map.set(num,(map.get(num) || 0)+1)
    }
    let sortedMap=new Map([...map.entries()].sort((a,b)=>{
        return b[1]-a[1]
    }))
    return [...sortedMap.keys()].slice(0,k)
};