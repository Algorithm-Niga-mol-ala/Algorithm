class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        int sum = brown + yellow;
        
        for(int i = sum / 2; i >= 0; i--) {
            if(sum % i != 0)
                continue;
            
            int height = sum / i;
            
            if( i * 2 + height * 2 - 4 == brown) {
                answer[0] = Math.max(i, height);
                answer[1] = Math.min(i, height);
                break;
            }
        }
        
        return answer;
    }
}
