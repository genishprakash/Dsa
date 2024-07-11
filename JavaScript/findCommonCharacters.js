var commonChars = function(words) {
    const res=[]
    for(let char of words[0]){
        if(words.every((word)=>word.includes(char))){
            res.push(char)
            words=words.map((word)=>word.replace(char,""))
        }
    }
    
    return res
};