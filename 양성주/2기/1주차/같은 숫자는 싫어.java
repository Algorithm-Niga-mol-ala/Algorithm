import java.util.*;

public class Solution {
    public Stack solution(int []arr) {
        Stack<Integer> answer = new Stack<Integer>();
        answer.add(arr[0]);
        for(int i=1;i<arr.length;i++){
        if(arr[i] == answer.peek()){
            continue;
        }else answer.add(arr[i]);
        }
        return answer;
    }
}
