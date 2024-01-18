import java.util.*;
class Solution {
    public long solution(long n) {
        String answer = "";
    
        String[] arrStr = String.valueOf(n).split("");
        Arrays.sort(arrStr);
    
        long[] arrNum = new long[arrStr.length];
        for(int i=0;i<arrStr.length;i++){
            arrNum[i] = Long.parseLong(arrStr[i]);
        }
    
        for(int i=0;i<arrStr.length;i++){
            answer += arrNum[arrStr.length-i-1];
        }
        return Long.parseLong(answer);
    }
}
