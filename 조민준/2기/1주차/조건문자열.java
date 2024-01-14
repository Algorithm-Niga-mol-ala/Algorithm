
public class 조건문자열 {
	public static void main(String[] args) {
		
	}
}

class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        
        // answer 의 기본 값이 0이기 때문에 1일 경우만 생각해서 if문 작성
        if(ineq.equals(">")) {	// '>' 일 때 
            if(eq.equals("=")) {// '=' 인 경우
                if(n >= m) {	// 정보가 맞으면 1
                    answer = 1;
                }
            } else {			// '!' 인 경우
                if(n > m) {		// 정보가 맞으면 1
                    answer = 1;
                }
            }
        }
        else {					// '<' 일 때
            if(eq.equals("=")) {// '=' 인 경우
                if(n <= m) {	// 맞으면 1
                    answer = 1;
                }
            }
            else {				// '!' 인 경우
                if(n < m) {		// 맞으면 1
                    answer = 1;
                }
            }
        }
        
        return answer;
    }
}