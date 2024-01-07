import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class P11651_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		int[][] loca = new int[N][2]; // 좌표이므로 N*2 크기로 받음

		// N개만큼 좌표 입력받기
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			loca[i][0] = Integer.parseInt(st.nextToken());
			loca[i][1] = Integer.parseInt(st.nextToken());
		}

		// 좌표에 따른 정렬
		Arrays.sort(loca, new Comparator<int[]>() { // 2차원배열의 요소는 1차원배열
			@Override
			public int compare(int[] o1, int[] o2) {
				if (o1[1] == o2[1]) { // y좌표가 같으면
					return o1[0] - o2[0]; // x좌표 값에 의해 정렬
				} else { // y좌표가 다르면
					return o1[1] - o2[1]; // y좌표 값에 의해 정렬
				}
			}
		});

		// 출력
		for (int i = 0; i < N; i++) {
			sb.append(loca[i][0]).append(" ").append(loca[i][1]).append("\n");
		}
		System.out.println(sb);
		br.close();
	}
}
