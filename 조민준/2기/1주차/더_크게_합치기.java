class 더_크게_합치기 {
    public int solution(int a, int b) {
        int answer = 0;
        
        String str1 = Integer.toString(a) + Integer.toString(b);	// String으로 바꿔서 더해주기 ab
        String str2 = Integer.toString(b) + Integer.toString(a);	// String으로 바꿔서 더해주기 ba
        
        int num1 = Integer.parseInt(str1);	// String to int
        int num2 = Integer.parseInt(str2);	// String to int
        
        // 비교 작업 거쳐서 더 큰 값을 리턴
        if(num1 < num2) {
        	answer = num2;
        } else {
        	answer = num1;
        }
        
        return answer;
    }
}