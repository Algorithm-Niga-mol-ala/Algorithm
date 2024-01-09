import java.util.*;
import java.io.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        
        HashMap<String, Integer> ranking = new HashMap<>();

        for(int i = 0; i < players.length; i++){
            ranking.put(players[i], i); // 선수의 이름, 등수
        }
        
        // 경주 시작
        for(int i = 0; i < callings.length; i++){
            
            // 이름 불린 선수의 등수 가져옴
            int rankOfCallingPlayer = ranking.get(callings[i]);
            
            // 앞에 있는 선수
            String frontPlayer = players[rankOfCallingPlayer-1];
            
            // 앞에 있는 선수의 value 변경
            ranking.replace(frontPlayer, rankOfCallingPlayer);
            players[rankOfCallingPlayer] = frontPlayer;
            
            // 호명된 선수의 등수 변경
            ranking.replace(callings[i], rankOfCallingPlayer-1);
            players[rankOfCallingPlayer-1] = callings[i];

            
        }// 경주 끝
        
        
        return players;
        }
}
