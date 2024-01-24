import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queuePro = new LinkedList<>();
        Queue<Integer> queueSpd = new LinkedList<>();
        
        for(int i = 0; i < progresses.length; i++) {
            queuePro.add(progresses[i]);
            queueSpd.add(speeds[i]);
        }
        
        int index = 0;
        int count = 0;
        
        ArrayList<Integer> result = new ArrayList<>();
        
        while(!queuePro.isEmpty()) {
            if(queuePro.peek() >= 100) {
                queuePro.poll();
                queueSpd.poll();
                count++;
                continue;
            }
            
            if(count > 0) {
                result.add(count);
                count = 0;
            }
                
            for(int i = 0 ; i < queuePro.size(); i++) {
                int speed = queueSpd.poll();
                queuePro.add(queuePro.poll() + speed);
                queueSpd.add(speed);
            }
        }
        if(count > 0) {
            result.add(count);
            count = 0;
        }
        
        int[] answer = new int[result.size()];
        for(int i = 0; i < result.size(); i++)
            answer[i] = result.get(i);
        
        return answer;
    }
}
