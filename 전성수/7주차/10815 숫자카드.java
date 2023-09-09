
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	static int N, M;
	// 숫자카드의 개수 N. 숫자카드에 적혀있는 수 M. -10,000,000 ~ 10,000,000 사이의 수가 숫자
	static StringBuilder sb;
	static int[] nums, Ms;

	// 500,000 개를 다 확인해야 할 수 도 있음

	// 500,000*500,000을 해버리면 250
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		sb = new StringBuilder();

		N = Integer.parseInt(br.readLine());
		//상근이가 가지고 있는 카드의 개수 
		
		String [] nums_str = br.readLine().split(" ");
		nums = new int[N];
		for(int i=0; i<N; i++) {
			nums[i] = Integer.parseInt(nums_str[i]);
		}//상근이가 가지고 있는 숫자 카드
		
		Arrays.sort(nums);
		//nums 오름차순 정렬
		
		M = Integer.parseInt(br.readLine());
		//상근이가 확인해야 할 숫자의 개수
		String [] Ms_str = br.readLine().split(" ");
		Ms = new int [M];
		
		for(int i=0; i<M; i++) {
			Ms[i]= Integer.parseInt(Ms_str[i]);
		}
		for(int i=0; i<M; i++) {
			compare(0,N-1,Ms[i]);
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	//정렬된 nums를 이진탐색함
	static void compare(int st, int ed, int target) {
		int mid = (st + ed) / 2;
		if (st == ed) {
			if (nums[st] == target) {
				sb.append(String.valueOf(1) + " ");
			} else {
				sb.append(String.valueOf(0) + " ");

			}
			return;
		}

		if (target < nums[mid]) {
			compare(st, mid, target);
		} else if (target > nums[mid]) {
			compare(mid + 1, ed, target);
		} else {
			sb.append(String.valueOf(1) + " ");
			return;
		}

	}

}
