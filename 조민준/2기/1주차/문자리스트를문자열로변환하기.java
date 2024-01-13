class 문자리스트를문자열로변환하기 {
    public String solution(String[] arr) {
        String answer = "";
        
        for(int i = 0; i < arr.length; i++){
            answer += arr[i];
        }
        
        return answer;
    }
}