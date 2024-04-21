import java.util.*;
import java.io.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int n = number.length;
        int d = discount.length;
        int answer = 0;
        
        Map<String, Integer> shop = new HashMap<>();
        for(int i=0; i<n; i++) {
            shop.put(want[i], number[i]);
        }
        
        loop: for(int i=1; i<=d-10+1; i++) {
            Map<String, Integer> map = new HashMap<>();
            for(int j=i-1; j<i-1+10; j++) {
                map.put(discount[j], map.getOrDefault(discount[j], 0)+1);
            }
            for(int j=0; j<shop.size(); j++) {
                if (shop.get(want[j])!=map.get(want[j])) continue loop;
            }
            answer++;
        }
        return answer;
    }
}
