import java.util.*;
import java.io.*;

class Solution {
    public static int answer, n;
    public static int[] num, choose;
    public int solution(int[] number) {
        n = number.length;
        choose = new int[3];
        num = new int[n];
        for(int i =0; i<n; i++) {
            num[i]=number[i];
        }
        comb(0, 0);
        return answer;
    }
    
    public void comb(int idx, int cidx) {
		if (cidx == 3) {
            int sum =0;
            for(int nums:choose) sum+=nums;
            if (sum==0) answer++;
			return;
		}
		if (idx == n)
			return;

		choose[cidx] = num[idx];
		comb(idx + 1, cidx + 1);
		comb(idx + 1, cidx);

    }
}
