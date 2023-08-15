import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class No_2751_수정렬하기2 {

	public static void main(String[] args) {
		// 첫째 줄에 수의 개수가 1~1,000,000
		// 주어지는 수도 1,000,000보다 작거나 같은 정수
		// 시간복잡도가 많이 걸리는 문제겠다.. O(N^2) 정렬로는 무리
		// 카운팅 정렬도 n+k인지라 수가 너무 높다.
		// 머지나 힙 정렬같이 O(nlogn) 정렬이 적합한데 안배웠네
		// 그래서 내장객체인 Colletcion.sort()를 활용해본다. (timsort = 삽입과 합병을 결합)
		// Arrays.sort는 듀얼 피벗 퀵소트기에 시간복잡도가 o(n^2)일 수도 있기에
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		ArrayList<Integer> tc = new ArrayList<>();
		
		for (int i=0; i<N; i++) {
			tc.add(sc.nextInt());
		}
		
		Collections.sort(tc);
		
		// 시간초과가 뜬다. StringBuilder로 실행속도 높이기 고
//		for (int i=0; i<N; i++) {
//			System.out.println(tc.get(i));
//		}
	
		StringBuilder sb = new StringBuilder();
		
		for (int i : tc) {
			sb.append(i).append('\n');
		}
		
		System.out.println(sb);

	}

}
