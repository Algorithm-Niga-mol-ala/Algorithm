function solution(s)
{
    // 입력이 홀수라면 2개씩 나눌 수 없다.
    if (s.length%2 === 1) {
        return 0; // 그러므로 0 리턴
    }

    let stack = []; // 스택 사용

    for (let i=0; i<s.length; i++) { 
        // stack에 늦게 들어온 값이 현재 s[i]와 같다면
        if (stack[stack.length-1] === s[i]) {
            stack.pop(); // 짝이 맞으므로 지움 
        } else {
            stack.push(s[i]); // 아니라면 저장
        }
    }

    if (stack.length === 0) {
        return 1;
    } else {
        return 0;
    }
}
