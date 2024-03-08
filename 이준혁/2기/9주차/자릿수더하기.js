function solution(n)
{
    let answer = 0;

    while (n > 0) { // n을 10으로 계속 나눠서 마지막 자리만 더해줄 생각
        answer += n % 10; // n%10. 즉, 일의 자리만 저장해준다.
        n = (n-n%10) / 10; // n에서 일의 자리를 빼고 10으로 나눠주면 십의 자리가 일의 자리가 된다.
    }

    return answer;
}
