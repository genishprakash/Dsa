var isAnagram = function(s, t) {
    let countOfCharactersInString1=new Array(26),countOfCharactersInString2=new Array(26)
    countOfCharactersInString1.fill(0)
    countOfCharactersInString2.fill(0)

    for(let index=0;index<s.length;index++ ){
        const asciiIndex=s.charCodeAt(index)-97;
        countOfCharactersInString1[asciiIndex]++;
    }
    for(let index=0;index<t.length;index++ ){
        const asciiIndex=t.charCodeAt(index)-97;
        countOfCharactersInString2[asciiIndex]++;
    }
    for(index=0;index<26;index++){
        console.log(countOfCharactersInString2[index],countOfCharactersInString1[index])
        if(countOfCharactersInString2[index]!=countOfCharactersInString1[index]){
            return false
        }
    }
    return true
};