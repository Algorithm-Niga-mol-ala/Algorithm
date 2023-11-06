package algo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;

public class bj_15661 {
	static int[] arr;
	static boolean[] sel;
	static int N, ans;
	static int[][] map;

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		N = Integer.parseInt(br.readLine());
		ans = 987654321;
		map = new int[N][N];
		arr = new int[N];
		sel = new boolean[N];

		for (int i = 0; i < N; i++) {
			String[] input = br.readLine().split(" ");
			for (int j = 0; j < N; j++) {
				map[i][j] = Integer.parseInt(input[j]);
			}
		}

		for (int i = 0; i < N - 1; i++) {
			arr[i] = i + 1; // arr = {1, 2, 3, 4} 형태로 저장
		}

		powerset(0);
		bw.write(Integer.toString(ans));

		bw.close();
	}

	public static void powerset(int idx) {

		if (idx == N) { //부분집합으로 0~n개를 고른다.
			ArrayList<Integer> listA = new ArrayList<>();
			ArrayList<Integer> listB = new ArrayList<>();

			for (int i = 0; i < N; i++) {
				if (sel[i]) {
					listA.add(arr[i]); //부분집합으로 골라진 것은 listA에
				} else {
					listB.add(arr[i]); //안 골라진 것은 listB에 넣는다.
				}
			}

			int powerA = 0;
			int powerB = 0;

			if (listA.size() != 0 && listB.size() != 0) { //powerset에서 아무것도 안 고르는 경우 제외하고
				// a와 b의 능력 차이 구하기.
				for (int i = 0; i < listA.size() - 1; i++) {
					for (int j = i+1; j < listA.size(); j++) {
						powerA += map[listA.get(i)][listA.get(j)];
						powerA += map[listA.get(j)][listA.get(i)];
					}
				}

				for (int i = 0; i < listB.size() - 1; i++) {
					for (int j = i+1; j < listB.size(); j++) {
						powerB += map[listB.get(i)][listB.get(j)];
						powerB += map[listB.get(j)][listB.get(i)];
					}
				}
				
				ans = Math.min(ans, Math.abs(powerA - powerB));
			}

			return;

		}

		sel[idx] = true;
		powerset(idx + 1);
		sel[idx] = false;
		powerset(idx + 1);
	}

}
