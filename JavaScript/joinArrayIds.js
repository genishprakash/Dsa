var join = function(arr1, arr2) {
    let ans=[...arr1,...arr2]
    return Object.values(ans.reduce((acc,cv)=>{
        const id=cv.id
        if(acc[id]){
            acc[id]=Object.assign(acc[id],cv)
        }
        else{
            acc[id]=cv
        }
        return acc
    },{}))
};