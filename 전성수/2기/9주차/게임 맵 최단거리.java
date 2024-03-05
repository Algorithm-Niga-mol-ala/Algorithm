import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        int answer = -1;
        int n = maps.length;
        int m = maps[0].length;
        int [][]  checked = new int [n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m;j++){
                if(maps[i][j]==0){
                    checked[i][j]=1;
                }else {
                    checked[i][j]=Integer.MAX_VALUE;
                }
            }
        }
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0,0,1});
        int [] dr = new int[] {-1,0,1,0}; //북동남서
        int [] dc = new int[] {0,1,0,-1}; //북동남서               
        checked[0][0] = 1;
            while(!q.isEmpty()){
                int [] now = q.poll();
                int r = now[0];
                int c= now[1];
                if(r==n-1 && c == m-1){
                    answer = now[2];
                    break;
                }
                int time =now[2]+1;
                
                for(int k=0; k<4;k++){
                    int nr = r+dr[k];
                    int nc = c+dc[k];
                    if(nr>=0 && nr <n && nc>=0 && nc<m && checked[nr][nc]>time){
                        q.add(new int[]{nr,nc,time});
                        checked[nr][nc] = time;
                    }
                }
            }
        
        return answer;
    }
}
