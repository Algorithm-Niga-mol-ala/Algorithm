function solution(t, p) {
    var answer = 0;
    const len = t.length - p.length + 1;
    const indexLast = p.length;
    const num = parseInt(p);
    for(let i = 0; i<len; i++){
        if(parseInt(t.substring(i,i+indexLast)) <= num)
            answer++;
    }
    return answer;
}
