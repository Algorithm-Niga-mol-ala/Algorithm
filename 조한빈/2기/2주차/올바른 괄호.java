import java.util.Deque;
import java.util.ArrayDeque;

class Solution {
    boolean solution(String s) {

        Deque<Character> stack = new ArrayDeque<>();
        
        for (int j = 0; j < s.length(); j++){
            char i = s.charAt(j);
            
            if (!stack.isEmpty()){
                if (i == ')' && stack.peek() == '('){
                    stack.pop();
                } else {
                    stack.push(i);
                }
            } else {
                stack.push(i);
            }
        }
        
        return stack.isEmpty();
    }
}

// 시간 초과가 나서 Queue, Stack을 대체할 수 있으면서 속도도 더 빠른 ArrayDeque를 사용해서 풀었는데 좀 편법같기도 하고
