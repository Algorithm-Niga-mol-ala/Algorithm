function solution(number, limit, power) {
    // 기사단원의 무기
    // 각 기사는 기사 번호의 약수 개수의 공격력을 가진 무기를 구매
    // 단, 제한수치가 있고, 제한수치보다 높다면 협약기관의 정해진 무기를 구매
    // 15라면 1, 3, 5, 15로 4개이므로 4인 무기를 구매
    // 1, 2, 3, 4, 5의 약수 수는 1, 2, 2, 3, 2
    // 3을 넘는게 없으므로 10.
    // 시간초과난다 알고리즘 개선 필요

    let result = 0;


    for (let i = 1; i <= number; i++) {
        let tmp = 0;

        const numSqrt = Math.sqrt(i);

        // 1. 약수를 구분한다. (모든 수로 판별하면 시간초과)
        // 시간 초과를 해결하기 위해 i로 루프하지 않고 i의 제곱근으로 루프 
        for (let j = 1; j <= numSqrt; j++) {
            if (i % j === 0) { // 기존 제곱근 케이스에
                tmp++;

                if (j * j != i) { // 제곱근으로 인해 빠지는 케이스를 추가적으로 더해준다.
                    tmp++; // 이러한 방식으로 약수 계산을 하면 시간복잡도가 O(n)에서 O(sqrt(n))으로 낮아진다.
                }
            }
        }

        // 2. 해당되는 약수의 수가 limit을 넘는지 판별
        if (tmp > limit) {
            tmp = power; // 3. 넘는다면 해당 값을 power로 변경

        }

        // 4. 그 모든 값을 sum한다.
        result += tmp;
    }
    return result;
}
