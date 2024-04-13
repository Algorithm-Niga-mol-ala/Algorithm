function solution(numbers) {
    // 0부터 9까지가 배열의 변수로 들어감
    // 0~9를 다 더하면 45이므로
    // 45에서 현재 원소를 다 더한 값을 빼면 답
    let answer = 45; // 0~9의 합

    let numSum = 0;

    for (let i = 0; i < numbers.length; i++) {
        numSum += numbers[i];
    }

    answer -= numSum;

    return answer;
}
