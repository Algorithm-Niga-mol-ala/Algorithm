import java.util.*;
import java.io.*;

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        loop: for(int i=(int)Math.sqrt(brown+yellow); i>=1; i--) { // 점점 작아지므로 세로
            for(int j=i; j<=(brown+yellow); j++) { // 점점 커지므로 가로
                if (i*j!=(brown+yellow)) continue;
                if (2*j+2*(i-2)==brown) {
                    answer[0]=j; // 가로
                    answer[1]=i; // 세로
                    break loop;
                }
            }
        }
        return answer;
    }
}
