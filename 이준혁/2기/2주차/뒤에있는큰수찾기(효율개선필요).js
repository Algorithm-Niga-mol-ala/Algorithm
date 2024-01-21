function solution(numbers) {
    // 뒷 큰수 = 뒤에 나보다 큰 가장 가까이 있는 수
    // 없으면 -1
    // 너무 대충짜서 시간복잡도 터짐
    let result = [];

    for (let i = 0; i < numbers.length; i++) { // 모든 배열을 순회하고
        for (let j = i + 1; j < numbers.length; j++) { // 인덱스 i의 다음값부터 비교
            if (j === numbers.length - 1) { // j가 마지막 인덱스 도달 시
                if (numbers[i] < numbers[j]) { // 뒤에 수가 더 크다면
                    result.push(numbers[j]); // 해당 값을 push
                } else { // 같거나 작다면 없기에
                    result.push(-1); // -1을 push
                }
            } else { // j가 마지막 인덱스 이전의 비교라면
                if (numbers[i] < numbers[j]) { // j가 더 클 때
                    result.push(numbers[j]); // 해당 값을 push하고
                    break; // j의 for문을 종료하고 다음 i값을 탐색
                }
            }
        }
    }

    result.push(-1); // 마지막 인덱스는 어차피 탐색을 안해도 뒤에 수가 없기에 -1을 push

    return result;
}
