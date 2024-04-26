import java.util.*;
import java.io.*;

class Solution {
    public List<Integer> solution(String[] keymap, String[] targets) {
        int[] alpha = new int[26];
        Arrays.fill(alpha, 101);

        for(int i =0; i<keymap.length; i++) {
            boolean[] check = new boolean[26];
            for(int j=0; j<keymap[i].length(); j++) {
                if (check[keymap[i].charAt(j)-'A']) continue;
                if (j+1<alpha[keymap[i].charAt(j)-'A']) {
                    alpha[keymap[i].charAt(j)-'A']=j+1;
                    check[keymap[i].charAt(j)-'A']=true; 
                }
            }
        }
        List<Integer> list = new ArrayList<>();
        loop: for(int i=0; i<targets.length; i++) {
            int cnt = 0;
            for(int j=0; j<targets[i].length(); j++) {
                char letter = targets[i].charAt(j);
                if (alpha[letter-'A']==101) {
                    list.add(-1);
                    continue loop;
                }
                cnt+=alpha[letter-'A'];
            }
            list.add(cnt);
        }

        return list;
    }
}
