class Solution {
    public int[] solution(long n) {
        
        String a = String.valueOf(n);
        
        int[] answer = new int[a.length()];
        
        for (int i = 0; i < a.length(); i++){
            answer[i] = a.charAt(a.length() - i - 1) - '0';
        }
        
        return answer;
    }
}
