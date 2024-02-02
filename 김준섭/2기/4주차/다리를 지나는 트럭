import java.util.*;


class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        
        Queue<Integer> trucks = new LinkedList<>(); 
        
        int sum = 0;
        int idx = 0;
        
        while(true) {
            if(idx == truck_weights.length){  
                answer += bridge_length;  //마지막 트럭이 지나는 시간 추가
                break;  
            }
            
            answer++; 
            int tmp = truck_weights[idx];
            
            if(trucks.size() == bridge_length){
                sum -= trucks.poll();  //다 건넜으니 현재 다리에 있는 차들의 무게에서 제외
            }
            
            if(sum + tmp <= weight){  //다리에 다음 차가 진입할 수 있다면
                sum += tmp;  //차량 무게 추가
                trucks.add(tmp);  
                idx++;  //다음 차량을 위해서
            }else{   
                trucks.add(0);  //진입할 수 없다면 0을 푸시해서 시간초 계산
            }
            
        }
      
        
        return answer;
    }
}
