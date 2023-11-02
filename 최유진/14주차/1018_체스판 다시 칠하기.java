package algo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class bj_1018 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] input = br.readLine().split(" ");
		int N = Integer.parseInt(input[0]);
		int M = Integer.parseInt(input[1]);

		String[][] map = new String[N][M];
		for (int i = 0; i < N; i++) {
			String[] input2 = br.readLine().split("");
			for (int j = 0; j < M; j++) {
				map[i][j] = input2[j];
			}
		}

		String[] line = "WBWBWBWB".split("");
		String[] line2 = "BWBWBWBW".split("");

		int minAns = 98765431;
		for (int i = 0; i < N - 7; i++) {
			for (int j = 0; j < M - 7; j++) {
				minAns = Math.min(check(line, line2, map, i, j), minAns);
				minAns = Math.min(check(line2, line, map, i, j), minAns);

			}
		}
		bw.write(Integer.toString(minAns));
		bw.close();
	}
	
	public static int check(String[] line, String[] line2, String[][] map, int i, int j) {
		int cnt = 0;
		for (int n = 0; n < 8; n++) {
			for (int m = 0; m < 8; m++) {
				if (n == 0 || n % 2 == 0) {
					if(!map[i+n][j+m].equals(line2[m])) {
						cnt++;
					}
				} else {
					if(!map[i+n][j+m].equals(line[m])) {
						cnt++;
					}
				}
			}
		}
		return cnt;
	}

}
