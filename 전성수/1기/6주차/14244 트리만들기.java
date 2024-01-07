import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
	// 스페셜 저지라서 답이 여러 개임

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		String[] NM = br.readLine().split(" ");

		int N = Integer.parseInt(NM[0]); // 노드의 개수
		int M = Integer.parseInt(NM[1]); // 리프의 개수
		int cnt = 0;
		//간선의 개수
		int node = 0;
		//현재 부모 노드
		int son = node + 1;
		//자식 노드
		
		while (cnt <N-1) {//간선의 개수는 정점의 개수보다 1개 적음
			if (cnt < M) {//리프의 개수를 다 맞춰준 다음에 나머지 노드를 이을 것이므로
				sb.append(node).append(" ").append(son).append("\n");
				//0번 노드에 리프의 개수만큼 자식을 이어줌
				cnt++;
				//그 때마다 간선의 개수를 늘려줌
				if(cnt==M) {
					node=son;
					continue;
					//간선의 개수가 리프의 개수만큼 되면 마지막 자식을 부모로 함
				}
				son++;
				continue;
			}
			//그 후 자식 노드를 쭉 이음
			sb.append(node).append(" ").append(++node).append("\n");
			cnt++;
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
