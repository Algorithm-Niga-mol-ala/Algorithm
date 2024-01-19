import java.util.*;
import java.io.*;

class Solution {
    static int n, m, cnt;
    static int[] answer;
    static int[] dr={0,1,0,-1};
    static int[] dc={1,0,-1,0};
    static boolean[][] visited;
    
    public int[] solution(String[] maps) {
        n = maps.length; // 행
        m = maps[0].length(); // 열
        
        String[][] island = new String[n][m];
        for(int i=0; i<n; i++) {
            String[] str = maps[i].split("");
            for(int j=0; j<m; j++) {
                island[i][j] = str[j];
            }
        } // 입력 끝
        
        visited = new boolean[n][m];
        // 정답배열의 길이를 모르므로 리스트에 담고 배열로 옮기자
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if (island[i][j].equals("X")||visited[i][j]) continue;
                cnt=Integer.parseInt(island[i][j]);
                dfs(island, i, j);
                list.add(cnt);
            }
        }
        
        // 정답배열로 옮기기
        if (list.size()!=0) {
            answer = new int[list.size()];
            for(int i=0; i<list.size(); i++) {
                answer[i]=list.get(i);
            }
            Arrays.sort(answer);
        } else {
            answer = new int[1];
            answer[0] = -1;
        }
        return answer;
    } // main
    
    public static void dfs(String[][] map, int r, int c) {
        visited[r][c] = true;
        for(int d=0; d<4; d++) {
            int nr=r+dr[d];
            int nc=c+dc[d];
            if (nr<0||nr>=n||nc<0||nc>=m) continue;
            if (visited[nr][nc]||map[nr][nc].equals("X")) continue;
            visited[nr][nc]=true;
            cnt+=Integer.parseInt(map[nr][nc]);
            dfs(map, nr, nc);
        }
    } // dfs
}
