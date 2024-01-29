import java.util.*;
import java.io.*;

class Solution {
    public int solution(String[][] clothes) {
        int n = clothes.length;
        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++) {
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1],0)+1);
        }
        // 해당 의상의 종류 수+1(안 입는다는 경우의 수)끼리 곱한 뒤 -1(싹 다 발가벗은 경우)
        int answer=1;
        for(int num : map.values()) {
            answer*=(num+1);
        }
        return answer-1;
    }
}
