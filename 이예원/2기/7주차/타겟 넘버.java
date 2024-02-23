class Solution {
    
    static int answer = 0;
    
    public int solution(int[] numbers, int target) {
        
        dfs(numbers, target, 0, 0);
        
        return answer;
    }
    
    
    public void dfs(int[] nums, int target, int depth, int sum){
        if(depth == nums.length){
            if(sum == target) answer++;
            
        }else{
                //더하는 경우
                dfs(nums, target, depth+1, sum + nums[depth]);

                //빼는 경우
                dfs(nums, target, depth+1, sum - nums[depth]);
            }
        
    }
        
}
