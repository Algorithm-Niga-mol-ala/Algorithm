
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * N개의 수가 주어졌을 때, 오름차순으로 정렬하는 프로그램
		 * 
		 * 첫째 줄에는 수의 개수 N 입력 둘째줄부터 수가 N개 주어진다
		 */

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); // N의 값 입력받기

		int[] nums = new int[N];

		for (int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt(); // nums배열에 수 N개 저장
		}

		// 선택정렬을 사용해서 오름차순 정렬을 해보자~
		for (int i = 0; i < nums.length - 1; i++) {
			int minIdx = i; // 최솟값의 인덱스!! 넘버 저장
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[j] < nums[minIdx]) {
					minIdx = j;
				} // 전체를 돌아서 최솟값의 인덱스가 결정된다면
			}
			int tmp = nums[i];
			nums[i] = nums[minIdx];
			nums[minIdx] = tmp; // 값을 바꿔줍니다
		}

		// 배열의 요소를 하나씩 출력하기
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}

	}// main

}// class
