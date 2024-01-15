import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hash = new HashMap<>();
        
        for(String str : completion) {
            if(!hash.containsKey(str)) {
                hash.put(str, 1);
            } else {
                hash.put(str, hash.get(str)+1);
            }
        }
        
        for(String str : participant) {
            if(!hash.containsKey(str))
                return str;
            else {
                if(hash.get(str) >= 1) {
                    hash.put(str, hash.get(str)-1);
                } else {
                    return str;
                }                
            } 
        }
        
        return answer;
    }
}
