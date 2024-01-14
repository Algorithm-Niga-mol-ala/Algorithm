function solution(n, control) {
    var answer = 0; 
    for(let i = 0; i < control.length; i++){
        if(control.charAt(i) == 'w'){
            n += 1;
        }else if(control.charAt(i) == 's'){
            n -= 1;
        }else if(control.charAt(i) == 'd'){
            n += 10;
        }else {
            n -= 10;
        }
    }
    
    answer = n;
    return answer;
}
