import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;

public class Main {

	static StringBuilder sb;

	// R뒤집기(순서) D버리기(첫번째수버리기) -> 비어있을 때 쓰면 에러

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		//N 1~100,000
		PriorityQueue<Integer> pq = new PriorityQueue<>((o1,o2)->o2-o1);
		
		for(int i=0; i<N; i++) {
			int now = Integer.parseInt(br.readLine());
			
			if(now==0) {
				if(pq.isEmpty()) {
					
					sb.append(0).append("\n");
				}else {
					
					sb.append(pq.poll()).append("\n");
				}
			}else {
				pq.add(now);
			}
		}
		
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();

	}

}
