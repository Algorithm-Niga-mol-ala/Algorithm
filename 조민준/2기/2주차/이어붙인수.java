class 이어붙인수 {
    public int solution(int[] num_list) {
        int answer = 0;
        String odd = "";
        String even = "";
        
        for(int i = 0; i < num_list.length; i++) {	// 리스트의 길이만큼 반복
            if(num_list[i] % 2 == 1) {	// 리스트의 값이
                odd += Integer.toString(num_list[i]);	// 홀수이면 odd에 String으로 추가
            } else {
                even += Integer.toString(num_list[i]);	// 짝수이면 even에 String으로 추가
            }
        }
        
        int a = Integer.parseInt(odd);	// String to int
        int b = Integer.parseInt(even);	// String to int
        
        answer = a + b;
        return answer;
    }
}