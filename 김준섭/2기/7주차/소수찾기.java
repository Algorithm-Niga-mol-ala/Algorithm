import java.util.*;

class Solution {
    char[] stack;
    boolean[] visit;
    String input;
    int length;
    int answer;
    HashSet<Integer> set;
    public int solution(String numbers) {
        answer = 0;
        length = 1;
        input = numbers;
        set = new HashSet<>();
        while(length <= numbers.length()) {
            stack = new char[length];
            visit = new boolean[numbers.length()];
            perm(0);
            length++;
        }
        
        return set.size();
    }
    
    public void perm(int index) {
        if(index == length) {
            String strNumber = String.valueOf(stack);
            int number = Integer.parseInt(strNumber);
            if(isPrime(number)) {
                set.add(number);
            }
            
            return;
        }
        
        for(int i = 0 ; i < input.length(); i++) {
            if(!visit[i]) {
                visit[i] = true;
                stack[index] = input.charAt(i);
                perm(index+1);
                visit[i] = false;
            }
        }
    }
    
    public boolean isPrime(int temp) {
        if(temp < 2)
            return false;
        int count = 0;
        for(int i = 1; i <= temp; i++) {
            if(count > 2)
                break;
            
            if(temp % i == 0)
                count++;
        }
        
        if(count > 2)
            return false;
        
        return true;
    }
}
