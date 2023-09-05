package algo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class bj_5052 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());
		for(int tc = 1; tc <= T; tc++) {
			int N = Integer.parseInt(br.readLine());
			int[][] arr = new int[N][11];
			for(int i = 0; i < N; i++) {
				String[] strArr = br.readLine().split("");
				arr[i][0] = strArr.length;
				for(int j = 0; j < strArr.length; j++) {
					arr[i][j+1] = Integer.parseInt(strArr[j]);
				}
			}
			
			boolean isSame = true;
			check: for(int i = 0; i < N; i++) {
				for(int j = 0; j < N; j++) {

					//i가 j와 비교한다. 본인이 아니면 && 본인의 길이보다 상대방의 길이가 더 길면
					if(j != i && arr[j][0] >= arr[i][0]) {
						isSame = true;
						//상대방꺼에서 본인 개수만큼 돌면서 같은지 체크
						for(int k = 1; k <= arr[i][0]; k++) {
							if(arr[j][k] != arr[i][k]) { //순서대로 확인하다가 하나라도 다른게 있으면
								isSame = false;
								break;
							}
						}
						if(isSame) { //끝까지 다 돌고 나왔는데 다 같았다면
							break check;
						}
					}
				}
			}
			if(isSame) {
				bw.write("NO\n");
			} else {
				bw.write("YES\n");
			}
			
		}
		
		bw.close();
	}

}
