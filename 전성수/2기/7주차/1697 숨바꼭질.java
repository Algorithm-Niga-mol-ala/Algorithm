import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	
	static int [] parent;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		String [] NK = br.readLine().split(" ",0);
		int N = Integer.parseInt(NK[0]);	//수빈	
		int K = Integer.parseInt(NK[1]);	//동생
		
		boolean [] checked = new boolean[100_001];
		Queue<int []> q = new LinkedList<>();
		int sec =0;
		q.add(new int [] {N,0});
		checked[N]=true;
		while(!q.isEmpty()) {
			int [] now = q.poll();
			int posi = now[0];
			int time = now[1];
			if(posi==K) {
				sec =time;
				break;
			}
			if(posi-1>=0 && !checked[posi-1]) {
				q.add(new int[] {posi-1,time+1});
				checked[posi-1]=true;
			}
			if(posi+1<=100_000 && !checked[posi+1]){
				q.add(new int[] {posi+1,time+1});
				checked[posi+1]=true;
			}
			if(2*posi<=100_000 && !checked[2*posi]) {
				q.add(new int[] {2*posi,time+1});
				checked[2*posi]=true;
			}
		}
		System.out.println(sec);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	
}
