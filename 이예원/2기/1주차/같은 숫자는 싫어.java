import java.util.*;
import java.io.*;

public class Solution {
    public int[] solution(int []arr) {
        
        Stack<Integer> stack = new Stack<>();
        
        for(int i = 0; i < arr.length; i++){
            stack.push(arr[i]);
        }
        
        Stack<Integer> stack2 = new Stack<>();
        
        stack2.push(stack.pop());
        
        int size = stack.size();
        
        for(int i = 0; i < size; i++){
            
            if(stack.size() != 0 && stack.peek() != stack2.peek()){
                stack2.push(stack.pop());
            }else{
                stack.pop();
            }
        }
        
        int[] ans = new int[stack2.size()];
        
        for(int i = 0; i < ans.length; i++){
            ans[i] = stack2.pop();
        }

        return ans;
    }
}
