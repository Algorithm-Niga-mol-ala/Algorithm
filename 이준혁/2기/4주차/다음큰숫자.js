function solution(n) {
    let answer = 0; // 초기값

    const tmp = n.toString(2); // tmp의 2진수를 찾음

    const count = tmp.split('1').length - 1; // 1을 기준으로 잘라서 배열을 만들고 그 크기에 -1을 하면 1의 개수 파악 가능

    while (count !== answer) { // count와 answer가 같아질 떄까지 
        n++; // n을 1씩 높이면서

        const tmp2 = n.toString(2); // 2진수로 바꿔주고

        answer = tmp2.split('1').length - 1; // 마찬가지로 1의 개수를 담아준다.
    }

    answer = n; // 반복문을 끝낸 n의 값은 1의 개수가 같은 가장 가까운 수일 것이다.

    return answer;
}
