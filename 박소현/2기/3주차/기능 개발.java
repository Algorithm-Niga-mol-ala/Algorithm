import java.util.*;
import java.io.*;

class Solution {
    public List solution(int[] progresses, int[] speeds) {
        Queue<Integer> q = new LinkedList<>();
        int n = progresses.length;
        for(int i=0; i<n; i++) {
            if ((100-progresses[i])%speeds[i]==0) 
                q.add((100-progresses[i])/speeds[i]);
            else q.add((100-progresses[i])/speeds[i]+1);
        }
        
        List<Integer> list = new ArrayList<>();
        while (!q.isEmpty()) {
            int day = q.poll();
            int cnt = 1;
            if (q.isEmpty()) {
                list.add(cnt);
                break;
            }
            while (day >= q.peek()) {
                cnt++;
                q.poll();
                if (q.isEmpty()) {
                  break;
                }
            }
            list.add(cnt);
        }

        return list;
    }
}
