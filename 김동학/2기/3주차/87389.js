function solution(n) {
    var answer = 0;
    let x = 1;
    while(n % x !== 1) {
        x++;
    }
    answer = x;
    return answer;
}
