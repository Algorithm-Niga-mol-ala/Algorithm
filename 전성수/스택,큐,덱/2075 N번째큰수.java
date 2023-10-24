import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {

	static StringBuilder sb;

	// R뒤집기(순서) D버리기(첫번째수버리기) -> 비어있을 때 쓰면 에러

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		//N 1~ 1500
		//표에 적힌 수는 -10억보다 크고 10억보다 작다
		PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				
				return o2-o1;
			}
		});
		int [] [] map = new int [N][N];
		for(int i=0; i<N; i++) {
			String [] row = br.readLine().split(" ");
			for(int j=0; j<N; j++) {
				pq.add(Integer.parseInt(row[j]));
			}
		}//map에 값 입력
		
		for(int i=0; i<N-1; i++) {
			pq.poll();
		}
		sb.append(pq.poll());
		
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();

	}

}
