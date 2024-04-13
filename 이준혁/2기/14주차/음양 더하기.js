function solution(absolutes, signs) {
    // absolutes와 signs의 길이는 같고, 앞이 절댓값, 뒤가 부호
    let answer = 0;

    for (let i = 0; i < absolutes.length; i++) { // 배열의 길이만큼
        if (signs[i] === true) { // true면 더해주고
            answer += absolutes[i];
        } else { // false면 빼준다.
            answer -= absolutes[i];
        }
    }
    
    return answer;
}
