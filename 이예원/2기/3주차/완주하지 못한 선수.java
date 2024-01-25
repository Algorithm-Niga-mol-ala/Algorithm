import java.io.*;
import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i < participant.length; i++){
            
            if(map.containsKey(participant[i])){ // 동명이인이 있다면 value +1
                int res = map.get(participant[i]);
                map.put(participant[i], res+1); 
            } else {
                map.put(participant[i], 1); // 에스파는 나야
            }
        } // 마라톤 참여한 선수
        
        for(int i = 0; i < completion.length; i++){
            int res = map.get(completion[i]); // 동명이인 수
            map.put(completion[i], res-1);
        } // 완주한 선수
        
        String answer = "";
        
        for(String res : participant){
            if(map.get(res) != 0){ 
                answer = res;
            }
        } // 남은 이름 => 완주 못함
        
        return answer;
        
    }
}
