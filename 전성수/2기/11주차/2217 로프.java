import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int i=0; i<N; i++) {
			pq.add(Integer.parseInt(br.readLine()));
		}
		
		
		int num = 0;
		int cnt = N;
		int max = 0;
		while(!pq.isEmpty()) {
			int now = pq.poll();
			cnt--;
			if(num==now) continue;
			
			num= now;
			max = Math.max(max, num*(cnt+1));
		}
		System.out.println(max);
		
	}
}
