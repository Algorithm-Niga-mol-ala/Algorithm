class Solution {
    static int answer = 0;
    static boolean [] checked ;
    public int solution(int[] numbers, int target) {
        int length = numbers.length;
        checked = new boolean[length];
        dfs(0,length, target,numbers);
        return answer;
    }
    void dfs(int depth,int length,int  target,int [] numbers){
    if(depth==length){
        int ans =0;
        for(int i=0; i<length; i++){
            if(checked[i]) ans +=  numbers[i];
            else{ans-= numbers[i];}
        }
        if(ans==target) answer ++;
        return;
    }
        
            checked[depth] = true;
            dfs(depth+1,length, target,numbers);
            checked[depth] = false;
            dfs(depth+1,length, target,numbers);
        
    }
}
