import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        ArrayList<Integer> queue = new ArrayList<>();
        queue.add(arr[0]);
        for(int i = 1; i < arr.length; i++) {
            if(arr[i-1] != arr[i])
                queue.add(arr[i]);
        }
        
        int[] answer = new int[queue.size()];
        for(int i = 0; i < queue.size(); i++)
            answer[i] = queue.get(i);
        
        return answer;
    }
}
