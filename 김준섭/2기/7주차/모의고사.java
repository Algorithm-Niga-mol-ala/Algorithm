import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        
        int[] first = {1,2,3,4,5};
        int[] second = {2,1,2,3,2,4,2,5};
        int[] third = {3,3,1,1,2,2,4,4,5,5};
        
        int[] count = new int[3];
        
        for(int i = 0; i < answers.length; i++) {
            if(answers[i] == first[i % first.length])
                count[0]++;
            if(answers[i] == second[i % second.length])
                count[1]++;
            if(answers[i] == third[i % third.length])
                count[2]++;
        }
        ArrayList<Integer> list = new ArrayList<>();
        int max = Math.max(count[0], Math.max(count[1],count[2]));
        for(int i= 0 ; i < 3; i++){
            if(count[i] == max)
                list.add(i+1);
        }
        
        int[] answer = new int[list.size()];
        for(int i = 0 ; i < list.size(); i++)
            answer[i] = list.get(i);
        return answer;
    }
}
