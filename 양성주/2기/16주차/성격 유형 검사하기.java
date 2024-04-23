import java.util.*;
    
class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        int[] plus = {0,3,2,1,0,1,2,3};
        Map<Character,Integer> mbti = new HashMap<>();
        mbti.put('R',0);
        mbti.put('T',0);
        mbti.put('C',0);
        mbti.put('F',0);
        mbti.put('J',0);
        mbti.put('M',0);
        mbti.put('A',0);
        mbti.put('N',0);
        
        for(int i=0;i<choices.length;i++){
            if(choices[i]==4) continue;
            
            if(choices[i]<4){
                int count = mbti.get(survey[i].charAt(0));
                mbti.put(survey[i].charAt(0),count+plus[choices[i]]);
            }else{
                int count = mbti.get(survey[i].charAt(1));
                mbti.put(survey[i].charAt(1),count+plus[choices[i]]);
            }
        }
        
        if(mbti.get('R')>=mbti.get('T')){
            answer += "R";
        }else {
            answer += "T";
        }
        
        if(mbti.get('C')>=mbti.get('F')){
            answer += "C";
        }else {
            answer += "F";
        }
        
        if(mbti.get('J')>=mbti.get('M')){
            answer += "J";
        }else {
            answer += "M";
        }
        
        if(mbti.get('A')>=mbti.get('N')){
            answer += "A";
        }else {
            answer += "N";
        }
        
        return answer;
    }
}
