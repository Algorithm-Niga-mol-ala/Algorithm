class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split(" ");	// 공백 칸을 기준으로 split 한다.
		int min = Integer.MAX_VALUE;	// 최댓값을 찾기 위한 변수 생성
		int max = Integer.MIN_VALUE;	// 최솟값을 찾기 위한 변수 생성
		
		for(int i = 0; i < str.length; i++) {	// 반복문을 통해 최댓값과 최솟값을 찾아준다.
			if(min > Integer.parseInt(str[i])) {	
				min = Integer.parseInt(str[i]);
			}
			
			if(max < Integer.parseInt(str[i])) {
				max = Integer.parseInt(str[i]);
			}
		}
        
		// "최솟값 최댓값" 이 나오게 asnwer 에 넣어준다.
        answer = Integer.toString(min) + " " + Integer.toString(max);
        return answer;
    }
}