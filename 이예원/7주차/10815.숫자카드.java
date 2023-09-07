
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb;

		int N = Integer.parseInt(br.readLine());

		int[] card1 = new int[N];// 원래 가지고 있는 카드 정보 담을 배열

		st = new StringTokenizer(br.readLine());

		// 원래 가지고 있는 카드 정보 담아주기
		for (int i = 0; i < N; i++) {
//			String input = st.nextToken();
			card1[i] = Integer.parseInt(st.nextToken());
		}
		//이진검색 해야하니까 비교할 N배열 정렬해주기
		Arrays.sort(card1);
		
//		System.out.println(Arrays.toString(card1));

		int M = Integer.parseInt(br.readLine());

		int[] card2 = new int[M]; // 비교할 카드 배열

		st = new StringTokenizer(br.readLine());

		// 비교할 카드 배열 값 담아주기
		for (int i = 0; i < M; i++) {
			card2[i] = Integer.parseInt(st.nextToken());
		}
		
//		System.out.println(Arrays.toString(card2));
//		Arrays.sort(card2);
		
		
		for(int i = 0; i < card2.length; i++) {
			
			System.out.print(binarySearch(card1, card2[i]) + " ");
			
		}
		
		
	}// main
	
	
	//여기에서 arr은 card1배열, key는 card2 배열의 요소값
	public static int binarySearch(int[] arr, int key){
		
		int st = 0;
		int ed = arr.length-1;
		
		//while문의 조건식을 어떻게 써서 언제 끝내야 할까?
		while(st<=ed){ // 두 지점이 교차되면 더 이상 검색 범위는 없음
				int mid = (st+ed) / 2;
				if(arr[mid] == key)
						return 1;
				else if (arr[mid] > key){
						//왼쪽 구간으로 이동
							ed = mid-1;
				} else {
						//오른쪽 구간으로 이동
						st = mid + 1;
				}
		}


		return 0;
	}

}
