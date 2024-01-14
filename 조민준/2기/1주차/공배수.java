
public class 공배수 {

}

class Solution {
    public int solution(int number, int n, int m) {
        int answer = 0;
        
        if(number % n == 0) {		// n 의 배수이면서
            if(number % m == 0) {	// m 의 배수이면
                answer = 1;			// 1 반환 , 아닐 시 기본 값 0 반환
            }
        }
        
        return answer;
    }
}