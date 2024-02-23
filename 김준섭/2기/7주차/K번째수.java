import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < commands.length; i++) {
            int size = commands[i][1] - commands[i][0] + 1;
            int[] temp = new int[size];
            int index = 0;
            
            for(int j =  commands[i][0] -1; j < commands[i][1]; j++) {
                temp[index++] = array[j];
            }
            Arrays.sort(temp);
            list.add(temp[commands[i][2]-1]);
        }
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++)
            answer[i] = list.get(i);
        
        return answer;
    }
}
