
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	static int N,S,cnt;
	static int [] nums;
	static boolean [] checked;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
	
		String [] NS = br.readLine().split(" ",0);
		N =Integer.parseInt(NS[0]);
		S = Integer.parseInt(NS[1]);
		
		nums = new int[N];
		
		String [] nums_str = br.readLine().split(" ",0);
		checked = new boolean[N];
		for(int i=0; i<N; i++) {
			nums[i] = Integer.parseInt(nums_str[i]);
		}
		dfs(0);
		System.out.println(cnt);
	}
	
	static void dfs(int depth) {
		
		if(depth!=0) {
			int ans =0;
			for(int i=0; i<N; i++) {
				if(checked[i]) {
					ans+=nums[i];
				}
			}

			if(ans==S) cnt++;
		}
		if(depth==N) {
			return;
		}
		for(int i=depth; i<N; i++) {
			checked[i]=true;
			dfs(i+1);
			checked[i]=false;
		}
			
		
	}
}
