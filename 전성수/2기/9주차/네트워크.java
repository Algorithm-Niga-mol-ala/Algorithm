import java.util.*;

class Solution {
    static boolean [] checked;
    static Queue<Integer> q;
    public int solution(int n, int[][] computers) {
        int answer = 0;
        
        checked = new boolean[n];
        q = new LinkedList<>();
        for(int i=0; i<n; i++){
            if(!checked[i]){
                bfs(n,i,computers);
                answer++;
            }
        }
       
        return answer;
    }
    void bfs(int n,int x,int [] [] computers){
        q.add(x);
        checked[x] = true;
         while(!q.isEmpty()){
        int now = q.poll();
            
            for(int i =0; i<n; i++){
                if(i!=now && !checked[i]&&computers[now][i]==1){
                    q.add(i);
                    checked[i] = true;
                }
            }
        }
    }
}
