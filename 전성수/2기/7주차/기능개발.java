import java.util.*;


class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int idx =0;
        Queue<Integer> q = new LinkedList<>();
       while(idx!=progresses.length){
           int cnt =0;
        for(int i=idx; i<progresses.length;i++){
            progresses[i] +=speeds[i]; 
        }
           for(int i=idx; i<progresses.length;i++){
            if(progresses[i]>=100){
                idx++;
                cnt++;
            } else{
                break;
            }
        }
           if(cnt==0){
            continue;   
           }else{
                q.add(cnt);
           }
       }
        int size = q.size();
        int[] answer = new int [size];
        
        for(int i=0; i<size; i++){
            answer[i] = q.poll();
        }
        return answer;
    }
}
