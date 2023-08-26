
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		
		StringTokenizer NM = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(NM.nextToken());
		//카드 개수
		int M = Integer.parseInt(NM.nextToken());
		//타겟 숫자 M
		
		StringTokenizer  card_Token = new StringTokenizer(br.readLine());
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		for(int i=0; i<N ;i++) {
			pq.add(Integer.parseInt(card_Token.nextToken()));
		}
		
		int [] cards = new int [N];
		
		for(int i=0; i<N; i++) {
			cards[i] = pq.poll(); // 오름차순 정렬이 되어 있음
		}
		
		int i=0;
		int j=i+1;
		int ans=0;
		
		while(i<N-2) { 	// i는 첫번째 카드 j 는 두번째 카드 k는 3번째 카드
						//시작은 i=0; j= i+1; k= j+1~끝
			for(int k=j+1; k< cards.length;k++) {
				int sum = cards[i]+cards[j]+cards[k];
				if(sum<=M) {
					ans=Math.max(ans, sum);
				}else if(sum>M) break;
						//뒤는 볼 필요가 없음
			}
			j++;		//j를 올리고 다시 반복
			if(j==N-1) {//j가 끝에 도달하면 i를 1올리고 다시 반복
				i++;
				j=i+1;
			}
		}
		sb.append(ans);
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();

	}
}
