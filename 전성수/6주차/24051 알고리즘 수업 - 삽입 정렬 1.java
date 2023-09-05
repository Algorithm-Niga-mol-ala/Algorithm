import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {

	static int[] A;
	static int[] tmp;
	static int cnt, K, N;
	static StringBuilder sb;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		sb = new StringBuilder();

		String[] NK = br.readLine().split(" ");

		N = Integer.parseInt(NK[0]);
		K = Integer.parseInt(NK[1]);

		String[] As = br.readLine().split(" ");

		A = new int[As.length];
		tmp = new int[As.length];
		
		for(int i=0; i<As.length;i++) {
			A[i]=Integer.parseInt(As[i]);
		}

		
		insertionSort();
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	
	
	static void insertionSort() {
		int j;
		//배웠던 정렬들 기억이 안남...
		for(int i=1; i<A.length;i++) {
			//반복마다 target을 정한 뒤 그 이전 인덱스들을 탐색하면서 target보다 작은 값들은 한칸씩 옮겨서 오름차순 정렬
			int target = A[i];

			for(j=i-1;j>=0 && A[j]>target; j--) {
				A[j+1]=A[j];
				cnt++;
				if(cnt==K) sb.append(String.valueOf(A[j]));
				//변화가 있으면 cnt를 올려줌
			}
			A[j+1] = target;
			//4 5 와 같은 경우  본인에 본인값을 넣어서 변화가 없음
			if((j+1)!=i) {
				cnt++;
				if(cnt==K) sb.append(String.valueOf(target));
				//변화가 있는 경우에면 cnt를 올려줌
			}
		}
		if(cnt<K) {
			sb.append(String.valueOf(-1));
			//변화횟수가 K보다 작으면 -1
		}
	}

}
