import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = participant[0];
        
        // 완주자 명단을 저장하기 위한 map 선언
        Map<String, Integer> map = new HashMap<>();
        
        // 완주자 명단에 있는 이름을 key로, 해당 이름을 가진 인원수를 value로 map 갱신
        for (String player : completion){
            int cnt = map.getOrDefault(player, 0);
            
            map.put(player, cnt+1);
        }

        // 참가자 명단과 완주자 명단을 대조
        for (String player : participant){
            
            // 참가자 명단에 있는 선수가 완주자 명단에 있는지 확인
            int cnt = map.getOrDefault(player, 0);
            
            // 완주자 명단에 없다면 해당 선수가 정답으로 출력되어야 함
            if(cnt == 0){
                answer = player;
                break;
            }
            
            // 완주자 명단에 있다면 인원수 -1 처리
            map.put(player, cnt-1);
        }
        return answer;
    }
}
