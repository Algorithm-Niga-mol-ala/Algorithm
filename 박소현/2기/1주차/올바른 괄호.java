import java.util.*;
import java.io.*;

class Solution {
  // 스택으로 풀었더니 효율성 테스트에서 0점이 나옴 ㅠ.ㅠ -> 다른 풀이로 접근
    boolean solution(String s) {
        boolean answer = true;
        int cnt=0;
        
        for(int i=0; i<s.length(); i++) {
            if (s.charAt(i)=='(') cnt++;
            if (s.charAt(i)==')') cnt--;
            // 닫는 괄호의 개수가 더 많아지면(음수라면) false
            if (cnt<0) {
                answer=false;
                break;
            }
        }
        if (cnt!=0) answer=false;
        return answer;
    }
}
