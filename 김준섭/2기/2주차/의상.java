import java.util.*;

class Solution {
    int[] stacks;
    boolean[][] visit;
    int answer;
    int size = 0;
    HashMap<String, Integer> map;
    public int solution(String[][] clothes) {
        
        map = new HashMap<>();
        for(int i = 0; i < clothes.length; i++) {
            if(!map.containsKey(clothes[i][1])) {
                map.put(clothes[i][1], 1);
            } else {
                map.put(clothes[i][1], map.get(clothes[i][1])+1);
            }
        }
        
        int answer = 1;
        for(String str : map.keySet()) {
            answer *= map.get(str) +1; // add case if you wear nothing
        }
        
        // you have to wear at least 1
        answer--;

        return answer;
    }
}
