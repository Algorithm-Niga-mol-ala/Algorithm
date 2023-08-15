
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// N개의 수가 주어졌을 때 이를 오름차순으로 정렬

		// 첫째 줄에 N 입력, 둘째 줄부터 N개의 줄에 수가 주어짐

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[] arr = new int[N]; // N크기의 배열 생성

		for (int i = 0; i < N; i++) { // 요소값 입력받기
			arr[i] = sc.nextInt();
		}

		// 최댓값 구하기

		int max = -1;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		// 최댓값 +1 길이의 배열 생성
		int[] count = new int[max + 1];

		// count 배열에 arr요소의 값을 인덱스로 하나씩 넣어주기
		for (int i = 0; i < arr.length; i++) {
			count[arr[i]]++;
		}

		// 누적합
		for (int i = 1; i < count.length; i++) {
			count[i] += count[i - 1];
		}

		// 뒤에서부터 하나씩 순서대로 값 넣어주기
		int[] sortArr = new int[arr.length];

		for (int i = arr.length - 1; i >= 0; i--) {
			sortArr[--count[arr[i]]] = arr[i];
		}

		// 출력
		for (int i = 0; i < sortArr.length; i++) {
			System.out.println(sortArr[i]);
		}

	}// main

}// class
