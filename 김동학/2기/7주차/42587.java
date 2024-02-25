import java.util.LinkedList; 
import java.util.Queue; 

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<Integer> que = new LinkedList<>();
        int answer = 0; // count
        // peek add poll
        for(int i = 0 ; i<priorities.length; i++){
            que.add(priorities[i]);        
        }
        for(int i = 0 ; i<priorities.length; i++){
            que.poll(priorities[i]);        
        }
        
        return answer;
    }
}
