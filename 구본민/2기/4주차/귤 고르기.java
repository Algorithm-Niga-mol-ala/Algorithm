import java.util.*;
import java.io.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        //가장 큰 귤부터 찾아 max에 넣어
        int max = 0;
        for(int i=0;i<tangerine.length;i++){
            if(max < tangerine[i]) max = tangerine[i];
        }

        //max+1 만큼의 크기를 가진 배열 생성
        int[] numOfSize = new int[max+1];
        //사이즈 별로 갯수 파악
        for(int i=0;i<tangerine.length;i++){
            numOfSize[tangerine[i]]++;
        }
        //정렬
        Arrays.sort(numOfSize);
        //역순으로 반복문 진행하면서 박스 갯수만 파악
        int num =0;
        for(int i=numOfSize.length-1;i>=1;i--){
            num += numOfSize[i];
            answer++;
            if(num >= k) break;
        }
        
        return answer;
    }
}
