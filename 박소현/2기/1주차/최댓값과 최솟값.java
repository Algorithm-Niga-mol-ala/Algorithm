import java.util.*;
import java.io.*;

class Solution {
    public String solution(String s){
        String[] arr = s.split(" ");
        int max = Integer.MIN_VALUE; // 최댓값
        int min = Integer.MAX_VALUE; // 최솟값
        
        for(int i=0; i<arr.length; i++) {
            int num = Integer.parseInt(arr[i]);
            max = Math.max(max, num);
            min = Math.min(min, num);
        }

        // 문자열이므로 +로 합치기
        String answer = "";
        answer+=min;
        answer+=" ";
        answer+=max;
        
        return answer;
    }
}
