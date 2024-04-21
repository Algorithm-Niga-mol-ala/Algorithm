import java.util.*;
import java.io.*;

class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int r1 = arr1.length; // 행
        int c1 = arr1[0].length; // 열
        int r2 = arr2.length; // 행
        int c2 = arr2[0].length; // 열
        
        int[][] answer = new int[r1][c2];
        for(int i=0; i<r1; i++) {
            for(int h=0; h<c2; h++) {
                int temp = 0;
                for(int j=0; j<c1; j++) {
                    temp += arr1[i][j]*arr2[j][h];
                }
                answer[i][h] = temp;
            }
        }
        return answer;
    }
}
