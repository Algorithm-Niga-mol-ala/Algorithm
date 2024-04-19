import java.util.*;
import java.io.*;

class Solution {
    public int solution(int[] citations) {
        int N = citations.length;
      
        int answer=0;
        
        Arrays.sort(citations);
        
        for(int i=0; i<N; i++) {
            int now = N-i;
            if (citations[i]>=now) {
                answer=now; /
                break;
            }
        }
        
        return answer;
    }
}
