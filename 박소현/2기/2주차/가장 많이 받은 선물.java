import java.util.*;
import java.io.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int n = friends.length;
        int[][] present = new int[n][n]; // 선물 현황 담을 배열
        for(int i=0; i<gifts.length; i++) {
            StringTokenizer st = new StringTokenizer(gifts[i], " ");
            String give = st.nextToken(); // 준 사람
            String take = st.nextToken(); // 받은 사람
            for(int j=0; j<n; j++) {
                if (give.equals(friends[j])) {
                    for(int k=0; k<n; k++) {
                        if (take.equals(friends[k])) present[j][k]++;
                    }
                }
            }
        } // for
        
        int[][] now = new int[n][3]; // 선물 지수 배열 : 준 횟수, 받은 횟수, 선물지수
        int giveSum = 0;
        int takeSum = 0;
        for(int i=0; i<n; i++) {
            giveSum=0;
            takeSum=0;
            for(int j=0; j<n; j++) {
                giveSum += present[i][j];
                takeSum += present[j][i];
            }
            now[i][0]=giveSum;
            now[i][1]=takeSum;
            now[i][2]=giveSum-takeSum;
        }
        
        int[] nextMonth = new int[n]; // 다음 달 선물 예정 배열
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                // 더 많이 준 사람이 선물 받음
                if (present[i][j]>present[j][i]) nextMonth[i]++;
                // 준 횟수가 같거나 아예 주고받은 적이 없다면 선물지수가 큰 사람이 받음
                else if (present[i][j]==0&&present[j][i]==0 || present[i][j]==present[j][i]) {
                    if (now[i][2]>now[j][2]) nextMonth[i]++;
                }
            }
        }
        
        // 가장 많은 선물을 받은 횟수 구하기
        int answer=0;
        for(int i=0; i<n; i++) {
            answer = Math.max(answer, nextMonth[i]);
        }
        
        return answer;
    }
}
