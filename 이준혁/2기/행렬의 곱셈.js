function solution(arr1, arr2) {
    // js에서는 이차원 배열을 지원하지 않는다...
    // 즉, 직접 구현을 해야하므로 3중 for문을 활용하기로 생각함
    // arr1의 가로와 arr2의 세로를 곱한 값이 각 행렬에 매핑되는 것이 목표이므로
    // 3중 for문을 아래와 같이 설계하였다.
    let answer = [[]];

    for (let i = 0; i < arr1.length; i++) { // 가장 마지막에 계산되어야 하는 건 arr1의 세로 순서
        let tmp = new Array(arr2[0].length); // [[...], [...] ...]에서 [...]을 담당해 줄 임시 배열 크기 선언
        for (let j = 0; j < arr2[0].length; j++) { // 두 번째로 계산되어야 할 arr2[0]. 즉, arr2의 가로 순서
            let sum = 0; // 세 계산값을 더해줄 변수
            for (let k = 0; k < arr2.length; k++) { // arr2의 세로 순서를 통해 각 계산을 매핑해준다.
                sum += arr1[i][k] * arr2[k][j]; // k의 값이 먼저 적용되고, 이 값들을 모두 더해준다.
            }
            tmp[j] = sum; // 그 값을 j번째에 담아준다.
        }
        answer[i] = tmp; // i에 대한 j의 계산이 모두 끝났다면 i 위치에 담아준다.
    }
    return answer;
}
