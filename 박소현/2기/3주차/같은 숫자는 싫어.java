import java.util.*;
import java.io.*;

public class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> st = new Stack<>();
        st.add(arr[0]);
        
        int k=1;
        while(k<arr.length) {
            if (!st.isEmpty()) {
                if (st.peek()!=arr[k]) st.add(arr[k]);
            } else st.add(arr[k]);
            k++;
        }
        
        int[] answer = new int [st.size()];
        for(int i=st.size()-1; i>=0; i--) {
            answer[i]=st.pop();
        }
        return answer;
    }
}
