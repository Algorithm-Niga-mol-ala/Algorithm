import java.util.Arrays;

class Solution {
    public int solution(int[][] triangle) {
        int answer = 0;
        
        int[][] dp = new int[501][501];
        
        
        for (int i = 1; i < triangle.length+1; i++){
            for (int j = 1; j < triangle[i-1].length+1; j++){
                dp[i][j] = Math.max(triangle[i-1][j-1] + dp[i-1][j], triangle[i-1][j-1] + dp[i-1][j-1]);
                answer = Math.max(answer, dp[i][j]);
            }
        }
        
        return answer;
    }
}
