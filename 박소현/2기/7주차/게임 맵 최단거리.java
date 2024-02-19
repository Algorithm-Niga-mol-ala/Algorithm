import java.util.*;
import java.io.*;

class Solution {
    static class Node {
        int current_r;
        int current_c;
        int current_d;
        
        public Node() {};
        public Node(int current_r, int current_c, int current_d) {
            this.current_r=current_r;
            this.current_c=current_c;
            this.current_d=current_d;
        }
        public String toString() {
            return "["+current_r+","+current_c+","+current_d+"]";
        }
    }
    
    public int solution(int[][] maps) {
        // 최단거리 구하기 = bfs
        int n = maps.length;
        int m = maps[0].length;
        Queue<Node> q = new LinkedList<>();
        boolean[][] visited= new boolean[n][m];
        int[] dr = {0,1,0,-1};
        int[] dc = {1,0,-1,0};
        
        int depth = 1;
        q.add(new Node(0,0,depth));
        visited[0][0]=true;
        
        while(!q.isEmpty()) {
            Node out = q.poll();
            int r = out.current_r;
            int c = out.current_c;
            depth = out.current_d;
            if (r==n-1&&c==m-1) break;
            for(int d=0; d<4; d++) {
                int nr=r+dr[d];
                int nc=c+dc[d];
                if (nr<0||nr>=n||nc<0||nc>=m) continue;
                if (visited[nr][nc]||maps[nr][nc]==0) continue;
                q.add(new Node(nr,nc,depth+1));
                visited[nr][nc]=true;
            }
        }
        
        if (!visited[n-1][m-1]) return -1;
        else return depth;
    }
}
