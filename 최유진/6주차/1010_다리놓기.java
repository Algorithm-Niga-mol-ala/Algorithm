package algo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class bj_1010 {
	
	public static int[][] dp = new int[31][31]; //계산 값을 메모해 놓을 2차원 배열 생성.

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= T; tc++) {
			String[] line = br.readLine().split(" ");
			int N = Integer.parseInt(line[1]); //왼쪽 다리 3개, 오른쪽 다리 5개일 경우 3C5를 구해야 하므로 순서를 바꿔서 저장했다.
			int M = Integer.parseInt(line[0]);

			bw.write(combination(N, M) + "\n");
		}

		bw.close();

	}
	
	public static int combination(int n, int r) {
		if (dp[n][r] > 0) { //이미 메모된 값이 있으면 그 값을 리턴
			return dp[n][r];
		}
		
		else if (n == r || r == 0) {
			return dp[n][r] = 1;//원소의 개수가 조합의 개수와 동일하거나 0이라면 1 리턴. nCn = 1, nC0 = 1이니까
		}
		
		else { //nCr = n-1Cr-1 + n-1Cr
			return dp[n][r] = combination(n-1, r-1) + combination(n-1, r);
		}
	}

}
