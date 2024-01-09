import java.util.*;
import java.io.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length]; // 정답 배열
        
        // key:name, value:yearning
        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<name.length; i++) {
            map.put(name[i], yearning[i]);
        }
        
        for(int i=0; i<photo.length; i++) {
            int sum = 0;
            for(String str : photo[i]) { // key로 갖고 있으면 해당 value를 sum에 더해주기
                if (map.containsKey(str)) sum+=map.get(str);
            }
            answer[i]=sum;
        }
        return answer;
    }
}
