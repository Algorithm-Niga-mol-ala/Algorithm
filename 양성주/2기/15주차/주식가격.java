import java.util.*;
class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        
        Queue<Integer> q = new LinkedList<>();
        
        for(int price : prices){
            q.add(price);
        }
        int index = 0;
        while(!q.isEmpty()){
            int num = q.poll();
            for(int x : q){
                if(x>=num){
                answer[index]++;
                }else{
                    answer[index]++;
                    break;
                }
            }
            index++;
        }
        
        return answer;
    }
}
