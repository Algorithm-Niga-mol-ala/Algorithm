import java.util.Scanner;

public class P2587 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		// 선택정렬
		for (int j = 0; j < arr.length - 1; j++) {
			int minIdx = j; // 최소값의 인덱스는 j라고 가정
			for (int k = j + 1; k < arr.length; k++) {
				if (arr[minIdx] > arr[k]) {
					int temp = arr[k];
					arr[k] = arr[minIdx];
					arr[minIdx] = temp;
				}
			} // 교환 for문
		} // 사이클 for문

		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(sum/arr.length);
		System.out.println(arr[2]);
	}
}
