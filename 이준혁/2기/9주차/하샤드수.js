function solution(x) {
    // x가 하샤드 수이기 위해선 x의 자릿수의 합으로 x가 나눠져야함

    let answer = true;

    let y = x.toString(); // x를 문자열로 바꿔준다
    
    let z = 0; // 하샤드 수에 나눌 자릿수의 합을 담을 변수

    for (let i=0; i<y.length; i++) {
        z += parseInt(y.charAt(i)); // 각 자릿수를 숫자로 바꿔 z에 담아준다.
    }

    if (x%z !== 0) { // 나눈 나머지가 0이 아니면 나누어떨어지지 않기에
        answer = false; // 하샤드 수를 false로 바꾼다
    }

    return answer;
}
