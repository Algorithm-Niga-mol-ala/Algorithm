import java.util.*;
import java.io.*;

class Solution {
    public int solution(int[] citations) {
        int n = citations.length;
        int answer=0;
        
        Arrays.sort(citations);
        
        for(int i=0; i<n; i++) {
            int cite = n-i;
            if (citations[i]>=cite) {
                answer=cite; // 왜 citations[i]면 안될까? [반례]=[6, 5, 5, 5, 3, 2, 1, 0]
                break; // 어차피 i가 커져도 h-index는 작아지므로 걸리면 바로 break
            }
        }
        
        return answer;
    }
}
