class Solution {
    public int solution(int[][] sizes) {
        int widthMax = 0;
        int heightMax = 0;
        
        for(int i = 0; i < sizes.length ;i++) {
            int max = Math.max(sizes[i][0], sizes[i][1]);
            int min = Math.min(sizes[i][0], sizes[i][1]);
            sizes[i][0] = max;
            sizes[i][1] = min;
            
            widthMax = Math.max(widthMax, sizes[i][0]);
            heightMax = Math.max(heightMax, sizes[i][1]);
        }
        
        return widthMax*heightMax;
    }
}
