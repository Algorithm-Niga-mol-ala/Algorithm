import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		int [] N_nums = new int[N];
		String [] nums_str = br.readLine().split(" ",0);
		for(int i=0; i<N; i++) {
			N_nums[i] =Integer.parseInt(nums_str[i]);
		}
		int M = Integer.parseInt(br.readLine());
		
		int [] M_nums = new int[M];
		
		nums_str = br.readLine().split(" ",0);
		
		for(int i=0; i<M; i++) {
			M_nums[i] = Integer.parseInt(nums_str[i]);
		}
		
		Arrays.sort(N_nums);
		
		for(int i=0; i<M; i++) {
			int now = M_nums[i];
			int st = -1;
			int ed = N-1;
			int ans = 0;
			while(st<ed) {
				int mid = (st+ed+1)/2;
				if(N_nums[mid]==now) {
					ans=1;
					break;
				}
				if(N_nums[mid]<now) {
					st=mid;
				}else {
					ed=mid-1;
				}
			}
			sb.append(ans+"\n");
		}
		System.out.println(sb.toString());
		
	}
}
