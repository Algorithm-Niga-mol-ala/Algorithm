import java.util.Arrays;
import java.util.Scanner;

public class P2750 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 수의 개수 입력받기
		int[] arr = new int[N]; // 입력받은 수들 넣어줄 배열 생성

		for (int i = 0; i < N; i++) {
			int num = sc.nextInt();
			arr[i] = num;
		} // 입력받기 & 입력받은 수들 배열에 넣어줌

		// 선택정렬
		for (int i = 0; i < N - 1; i++) {
			int minIdx = i; // i번째가 최솟값이라고 가정
			for (int j = i + 1; j < N; j++) {
				if (arr[minIdx] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[minIdx];
					arr[minIdx] = temp;
				}
			} // 몇 번의 교환이 발생하는지 for문
		} // 몇 번의 사이클 돌리는지 for문

		// 출력을 위한 반복문
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
