import java.util.*;
import java.io.*;

class Solution {
    public int solution(String s) {
        String[] str = s.split("");
        Stack<String> st = new Stack<>();
        st.add(str[0]); // 맨 처음 문자는 스택에 넣고 시작하자
        
        // 스택이 비어있지 않다면 peek한 것과 비교했을 때 같을 경우 pop하기
        // 그렇지 않다면 무조건 add하기
        for(int i=1; i<str.length; i++) {
            if (!st.isEmpty() && st.peek().equals(str[i])) st.pop();
            else st.add(str[i]);
        }
        
        int answer = -1;
        answer= st.isEmpty()? 1:0;

        return answer;
    }
}
