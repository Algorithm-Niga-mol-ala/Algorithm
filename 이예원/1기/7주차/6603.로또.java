import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int k;
	static int[] lotto;
	static int[] res = new int[6];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st;
		
		while (true) { //무한루프를 걸어주고 밑에서 k가 0이면 반복 끝나게 해준다
      //이 반복문을 어떻게 잡아야 할지 몰라서 k != 0 / k > 0 이런식으로 썼더니 안되더라

			st = new StringTokenizer(br.readLine());

			k = Integer.parseInt(st.nextToken()); //이제 나도 토크나이저 마스터
            
      if (k == 0) break; //0입력되면 끝나욤

			lotto = new int[k]; // 로또숫자들을 담아줄 배열

			for (int i = 0; i < k; i++) { //배열 입력받기 (알아서 오름차순으로 입력됨)
				lotto[i] = Integer.parseInt(st.nextToken());
			}

			combi(0, 0);
			System.out.println(); //한칸 떼고 다음 케이스 값 입력 받아오기

		}
	}// main

	// lotto의 배열의 인덱스 n
	// res의 인덱스 r
	public static void combi(int n, int r) {

		if (r == 6) { //res의 인덱스 범위를 벗어나면 출력하기
//			System.out.println(Arrays.toString(res));
			for (int i = 0; i < res.length; i++) {
				System.out.print(res[i] + " ");
			}
			System.out.println();
			return;
		}
		if (n == k) { // 끝까지 확인 다했어 끝내
			return;
		}

		// 재귀
    // 솔직히 이 파트 잘 모르겠음... 더 공부해서 알아두기
		res[r] = lotto[n]; // 지금 내 자리 값 넣어주
		combi(n + 1, r + 1);// n번째 번호 뽑은거
		// (다음 넣을 번호, 이번에 뽑은 번호)
		combi(n + 1, r);// n번째 번호 안뽑은거

	}// combi

}
