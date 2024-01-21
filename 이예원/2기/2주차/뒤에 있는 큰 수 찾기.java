import java.util.*;
import java.io.*;

class Solution {
    public int[] solution(int[] numbers) {
        
        int[] answer = new int[numbers.length];
        
        Stack<Integer> stack = new Stack<>();
        
        //맨 뒤에서부터 탐색
        for(int i = numbers.length-1; i >= 0; i--){
            while(!stack.isEmpty()){
                if(stack.peek() > numbers[i]){
                    answer[i] = stack.peek();
                    break;
                }else{
                    stack.pop();
                }
            }
            if(stack.isEmpty()){
                answer[i] = -1; //맨 뒷값은 뒷 큰수가 없음
            }
            stack.push(numbers[i]);
        }
        
        
        return answer;
    }
}
