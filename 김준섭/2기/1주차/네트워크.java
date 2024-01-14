class Solution {
    static boolean[][] visit;
    public int solution(int n, int[][] computers) {
        int answer = 0;
        visit = new boolean[n][n];
        
        for(int i = 0 ; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(computers[i][j] == 1 && !visit[i][j]) {
                    dfs(computers, i, j);
                    answer++;
                }
            }
        }
        
        return answer;
    }
    
    void dfs(int[][] computers, int row, int col) {
        if(computers[row][col] != 1 || visit[row][col])
            return;
        
        visit[row][col] = true;
        visit[col][row] = true;
        
        for(int i = 0; i < computers.length; i++) {
            if(computers[row][i] == 1 && !visit[row][i]) {
                dfs(computers, i, row);
            }
        }
    }
}
