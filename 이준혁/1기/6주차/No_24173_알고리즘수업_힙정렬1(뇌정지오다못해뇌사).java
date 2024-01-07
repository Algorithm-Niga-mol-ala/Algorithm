import java.util.Arrays;
import java.util.Scanner;

public class No_24173_알고리즘수업_힙정렬1 {
	
	// https://st-lab.tistory.com/225 (참고하기 좋음)
	// https://www.youtube.com/watch?v=iyl9bfp_8ag (동빈나 힙정렬 강좌)

	static int N = 5;
	static int[] arr = new int[5];
	
	static void heapSort() {
		
		// 트리 구조를 힙 구조로 바꾼다.
		for (int i=1; i<N; i++) {
			int c = i;
			do {
				int root = (c-1) / 2;
				if (arr[root] > arr[c]) {
					int tmp = arr[root];
					arr[root] = arr[c];
					arr[c] = tmp;
					
					System.out.println(Arrays.toString(arr));
				}
				c = root;
			} while ( c != 0);
		}
		
		// 크기를 줄여가며 반복적으로 힙을 구성
		for (int i=N-1; i>=0; i--) {
			int tmp = arr[0];
			arr[0] = arr[i];
			arr[i] = tmp;
			int root = 0;
			int c = 1;
			do {
				c = 2 * root + 1;
				
				// 자식 중에 더 작은 값을 찾기
				if (c < i-1 && arr[c] > arr[c+1]) {
					c++;
				}
				
				// 루트보다 자식이 더 작다면 교환
				if (c < i && arr[root] > arr[c] ) {
					int temp = arr[root];
					arr[root] = arr[c];
					arr[c] = temp;
					System.out.println(Arrays.toString(arr));
				}
				root = c;
			} while ( c < i );
		}
	}
	
	public static void main(String[] args) {
		arr = new int[] { 2, 5, 1, 4, 3 };
		heapSort();
		
		System.out.println(Arrays.toString(arr));
	}
	
}
	
	
	
	
//	static void heap_sort(int[] arr, int n) {
//		build_min_heap(arr, n);
//		for (int i=n; i>2; i--) {
//			int tmp = arr[1];
//			arr[1] = arr[i];
//			arr[i] = tmp;
//			
//			heapify(arr, 1, i-1);
//		}
//	}
//	
//	static void build_min_heap(int[] arr, int n) {
//		for (int i=n/2; i>1; i--) {
//			heapify(arr, i, n);
//		}
//	}
//	
//	// 최소 힙 구성
//	static void heapify(int[] arr, int k, int n) {
//		int left = 2*k;
//		int right = 2*k+1;
//		int smaller = 0;
//		
//		if (right <= n) {
//			if (arr[left] < arr[right]) {
//				smaller = left;
//			} else {
//				smaller = right;
//			}
//		} else if (left <= n) {
//			smaller = left;
//		} else {
//			return;
//		}
//		
//		if (arr[smaller] < arr[k]) {
//			int tmp = arr[k];
//			arr[k] = arr[smaller];
//			arr[smaller] = arr[k];
//			
//			heapify(arr, smaller, n);
//		}
//	}
//	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		int N = sc.nextInt();
//		int K = sc.nextInt();
//		
//		int[] arr = new int[N];
//		
//		for (int i=0; i<N; i++) {
//			arr[i] = sc.nextInt();
//		}
//		
//		heap_sort(arr, N-1);
//		
//		System.out.println(Arrays.toString(arr));
//		
//		
//	} //main
//	
//}
