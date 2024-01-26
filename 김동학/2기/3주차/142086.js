function solution(s) {
    var answer = [];
    for(let i = 0; i < s.length; i++){
        let n = i - 1;
        while(n >= 0 && s.charAt(i) != s.charAt(n)){
               --n;              
        }
        if(n === -1) answer.push(-1);
        else answer.push(i-n);
    }
    
    return answer;
}
