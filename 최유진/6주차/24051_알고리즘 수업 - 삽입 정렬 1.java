package algo;

import java.util.Scanner;

public class bj24051 {

	public static int cnt = 0;
	public static int K;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		K = sc.nextInt();

		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt(); //입력받은대로 배열을 넣어줍니다.
		}

		insertion_sort(arr, N); //정렬 실행. N은 static하게 선언을 안 해서 변수로 넘겨주었습니다.
		if (cnt < K) { //저장 횟수가 K보다 작으면 -1을 출력하세요
			System.out.println(-1);
		}

	}

	public static void insertion_sort(int[] arr, int N) {
		for (int i = 1; i < N; i++) {           //가장 첫 원소를 정렬되어 있으므로 인덱스 1부터 검사
			int loc = i - 1;                      //검사하는 인덱스 왼쪽부터 차례대로 검사해줄게요!
			int newItem = arr[i];                 //자리 찾고 있는 인덱스

			// 새롭게 들어올 아이템이 왼쪽으로 옮겨가면서 본인이 들어갈 자리 찾기.
			while (0 <= loc && newItem < arr[loc]) {           //loc이 인덱스 범위 안에 있고 && 자리 찾고 있는 원소 < 검사 중인 원소라면 검사 중인 원소는 오른쪽으로 가야합니다.
				arr[loc + 1] = arr[loc];                         //검사 중인 원소는 오른쪽으로 갑니다.
				cnt++;                                           //저장이 일어났으므로 cnt++;
				loc--;                                           //더 왼쪽으로 이동
				if(cnt == K)
					System.out.println(arr[loc+1]);   //여기서 처음에 35번째 줄을 보니 arr[loc+1] = arr[loc] 둘이 같으니 아무거나 넣어줘도 되겠지 하고
                                            //arr[loc]을 넣었더니 인덱스바운더리 에러가 났어요.
                                            //why? 37번째 줄에서 loc--을 한 후 출력을 했기 때문에
                                            //while문 안에 0 <= loc 조건이 있더라도 loc은 -1일 수 있기 때문이에요!!!
			}

      //while문을 탈출 했다는 것은 자리 찾고 있는 원소 >= 검사 중인 원소라는 것. 들어갈 자리 찾았다!
			if (loc + 1 != i) {                                 // 원래 있던 자리가 아니라면.
				arr[loc + 1] = newItem;                           // loc보다 newItem이 크니까 loc+1이 들어갈 자리입니다.
				cnt++;
				if(cnt == K)
						System.out.println(newItem);

			}
		}
	}

}
