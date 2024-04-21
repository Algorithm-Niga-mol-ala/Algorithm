import java.util.*;
import java.io.*;
 
 
class Solution
{
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
           StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for(int test_case = 1; test_case <= T; test_case++)
        {
            sb.append("#"+test_case+" ");
        String [] now = br.readLine().split(" ",0);
            int N = Integer.parseInt(now[0]);
            int M = Integer.parseInt(now[1]);
             
            int N_num = (1<<N)-1;
            if(N_num==(M&N_num)){
            sb.append("ON"+"\n");
            }else{
            sb.append("OFF"+"\n");
            }
 
 
        }
        System.out.println(sb.toString());
    }
}
