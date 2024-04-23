import java.util.*;
import java.io.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num:tangerine) {
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        
        List<Integer> list = new ArrayList<>();
        for(int num:map.values()) {
            list.add(num);
        }
        Collections.sort(list, Collections.reverseOrder());
        
        int answer = 0;
        for(int num:list) {
            k = k-num;
            answer++;
            if (k<=0) break;
        }
        return answer;
    }
}
