import java.util.*;

class Solution {
    public int solution(int[][] triangle) {
        int answer = 0;
        int length = triangle.length;
        if(length==1){
            return triangle[0][0];
        }
        List<int[]> dp = new ArrayList<>();
        
        for(int i=0; i<=length; i++){
            dp.add(new int[i]);
        }// 0 부터 시작 1번 인덱스가 크기 1의 배열
        
        dp.get(1)[0]=triangle[0][0];
        
        for(int i=2; i<=length;i++){
           for(int j=0; j<i; j++){
               if(j==0){
                   dp.get(i)[0]=dp.get(i-1)[0]+triangle[i-1][0];
               }else if(j==i-1){
                   dp.get(i)[j]=dp.get(j)[j-1]+triangle[i-1][j];
               }else{
                   dp.get(i)[j] = Math.max(dp.get(i-1)[j-1],dp.get(i-1)[j])+triangle[i-1][j];
               }
           }
        }
        for(int i=0;i<length;i++){
            answer = Math.max(answer, dp.get(length)[i]);
        }
        return answer;
    }
}
