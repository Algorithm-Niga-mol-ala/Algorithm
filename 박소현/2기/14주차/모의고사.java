import java.util.*;
import java.io.*;

class Solution {
    public List<Integer> solution(int[] answers) {
        int[][] giveup = new int[3][10000];
        int[] one = {1,2,3,4,5};
        int[] two = {0,1,0,3,0,4,0,5};
        int[] three = {3,3,1,1,2,2,4,4,5,5};
        
        for(int i=0; i<10000; i++) {
            giveup[0][i] = one[i%5];
            if (i%2==0) {
                giveup[1][i]=2;
            } else {
                giveup[1][i]=two[i%8];
            }
            giveup[2][i]=three[i%10];
        }
        int n = answers.length;
        Map<Integer,Integer> map = new TreeMap<>();
        for(int i=0; i<n; i++) {
            if (giveup[0][i]==answers[i]) {
                map.put(1, map.getOrDefault(1,0)+1);
            }
            if (giveup[1][i]==answers[i]) {
                map.put(2, map.getOrDefault(2,0)+1);
            }
            if (giveup[2][i]==answers[i]) {
                map.put(3, map.getOrDefault(3,0)+1);
            }
        }
        List<Integer> list = new ArrayList<>();
        int max = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (max>entry.getValue()) continue;
            if (max<entry.getValue()) {
                list.clear();
            }
            max=entry.getValue();
            list.add(entry.getKey());
        }
        Collections.sort(list);
        return list;
    }
}
