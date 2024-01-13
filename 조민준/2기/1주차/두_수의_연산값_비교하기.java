import java.text.DecimalFormat;

public class 두_수의_연산값_비교하기 {
	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println(sol.solution(2, 91));
	}
}

class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String str1 = Integer.toString(a) + Integer.toString(b);	// 문자열로 바꾸어 저장 ab
        
        int num1 = Integer.parseInt(str1);	// 정수화 시켜준다.
        int num2 = 2 * a * b;				// 비교하기 위한 두번째 값
        
        if(num1 < num2) {	// 둘 중 더 큰 정수를 answer 에 저장
        	answer = num2;
        } else {
        	answer = num1;
        }
        
        return answer;
    }
}