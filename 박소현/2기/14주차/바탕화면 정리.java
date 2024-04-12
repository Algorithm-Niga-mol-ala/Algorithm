import java.util.*;
import java.io.*;

class Solution {
    public int[] solution(String[] wallpaper) {
        int n = wallpaper.length;
        int m = wallpaper[0].length();
        int r1=n;
        int c1=m;
        int r2=-1;
        int c2=-1;
        for(int i=0; i<n; i++) {
            if (wallpaper[i].contains("#")) {
                r1=Math.min(r1,i);
                r2=Math.max(r2,i);
            }
            for(int j=0; j<m; j++) {
                if (wallpaper[i].charAt(j)=='#') {
                    c1=Math.min(c1,j);
                    c2=Math.max(c2,j);
                }
            }
        }
        
        int[] answer = {r1,c1,r2+1,c2+1};
        return answer;
    }
}
