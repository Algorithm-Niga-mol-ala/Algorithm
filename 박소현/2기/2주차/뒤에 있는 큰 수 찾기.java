import java.util.*;
import java.io.*;

class Solution {
    public int[] solution(int[] numbers) {
        int n = numbers.length; // 배열의 길이
        
        // answer을 -1로 초기화하자
        int[] answer = new int[n];
        for(int i=0; i<n; i++) {
            answer[i]=-1;
        }
        
        Stack<Integer> st = new Stack<>();
        st.add(numbers[0]);
        
        for(int i=1; i<n; i++) {
            int k=1;
            if (!st.isEmpty()) {
                while(st.peek()<numbers[i]) {
                    st.pop();
                    // 중간 중간 채워진 answer배열은 넘어가야 하므로 k++처리
                    while(answer[i-k]!=-1) k++;
                    answer[i-k]=numbers[i];
                    k++;
                    if (st.isEmpty()) break;
                }
                st.add(numbers[i]);
            }
            else st.add(numbers[i]);
        }

        return answer;
    }
}
