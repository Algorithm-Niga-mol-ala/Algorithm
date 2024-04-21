function solution(n) {
    let answer = 0;

    let tmp = [];

    while (true) {
        tmp.push(n % 10);
        n = n - (n % 10);
        n = n / 10;

        if (n === 0) {
            break;
        }
    }

    tmp.sort();

    for (let i = 0; i < tmp.length; i++) {
        answer += tmp[i] * 10 ** i;
    }
    return answer;
}
