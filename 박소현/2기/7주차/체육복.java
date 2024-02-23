import java.util.*;
import java.io.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        boolean[] visited = new boolean[n+2];
        for(int i=0; i<n+2; i++) {
            visited[i]=true;
        }
        for(int i=0; i<lost.length; i++) {
            visited[lost[i]]=false;
        }
        // 여벌 체육복을 도난당한 경우 true처리
        for(int i=0; i<lost.length; i++) {
            for(int j=0; j<reserve.length; j++) {
                if (lost[i]==reserve[j]) {
                    visited[reserve[j]]=true;
                    reserve[j]=0;
                }
            }
        }

        boolean[] visited2 = new boolean[n+2];
        for(int i=0; i<n+2; i++) {
            visited2[i]=visited[i];
        }
        
        int a = oneMethod(n, reserve, visited);
        int b = twoMethod(n, reserve, visited2);
        return Math.max(a,b);
    }
    
    public static int oneMethod(int n, int[] reserve, boolean[] visited) {
        for(int num:reserve) {
            if (num!=0) {
                if (!visited[num-1]) visited[num-1]=true;
                else if (!visited[num+1]) visited[num+1]=true;
            }
        }
        
        int answer = 0;
        for(int i=1; i<n+1; i++) {
            if (visited[i]) answer++;
        }
        return answer;
    }
    
    public static int twoMethod(int n, int[] reserve, boolean[] visited) {
        for(int num:reserve) {
            if (num!=0) {
                if (!visited[num+1]) visited[num+1]=true;
                else if (!visited[num-1]) visited[num-1]=true;
            }
        }
        
        int answer = 0;
        for(int i=1; i<n+1; i++) {
            if (visited[i]) answer++;
        }
        return answer;
    }
}
