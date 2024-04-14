class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] score = {0,0,0};
        for(int i = 0; i < answers.length; i++){
            if((i+1)%5 == answers[i])
                score[0]++;
            if((i+1)%3 == answers[i])
                score[1]++;
            if((i+12/13 + 2) == answers[i])
                score[2]++;
        }
        return answer;
    }
}
