import java.util.Scanner;

public class No_24051_알고리즘수업_삽입정렬1 {
	
	static int[] arr;
	static int cnt; // 저장되는 횟수를 재기 위한 카운터
	static int K;
	
	static void insertionSort() { // 삽입 정렬 진행
		for (int i=1; i<arr.length; i++) { // 두번째 인덱스부터 마지막까지 검사
			
			int key = arr[i]; // 현재 인덱스의 값을 key에 담아주고,
			
			int j = i-1; // j에 i-1 (저장할 값을 담아줄 위치)를 지정해준다.
			
			while (j >= 0 && arr[j] > key) { // j가 인덱스 범위 안이며 arr[j]가 key보다 크면
				arr[j+1] = arr[j]; // arr[j+1] 위치에 arr[j]를 담아주고,
				j--; // j를 하나 빼준다.
				cnt++; // 한 번 저장을 진행했으므로 cnt 올려준다.
				
				if (cnt == K) { // cnt가 K와 같을 경우
					System.out.println(arr[j+1]); // 결과 출력
				}
			}
			
			if (arr[j+1] != key) { // arr[j+1]이 key와 같지 않다면
				arr[j+1] = key; // arr[j+1]에 key를 담아준다.
				cnt++; // 이것은 저장 및 스왑 진행이므로 cnt 올려준다.
			}

			if (cnt == K) { // cnt와 k가 같다면  (cnt가 올라갔으므로 다시 체크)
				System.out.println(arr[j+1]); // 결과값 출력
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		K = sc.nextInt();
		
		arr = new int[N];
		cnt = 0;
		
		for (int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		insertionSort();
		
		if (cnt < K) { // 만약 정렬 진행 후에 cnt가 K보다 작다면
			System.out.println(-1); // -1을 출력
		}
	}
}
