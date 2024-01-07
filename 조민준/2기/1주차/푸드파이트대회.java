class 푸드파이트대회 {
    /*
     * 데칼코마니식의 출력 결과를 내면 되는 문제로
     * left, right 로 나눠서 반복문을 통해 결과를 출력했다.
     */
	public String solution(int[] food) {
      
        String answer = "";
        String left = "";	// 정방향 변수
        String right = "";	// 역방향 변수
        
        // 반복문1 - 정방향
        for(int i = 1; i < food.length; i++) {
            for(int j = 0; j < food[i] / 2; j++) {
                left += i;
            }
        }
        
        // 반복문2 - 역방향
        for(int i = food.length -1; i > 0; i--) {
        	for(int j = 0; j < food[i] /2; j++) {
        		right += i;
        	}
        }
        // 출력값 = 정방향 + '0' + 역방향
        answer = left + '0' + right;
        return answer;
    }
}