package week6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main24173_힙정렬1 {
	static int N, K, cnt;
	static int[] arr;
	static int left, right;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());

		// 입력받기
		arr = new int[N + 1];
		st = new StringTokenizer(br.readLine());
		for (int i = 1; i < N + 1; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
//		System.out.println(Arrays.toString(arr));

		heapSort(arr);

		if (cnt < K)
			System.out.println(-1);

	} // main

	public static void heapSort(int[] arr) {
		minHeap(arr);
		for (int i = N; i >= 2; i--) {
			swap(i, 1);
			heapify(1, i - 1);
		}
	}

	public static void minHeap(int[] arr) {
		for (int i = N / 2; i >= 1; i--) {
			heapify(i, N);
		}
	}

	public static void swap(int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
		cnt++;
//		System.out.println(cnt);
//		System.out.println(Arrays.toString(arr));

		if (cnt == K) {
			if (arr[i] < arr[j])
				System.out.println(arr[i] + " " + arr[j]);
			else System.out.println(arr[j] + " " +arr[i]);
		}
		return; // 원하는 cnt가 나오면 그만 재귀 돌리기
	} // swap

	public static void heapify(int k, int N) { //
		left = 2 * k;
		right = 2 * k + 1;
		int smaller;
		// 오른쪽 자식노드가 있는 경우 왼쪽과 오른쪽 중 더 작은 쪽의 인덱스가 smaller
		// 왼쪽 자식노드만 있는 경우 왼쪽이 smaller
		if (right <= N) {
			if (arr[left] < arr[right])
				smaller = left;
			else
				smaller = right;
		} else if (left <= N) {
			smaller = left;
		} else
			return; // 이건 왜 해줌???????????????????

		// 더 작은 번호가 아래에 있다면 swap
		if (arr[smaller] < arr[k]) {
			swap(smaller, k);
			heapify(smaller, N);
		}
	}

}
