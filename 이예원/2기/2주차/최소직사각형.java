class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int big = Integer.MIN_VALUE;
        int small = Integer.MIN_VALUE;
        
        for(int r = 0; r < sizes.length; r++){
            
            if(sizes[r][0] > sizes[r][1]){
                big = Math.max(sizes[r][0], big);
                small = Math.max(sizes[r][1], small);
            }else if(sizes[r][0] < sizes[r][1]){
                big = Math.max(sizes[r][1], big);
                small = Math.max(sizes[r][0], small);
            }else{
                big = Math.max(sizes[r][0], big);
                small = Math.max(sizes[r][0], small);
            }

        }
        
        answer = big * small;
        
        
        return answer;
    }
}
