package algo;

import java.util.Arrays;
import java.util.Scanner;

public class bj24173 {

	public static int N;
	public static int K;
	public static int[] arr;
	public static int cnt;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		K = sc.nextInt();
		arr = new int[N + 1];

		for (int i = 1; i <= N; i++) {
			arr[i] = sc.nextInt();
		}
		heapsort(arr);

		if (cnt < K)
			System.out.println(-1);
	}

	public static void heapsort(int[] arr) {
		buildminheap(arr, N);

		for (int i = N; i >= 2; i--) { 
			swap(1, i); //제일 위에 있는 거랑 아래 있는 거랑 바꾸고
			heapify(arr, 1, i - 1); //제일 아래 꺼 빼고 heapify 규칙 적용
		} 
	}

	public static void buildminheap(int[] arr, int n) {
		// 자식이 있는 것들에 대해서 만족시키게 heapify.
		for (int i = n / 2; i >= 1; i--) {
			heapify(arr, i, n);
		}
	}

	public static void heapify(int[] arr, int k, int n) {
		int left = 2 * k; // 왼쪽 자식 노드.
		int right = 2 * k + 1; // 오른쪽 자식 노드.
		int smaller;
		if (right <= n) {
			if (arr[left] < arr[right]) {
				smaller = left;
			} else {
				smaller = right;
			}
		} else if (left <= n) {
			smaller = left;
		} else { // 자식이 없을 경우 리턴.
			return;
		}

		// 자식 중에 작은 거가 smaller, k는 본인.
		if (arr[smaller] < arr[k]) { // 본인이 크다면.
			swap(k, smaller); // 큰 게 아래로 내려간다.
			heapify(arr, smaller, n); // 내려간 것에 대해서 또 정렬.
		}

		
	}

	public static void swap(int a, int b) { //a랑 b자리 바꾸기
		cnt++;
		if(cnt == K) {
			if(arr[a] < arr[b]) //작은 것부터 정렬해서 출력하므로.
				System.out.println(arr[a] + " " + arr[b]);	
			else
				System.out.println(arr[b] + " " + arr[a]);	
		}
		int tmp = arr[a];
		arr[a] = arr[b];
		arr[b] = tmp;
	}

}
