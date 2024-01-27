import java.util.*;
import java.io.*;

class Solution {
    static int answer = 0;
    public int solution(int n, int[][] edge) {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0; i<=n; i++){
            list.add(new ArrayList<Integer>());
        }        
        
        for(int i=0; i<edge.length; i++){
            list.get(edge[i][0]).add(edge[i][1]);
            list.get(edge[i][1]).add(edge[i][0]);
        }
        
       bfs(list, n);
        
        return answer;
    }
    
    void bfs(List<List<Integer>> list, int n){
        boolean [] checked = new boolean[n+1];
        
        Queue<int []> q = new LinkedList<>();
        q.add(new int[] {1,0});
        checked[1] = true;
        int max = 0;
        
        while(!q.isEmpty()){
            int [] now = q.poll();
            
            int v = now[0];
            int depth = now[1];
            
            if(max == depth){
                answer++;
            }else if(max< depth) {
                max = depth;
                answer=1;
            }
            for(int i=0; i<list.get(v).size(); i++){
                if(checked[list.get(v).get(i)]) continue;
                checked[list.get(v).get(i)] = true;
                q.add(new int[]{list.get(v).get(i), depth+1});
            }
            
        }
    }
}
