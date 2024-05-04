import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
		static ArrayList<Integer> list;
		static boolean [] in;
		static boolean [] out;
		static int [] nums;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		nums = new int[N+1];
		
		for(int i=0; i<N; i++) {
			int now = Integer.parseInt(br.readLine());
			
			nums[i+1]= now;
		}
		ArrayList<Integer> ans = new ArrayList<>();
		boolean [] already = new boolean[N+1];
		for(int i=1; i<=N; i++) {
			list = new ArrayList<>();
			in = new boolean[N+1];
			out = new boolean[N+1];
			boolean flag = true;
			dfs(i);
			
			
			for(int j: list) {
				if(!find()) {
					flag = false;
					break;
				}
			}
			if(flag) {
				for(int j: list) {
					if(already[j]) continue;
					already[j] = true;
					ans.add(j);
				}
			}
		}
		Collections.sort(ans);
		
		sb.append(ans.size()+"\n");
		
		for(int i: ans) {
			sb.append(i+"\n");
		}
		
		System.out.println(sb.toString());
		
	}

	private static boolean find() {
		for(int i: list) {
			if(in[i] && out[i]) {
				continue;
			}
			return false;
		}
		return true;
	}

	private static void dfs(int i) {
		list.add(i);
		in[i] = true;
		out[nums[i]] = true;
		if(in[nums[i]]&&out[nums[i]]) return;
		dfs(nums[i]);
		
	}
	

}
