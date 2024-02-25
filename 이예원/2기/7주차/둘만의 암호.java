class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        
        for(int i = 0; i < s.length(); i++){
            char now = s.charAt(i);
            int count = 1;
            while(count <= index){
                now++;
                if(now > 'z')
                    now -= 26;
                if(skip.contains(now + ""))
                    continue;
                else
                    count++;
            }
            answer += now;
        }

        return answer;
    }
}
