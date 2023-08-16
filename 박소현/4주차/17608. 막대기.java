package day08160822;

import java.util.Arrays;
import java.util.Scanner;

public class Main17608 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] arr = new int[N];

		int count = 1; // 본인은 무조건 보이므로 1로 시작

		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		} // for i문

		// 첫번째로 보이는 막대기가 max라고 하자.
		int max = arr[N - 1];
		for (int j = N - 2; j >= 0; j--) {
			if (arr[j] > max) { // 그 전 인덱스의 값과 max 비교
				count += 1; // 막대기 하나 더 보이므로 +1
				max = arr[j]; // max 재설정
			}
		} // for j문
    
		System.out.println(count); // 출력
	}
}
