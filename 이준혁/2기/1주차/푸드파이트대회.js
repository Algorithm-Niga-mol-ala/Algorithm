function solution(food) {
    // 푸드 파이트 대회는 1:1
    // 한 선수는 왼쪽부터 오른쪽으로
    // 다른 선수는 오른쪽에서 왼쪽으로 먹음
    // 칼로리가 낮은 음식을 먼저 먹을 수 있게 배치
    // 물 (0)을 먼저 먹으면 승리
    let result = ''; // 빈 문자열 생성

    for (let i = 1; i < food.length; i++) { // food[0]의 경우 물이기에 제외하고, 나머지를 반복하는데
        if (food[i] % 2 === 0) { // 만약 2로 나눠떨어진다면 
            for (let j = 0; j < food[i] / 2; j++) { // 절반이기에 모두 사용하므로 절반만큼을 반복하여
                result += i; // 결과값에 해당 인덱스를 추가해준다
            }
        } else { // 2로 떨어지지 않는다면 (홀수)
            for (let j = 1; j < food[i] / 2; j++) { // 반복을 한 번 덜하여
                result += i; // 결과값에 해당 인덱스를 추가해준다.
            }
        } 
    }

    let tmp = result.split(''); // split을 이용하여 배열단위로 저장한 값을 tmp에 넣어주고
    tmp = tmp.reverse(); // reverse로 반대로 뒤집어준다.
    tmp = tmp.join(''); // 그 값을 join을 이용하면 합칠 수 있다.

    result += 0; // 가운데에 물의 값인 0을 넣어주고
    result += tmp; // tmp을 붙여주면 정답

    return result;
}
