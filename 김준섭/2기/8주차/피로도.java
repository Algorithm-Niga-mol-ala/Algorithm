class Solution {
    int[] stack;
    int[][] input;
    int tired;
    boolean[] visit;
    int answer;
    public int solution(int k, int[][] dungeons) {
        answer = 0;
        input = new int[dungeons.length][dungeons[0].length];
        
        for(int i = 0 ; i < dungeons.length; i++) {
            for(int j = 0 ; j < dungeons[i].length; j++) {
                input[i][j] = dungeons[i][j];
            }
        }
        
        tired = k;
        stack = new int[dungeons.length];
        visit = new boolean[dungeons.length];
        
        perm(0);
        return answer;
    }
    
    public void perm(int index) {
        if(index == stack.length) {
            int temp = tired;
            int count = 0;
            
            for(int i = 0; i < stack.length; i++) {
                int need = input[stack[i]][0];
                int used = input[stack[i]][1];
                
                if(temp < need || temp - used < 0) {
                    break;
                }
                
                count++;
                temp -= used;
            }
            
            if(answer < count)
                answer = count;
            
            return;
        }
        
        for(int i = 0 ; i < input.length; i++) {
            if(!visit[i]) {
                visit[i] = true;
                stack[index] = i;
                perm(index+1);
                visit[i] = false;
            }
        }
        
    }
}
