import java.util.Arrays;

class Solution {
    public long solution(long n) {
        String answer = "";
		String str = n+"";
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        for(int i=ch.length-1;i>=0;i--) {
        	answer += ch[i];
        }
        long num = Long.parseLong(answer);
        return num;
    }
}
