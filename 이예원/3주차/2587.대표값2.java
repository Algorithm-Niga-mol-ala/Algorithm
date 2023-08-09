import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * 다섯개의 자연수가 주어질 때 평균과 중앙값을 구하기 첫째 줄부터 다섯째 줄까지 한줄에 하나씩 자연수
		 * 
		 * 출력은 첫째줄에 평균 둘째줄에 중앙값
		 */

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[5];

		for (int i = 0; i < 5; i++) { // 길이 5인 배열에 값 입력받기
			arr[i] = sc.nextInt();
		}

		// 평균 출력
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}

		// 중앙값 출력
		int ave = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 1; j < arr.length - i; j++) {
				if (arr[j - 1] > arr[j]) {
					int tmp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = tmp;
				}
			} // 정렬이 끝나면
			ave = arr[arr.length / 2];
		}

		System.out.println(sum / arr.length);
		System.out.println(ave);

	}// main

}// class
