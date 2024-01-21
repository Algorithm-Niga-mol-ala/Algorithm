function solution(n) {
    let result = 0;

    // x > n/2라고 생각한다면
    // x+(x+1)는 절대 n이 될 수 없다.
    // 그 연산부터는 다 break 떤지면 시간초과 막고,
    // 마지막 n 연산일 때는 따로 +1 처리

    let cnt = 0;

    while (cnt !== n) {
        cnt++;

        let tmp = cnt;
        let nextCnt = tmp;
        while (true) {
            nextCnt++;
            tmp += nextCnt;
            
            if (tmp === n) {
                result++;
                break;
            } else if (tmp > n) {
                break;
            }
        }

        if (cnt > n / 2) {
            break;
        }
    }

    console.log(result+1)

    return result+1;
}
