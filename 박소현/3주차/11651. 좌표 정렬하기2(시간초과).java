import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

// scanner + sysout
// scanner + stringbuilder
// bufferedreader + sysout
// bufferedreader + stringbuilder
// bufferedreader + bufferedwriter

public class P11651 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		int[][] loca = new int[N][2]; // 좌표이므로 N*2 크기로 받음

		// N개만큼 좌표 입력받기
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
				loca[i][0] = Integer.parseInt(st.nextToken());
				loca[i][1] = Integer.parseInt(st.nextToken());
		}

		// 수 비교하면서 자리 교환하기
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				// y좌표가 같을 경우 x좌표 비교 후 swap
				if (loca[i][1] == loca[j][1]) {
					if (loca[i][0] < loca[j][0]) {
						int tmp = loca[i][0];
						loca[i][0] = loca[j][0];
						loca[j][0] = tmp;
					}
					// y좌표가 다를 경우 둘 다 swap
				} else if (loca[i][1] < loca[j][1]) {
					int tmp1 = loca[i][0];
					loca[i][0] = loca[j][0];
					loca[j][0] = tmp1;
					
					int tmp2 = loca[i][1];
					loca[i][1] = loca[j][1];
					loca[j][1] = tmp2;
				}
			}
		}
		
		for(int i =0; i<N; i++) {
			sb.append(loca[i][0]).append(" ").append(loca[i][1]).append("\n");
//			sb.append(loca[i][0] + " " + loca[i][1] + "\n");
		}
		
		br.close();
	}
}
