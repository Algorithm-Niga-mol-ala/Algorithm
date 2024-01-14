
public class 홀짝에따라다른값반환하기 {

}

class Solution {
    public int solution(int n) {
        int answer = 0;
        if(n % 2 == 1) {	// 홀수이면
        	int i = 1;		// 홀수 다 더하기 위해 i는 1부터 시작
            while(i <= n) {	// i가 n보다 작거나 같을 때까지 계속 더하기
            	answer += i;
            	i += 2;
            }
        } else {			// 짝수이면
        	int i = 2;		// 2부터
        	while(i <= n) {	// n까지 제곱의 수를 더해준다
            	answer += i*i;
            	i += 2;
            }
        }
        return answer;
    }
}