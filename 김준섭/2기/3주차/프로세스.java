import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        int[] temp = new int[priorities.length];
        for(int i = 0 ; i < temp.length; i++)
            temp[i] = priorities[i];
        Arrays.sort(priorities);
        Queue<Integer> process = new LinkedList<>(); 
        for(int i = priorities.length-1; i >= 0; i--) {
            process.add(priorities[i]);
        }
        
        int num = 0;
        while(!process.isEmpty()) {
            for(int i = 0; i < temp.length; i++) {
                if(temp[i] == process.peek()) {
                    process.poll();
                    answer++;
                    if(i == location) {
                        return answer;
                    }
                    num = i+1;
                }                    
            }
            if(num >= priorities.length)
                num = 0;
        }
        
        
        return answer;
    }
    
}
