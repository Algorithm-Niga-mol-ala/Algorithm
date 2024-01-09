import java.util.*;
import java.io.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score); // 정렬
      
        for(int i=score.length-1; i>=0; i-=m) { // 오름차순이므로 length-1부터 시작.
          if (i-(m-1)<0) break; // 배열의 범위를 벗어나면 break
          answer += score[i-(m-1)]*m; // m개씩 묶었을 때 최하의 점수는 i-(m-1)번째의 사과점수이므로
        }
        return answer;
    }
}
