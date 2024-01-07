package week6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main1991_트리순회 {
	static int N;
	static char[] alpha;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine()); // 노드의 개수
		alpha = new char[N + 1];

		// 노드의 이름 입력받기
		char k = 65; // 'A' = 65
		for (int i = 1; i < N + 1; i++) {
			alpha[i] = k;
			k++;
		}
		System.out.println(Arrays.toString(alpha));

	} // main

	// 전위 순회 메서드
	public static void before(int idx) {
		if (idx < N) { // 유효한 범위인지 체크
			if (alpha[idx] != '.')
				System.out.println(alpha[idx]); // V
			before(idx * 2); // L
			before(idx * 2 + 1); // R
		}
	}

	// 중위 순회 메서드
	public static void middle(int idx) {
		if (idx < N) { // 유효한 범위인지 체크
			before(idx * 2); // L
			if (alpha[idx] != ' ')
				System.out.println(alpha[idx]); // V
			before(idx * 2 + 1); // R
		}
	}

	// 후위 순회 메서드
	public static void after(int idx) {
		if (idx < N) { // 유효한 범위인지 체크
			before(idx * 2); // L
			before(idx * 2 + 1); // R
			if (alpha[idx] != ' ')
				System.out.println(alpha[idx]); // V
		}
	}

}
