class Solution {
    public int solution(int n) {
        int answer = 0;
        int target = 1;
        
        while(answer != target){

            
            if(n % target == 1){
                answer = target;
                break;
            }
            
            target++;
        }
        
        return answer;
    }
}
