import java.util.Arrays;
import java.util.Scanner;

public class Main11399 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		// 시간 담을 배열 선언 & 요소에 입력 넣기
		int[] time = new int[N];

		for (int i = 0; i < N; i++) {
			time[i] = sc.nextInt();
		}

		// 정렬
		Arrays.sort(time);
		
		// 누적시간 구하기 위해 배열 선언
		int[] min = new int[N];
		min[0] = time[0];
		int sum = 0;

		// 누적시간으로 요소 넣기
		for (int i = 1; i < min.length; i++) {
			min[i] = time[i];
			min[i] += min[i - 1];
		}
		
		// 합 구하기
		for (int i = 0; i < N; i++) {
			sum += min[i];
		}
		
		System.out.println(sum);
	}

}
