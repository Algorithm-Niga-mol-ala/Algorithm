function solution(s) {
    let answer = [0, 0]; // 배열 초기값 생성

    while (s !== "1") { // 1이 되면 마무리
        let tmp = 0; // 임시값
        for (let i = 0; i < s.length; i++) { // s 길이만큼
            if (s[i] === "0") { // 0인 경우
                answer[1]++; // 빼버릴 수를 answer[1]에 추가하므로 더해준다.
            } else {
                tmp++; // 아닌 경우(1인 경우)라면 tmp에 더해준다.
            }
        }
        s = tmp.toString(2); // 그 수만큼 이진수로 변환하여 s에 담는다.
        answer[0]++; // 반복문 한 번 돌 때를 answer[0]에 저장
    }

    return answer;
}
