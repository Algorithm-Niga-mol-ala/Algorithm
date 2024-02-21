
import java.util.Stack;

class Solution {
    boolean solution(String s) {
        boolean answer = false;
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == '(')
                st.push(1);
            else {
                if(st.empty())
                    return answer;
                st.pop();
            }
        }
        if(st.empty())
            answer = true;
        return answer;
    }
}
