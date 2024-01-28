// 0~9 까지의 숫자 중 배열에 없는 수를 더해서 리턴하는 문제
public class 없는숫자더하기 {
	class Solution {
	    public int solution(int[] numbers) {
	        int answer = 0;
	        
	        int n = numbers.length;
	        
	        for(int i = 0; i < n; i++) {
	            answer += numbers[i];	// answer에 배열 안에 있는 값들을 다 넣어준다.
	        }
	        
	        answer = 45 - answer;	// 0~9를 다 더하면 45이기 떄문에 45에서 배열 안의 값들을 빼면 결과 값 나옴
	        
	        return answer;
	    }
	}
}
