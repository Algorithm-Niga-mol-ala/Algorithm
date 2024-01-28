import java.util.*;
import java.io.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int n = commands.length;
        int[] answer = new int[n];
        for(int i=0; i<n; i++) {
            List<Integer> list = new ArrayList<>();
            int from=commands[i][0]-1;
            int to=commands[i][1]-1;
            while(to>=from) {
                list.add(array[to]);
                to--;
            }
            Collections.sort(list);
            answer[i]=list.get(commands[i][2]-1);
        }
        return answer;
    }
}
