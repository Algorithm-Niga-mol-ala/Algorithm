
public class n의배수 {

}

class Solution {
    public int solution(int num, int n) {
        int answer = 0;
        
        if(num % n == 0) {	// 나머지가 0 이면 배수라는 의미로 1 반환
            answer = 1;
        } // answer 기본 값이 0이기 때문에 else문 불필요
        return answer;
    }
}