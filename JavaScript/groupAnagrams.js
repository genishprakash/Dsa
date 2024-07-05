var groupAnagrams = function(strs) {
    let res=[]
    for(let itr1=0;itr1<strs.length;itr1++){
        let arr=[]
        arr.push(strs[itr1])
        if(strs[itr1]===undefined){
                continue;
        }
        for(let itr2=itr1+1;itr2<strs.length;itr2++){
            if(strs[itr2]===undefined){
                continue;
            }
            const string1=strs[itr1].split("").sort().join("")
            const string2=strs[itr2].split("").sort().join("")
            if(string1===string2){
                arr.push(strs[itr2])
                strs[itr2]=undefined
            }
        }
        res.push(arr)
    }
    return res
};



const checkAnagram=(string1,string2)=>{
    if(string1.length!==string2.length){
        return false;
    }
    let frequency=new Array(26).fill(0);
    for(let index=0;index<string1.length;index++){
        frequency[string1.charCodeAt(index)-97]++;
        frequency[string2.charCodeAt(index)-97]--;
    }
    for(let index=0;index<26;index++){
        if(frequency[index]!==0){
            return false;
        }
    }
    return true;
}
var groupAnagrams = function(strs) {
    let res=[]
    for(let itr1=0;itr1<strs.length;itr1++){
        let arr=[]
        arr.push(strs[itr1])
        if(strs[itr1]===undefined){
                continue;
        }
        for(let itr2=itr1+1;itr2<strs.length;itr2++){
            if(strs[itr2]===undefined){
                continue;
            }
            
            if(checkAnagram(strs[itr1],strs[itr2])){
                arr.push(strs[itr2])
                strs[itr2]=undefined
            }
        }
        res.push(arr)
    }
    return res
};


var groupAnagrams = function(strs) {
    const obj={}
    let res=[],index=0
    for(let string of strs){
        const sortedString=string.split("").sort().join("")
        if(sortedString in obj){
            res[obj[sortedString]].push(string)
        }
        else{
            obj[sortedString]=index
            res[index]=[string]
            index++;
        }

    }
    return res
};