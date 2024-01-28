// 무조건 나머지가 1인 경우가 있다고 가정한 문제
public class 나머지가1이되는수찾기 {
	class Solution {
	    public int solution(int n) {
	        int answer = 0;
	        
	        int x = 2;
	        // 반복문을 통해 나머지가 1인 최소값을 찾아서 break 문을 통해 나온다
	        while(x < n) {
	            if(n % x == 1){
	                answer = x;
	                break;
	            }
	            x++;
	        }
	        
	        return answer;
	    }
	}
}
