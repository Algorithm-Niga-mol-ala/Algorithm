import java.util.*;

class Solution {
    static int answer;
    public int solution(int k, int[][] dungeons) {
        answer = -1;
        
        //순열을 뽑아서 최대 ans 값을 리턴
        int [] arr = new int [dungeons.length];
        boolean [] checked = new boolean[dungeons.length];
        dfs(0,k,dungeons,arr,checked);
        
        return answer;
    }
    
    void dfs(int depth,int k,int[][] dungeons, int [] arr,boolean [] checked){
        if(depth==dungeons.length){
            int degree =k;
            int  cnt =0;
            for(int i=0; i<arr.length; i++){
                if(degree>=dungeons[arr[i]][0]){
                    degree-=dungeons[arr[i]][1];
                    cnt++;
                    continue;}
            }
            answer = Math.max(answer,cnt);
        return;
            }
        for(int i=0; i<dungeons.length;i++){
            if(checked[i]) continue;
            arr[depth] = i;
            checked[i] = true;
            dfs(depth+1,k,dungeons, arr,checked);
            checked[i] = false;
        }
    }
}
