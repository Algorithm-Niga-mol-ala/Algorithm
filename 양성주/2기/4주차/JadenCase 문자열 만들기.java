class Solution {
    public String solution(String s) {
        String answer = "";
        s = s.toLowerCase();
        answer += (s.charAt(0)+"").toUpperCase();
        for(int i=1;i<s.length();i++) {
			String c = s.charAt(i)+"";
			if(s.charAt(i-1)==' ') {
				answer += c.toUpperCase();
			}else{
                answer += c;
            }
		}
        return answer;
    }
}
