import java.util.*;
import java.io.*;

class Solution {
    public List<Integer> solution(String s) {
        int[] alpha = new int[26];
        Arrays.fill(alpha, -1);
        
        String[] arr = s.split("");
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++) {
            if (alpha[arr[i].charAt(0)-'a']==-1) {
                list.add(-1);
                alpha[arr[i].charAt(0)-'a']=i;
            } else {
                int origin = alpha[arr[i].charAt(0)-'a'];
                alpha[arr[i].charAt(0)-'a']=i;
                list.add(i-origin);
            }
        }
        return list;
    }
}
