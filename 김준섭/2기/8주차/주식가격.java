import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        Queue<Integer> priceQ = new LinkedList<>();
        int[] answer = new int[prices.length];
        
        for(int i = 0 ; i < prices.length; i++) {
            priceQ.add(prices[i]);
        }
        
        int index = 0;
        while(!priceQ.isEmpty()) {
            int temp = priceQ.poll();
            
            int count = 0;
            for(Integer i : priceQ) {
                count++;
                if(temp > i)
                    break;
            }
            
            answer[index++] = count;
        }
        return answer;
    }
}
