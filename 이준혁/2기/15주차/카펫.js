function solution(brown, yellow) {
    // yellow는 안에 들어가는 카펫, brown은 밖에 나오는 1줄 테두리 카펫
    // yellow의 약수의 조합 ( 3의 경우 1, 3, 9 이므로 1x9 , 3x3)이 가로와 세로의 길이기에
    // (answer[i] + answer[i + 1]) * 2 + 4) === brown이라면 brown 테두리가 1줄이 된다.
    // 즉, 위에 해당되는 조건인 경우에 return [answer[i + 1] + 2, answer[i] + 2];을 하면 카펫 길이 파악 가능

    let answer = []; // 약수를 담을 배열

    for (let i = 1; i <= Math.sqrt(yellow); i++) { // 1부터 루트만큼 범위 계산
        if (yellow % i === 0) {
            answer.push(i); // 0이라면 해당 수는 약수
            if (yellow / i !== i) { // 나눈 값이 i와 다르다면
                answer.push(yellow / i); // 나눈 값의 경우도 약수에 해당
            }
        }
    }

    if (answer.length % 2 === 0) { // 약수의 개수가 짝수 ( 3x3같은 같은 수가 없다면 )
        for (let i = 0; i < answer.length - 1; i = i + 2) { // i와 i+1이 매핑되므로 2칸씩 이동
            if (((answer[i] + answer[i + 1]) * 2 + 4) === brown) { // 계산 값이 brwon과 같다면
                return [answer[i + 1] + 2, answer[i] + 2]; // 해당되는 수의 카펫길이 리턴
            }
        }
    }
    return [answer[answer.length-1]+2, answer[answer.length-1]+2]; // 나눈 값은 마지막에 있으므로 마지막 값에 2를 더하여 리턴
}
