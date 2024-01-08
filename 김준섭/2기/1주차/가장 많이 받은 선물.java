// 2024 KAKAO WINTER INTERNSHIP 가장 많이 받은 선물
// https://school.programmers.co.kr/learn/courses/30/lessons/258712?language=java

import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        
        int[][] exchange = new int[friends.length][friends.length];
        int[] giftsCount = new int[friends.length];
        int[] results = new int[friends.length];
        
        HashMap<String, Integer> mapFriends = new HashMap<>(); 
        
        for(int i = 0; i < friends.length; i++)
            mapFriends.put(friends[i], i);
        
        // get counts
        for(int i = 0 ; i < gifts.length; i++) {
            int give = mapFriends.get(gifts[i].split(" ")[0]);
            int get = mapFriends.get(gifts[i].split(" ")[1]); 
            
            exchange[give][get]++;
            giftsCount[give]++;
            giftsCount[get]--;
        }
        
        // get results
        for(int i = 0 ; i < friends.length-1; i++) {
            for(int j = i+1; j < friends.length; j++) {
                
                // they didn't exchange or same
                if((exchange[i][j] == 0 && exchange[j][i] == 0) || (exchange[i][j] == exchange[j][i])) {
                    if(giftsCount[i] == giftsCount[j])
                        continue;
                    else if(giftsCount[i] > giftsCount[j])
                        results[i]++;
                    else
                        results[j]++;
                } else {
                    // they did
                    if(exchange[i][j] > exchange[j][i])
                        results[i]++;
                    else
                        results[j]++;
                }
            }
        }
        
        for(int i = 0; i < results.length; i++)
            answer = Math.max(results[i], answer);
        
        
        return answer;
    }
}
