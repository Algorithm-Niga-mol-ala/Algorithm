import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_10989_수정렬하기3 {

	public static void main(String[] args) throws IOException {
		// 개수는 많은데 입력은 1~10,000까지라고?
		// 이거는 까오링 정렬이다..!
		// 근데 까오링 정렬 써도 시간초과가 뜬다
		// 버퍼드도 쓰자.. 
		
		int[] cnt = new int[10001]; // count를 담을 배열 선언 
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		for (int i=0; i<N; i++) {
			cnt[Integer.parseInt(br.readLine())]++;
		}
		
		br.close();
		
		for (int i=1; i<10001; i++) { // N개 입력 받기 ( 입력은 자연수이기에 ) 
			while( cnt[i] >0 ) {
				sb.append(i).append('\n');
				cnt[i]--;
			}
		}
		
		System.out.println(sb);
	}
}
