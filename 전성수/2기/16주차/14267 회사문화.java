import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MulticastSocket;
import java.util.ArrayList;

public class Main {
	static ArrayList<Integer>[] child;
	static int [] scores;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String [] nm = br.readLine().split(" ",0);	
		int n = Integer.parseInt(nm[0]);
		int m = Integer.parseInt(nm[1]);
		
		 child = new ArrayList[n+1];
		 scores = new int[n+1];
		String [] parents = br.readLine().split(" ",0);
		
		for(int i=0; i<=n; i++) {
			child[i] = new ArrayList<Integer>();
		}
		
		for(int i=1;i<n; i++) {
			child[Integer.parseInt(parents[i])].add(i+1);
		}
		
		for(int i=0; i<m; i++) {
			String [] row = br.readLine().split(" ",0);
			int num = Integer.parseInt(row[0]);
			int score = Integer.parseInt(row[1]);
			
			scores[num] += score;
		}
		cheer(1);
		for(int i=1; i<=n; i++) {
			sb.append(scores[i]+" ");
		}
		
		System.out.println(sb.toString());
	}

	private static void cheer(int num) {
		for(int nxt : child[num]) {
			scores[nxt]+=scores[num];
			cheer(nxt);
		}
		
	}
}
