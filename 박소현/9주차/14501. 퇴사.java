import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main14501_퇴사 {
	static int N;
	static int sum, max, ans;
	static int[][] money;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		N = Integer.parseInt(br.readLine());

		money = new int[N][2];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			money[i][0] = Integer.parseInt(st.nextToken());
			money[i][1] = Integer.parseInt(st.nextToken());
		}
//		for(int i =0; i<=N; i++) {
//			System.out.println(Arrays.toString(money[i]));
//		}

		sum = 0;
		ans = 0;
		work(0, 0);
		System.out.println(ans);

	} // main

	public static void work(int idx, int sum) {
		if (idx >= N) {
			ans = Math.max(sum, ans); // 최대 이익 갱신해주기
			return;
		}
		// 날짜 범위를 벗어나지 않는 선에서
		if (idx + money[idx][0] <= N) {
			// idx행의 이익만큼을 더해주면서 다음 날짜로 넘어가기
			work(idx + money[idx][0], sum + money[idx][1]);
		} else
			// 날짜를 벗어나면 sum을 더해주지 않고 그대로 갖고가기
			work(idx + money[idx][0], sum);

		// 최대 이익을 구하기 위함!!!!!!!!!!!!!!!!!
		// 만약 범위를 넘기게 된다면 호출한 함수로 되돌아와서 다음 인덱스로 넘어가기
//		예를 들어
//	    3
//	    1 10
//	    3 20
//	    1 10
//		이라면 1+3=4이므로 범위를 넘음
//		그대로 종료가 아닌 2번째 행을 제외하고 3번째 행으로 넘어가서 최대 이익 구해줘야 함
		work(idx + 1, sum);

	} // work
}
