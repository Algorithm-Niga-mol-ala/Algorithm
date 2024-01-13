import java.util.*;
import java.io.*;

class Solution {
    public int solution(String s) {
        Stack<Integer> st = new Stack<>();
        String[] str = s.split(" ");
        int answer=Integer.parseInt(str[0]); // Z는 맨 처음에 나오지 않음
        
        // Z가 나오면 이전 숫자 빼주기. 숫자면 더해주기
        for(int i=1; i<str.length; i++) {
            if (str[i].equals("Z")) {
                answer-=Integer.parseInt(str[i-1]);
                continue;
            }
            answer+=Integer.parseInt(str[i]);
        }
        return answer;
    }
}
