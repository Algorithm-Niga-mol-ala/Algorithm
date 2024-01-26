class Solution {
    static boolean[] visited;
    static int[] nums;
    
    public int solution(int n, int[][] computers) {
        int answer = 0; // 네트워크의 수
        visited = new boolean[n]; // 방문처리
        nums = new int[n]; // 노드
        
        for(int i=0; i<n; i++) {
            if (visited[i]) continue;
            answer++;
            dfs(computers, n, i);
        }
        
        return answer;
    }
    
    public static void dfs(int[][] computers, int n, int x) {
        visited[x] = true;
        
        for(int i=0; i<n; i++) {
            if(!visited[i]&&computers[x][i]==1)
                dfs(computers, n, i);
        }
    }
}
