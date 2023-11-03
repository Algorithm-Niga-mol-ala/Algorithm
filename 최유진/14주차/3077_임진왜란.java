package algo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class bj_3077 {

	static String[] question, answer, sel;
	static HashMap<String, Integer> map;
	static int N, score;

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		N = Integer.parseInt(br.readLine());
		map = new HashMap<>();
		question = br.readLine().split(" ");
		for (int i = 0; i < N; i++) {
			map.put(question[i], i);
		}
		answer = br.readLine().split(" ");
		sel = new String[2];

		int scoreSum = N * (N - 1) / 2;
		score = 0;
		combination(0, 0);
		bw.write(score + "/" + scoreSum);
		bw.close();
	}

	public static void combination(int idx, int sidx) {
		if (sidx == 2) {

			if (map.get(sel[0]) < map.get(sel[1])) { //순서가 맞다면
				score++;
			}

			return;
		}

		if (idx == N) {
			return;
		}

		sel[sidx] = answer[idx];
		combination(idx + 1, sidx + 1);
		combination(idx + 1, sidx);
	}

}
