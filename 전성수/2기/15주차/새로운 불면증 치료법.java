import java.util.*;
import java.io.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int check = (1<<10)-1;

		for(int test_case = 1; test_case <= T; test_case++)
		{
		int N = Integer.parseInt(br.readLine());
        int cnt = 0;
            int visit =0;
            for(cnt =1;;cnt++){
            
                char [] now = String.valueOf(N*cnt).toCharArray();
                for(char c : now){
                int num = c-'0';
                    visit = visit|(1<<num);
                }
                if(visit==check) break;
            }
            System.out.println("#"+test_case+" "+cnt*N);
		}
	}
}
