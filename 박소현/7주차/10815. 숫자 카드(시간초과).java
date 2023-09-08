package week6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main10815_숫자카드 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine()); // 숫자 카드의 개수
		st = new StringTokenizer(br.readLine());
		int[] card = new int[N];
		for (int i = 0; i < N; i++) {
			card[i] = Integer.parseInt(st.nextToken()); // 카드 번호
		}

		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		int[] search1 = new int[M]; // 숫자카드인지 아닌지 검사할 배열 - 정렬
		int[] search2 = new int[M]; // 숫자카드인지 아닌지 검사할 배열 - 비정렬
		for (int i = 0; i < M; i++) {
			search1[i] = Integer.parseInt(st.nextToken());
			search2[i] = search1[i];
		}

		Arrays.sort(card);
		Arrays.sort(search1);

		// card와 search1배열 비교해서 숫자가 있다면
		// search2에서 그 숫자가 있는 인덱스를 찾아 flag배열에 1, 만약 card가 커진다면 바로 break
		// 당연히 시간초과 ^^
		int[] flag = new int[M];
		for (int j = 0; j < M; j++) {
			for (int i = 0; i < N; i++) {
				if (search1[j] == card[i]) {
					for (int k = 0; k < M; k++) {
						if (search2[k] == search1[j]) {
							flag[k] = 1;
							break;
						}
					}
				} else if (search1[j] < card[i]) {
					break;
				}
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < M - 1; i++) {
			sb.append(flag[i] + " ");
		}
		sb.append(flag[M - 1]);

		System.out.println(sb.toString());
	} // main

}
