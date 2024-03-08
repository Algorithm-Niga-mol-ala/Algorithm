function solution(n) {
    let answer = 0;

    let sqrn = Math.sqrt(n); // 알고리즘 효율 증가를 위해 절반만 계산하는 약수 방식 사용하려고 제곱근 구함

    for (let i = 1; i <= sqrn; i++) { // 1부터 제곱근 범위까지
        if (n % i === 0) { // 약수에 해당하는 경우, 해당되는 약수와 그 약수로 나눈 값 (남은 절반의 약수)를 구해줄 예정
            if (n / i === n / (n / i)) { // 약수랑 약수 나눈 값이 같을 때. 즉, 4 9 16같이 같은 수의 제곱일 때
                answer += n / i; // 하나만 더해준다 (중복방지)
            } else {
                answer += n / i;
                answer += n / (n / i);
            }

        }
    }
    
    return answer;
}
