package algo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class swea_7236 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc <= T; tc++) {
			int N = Integer.parseInt(br.readLine());
			String[][] arr = new String[N][N];

      //순서대로 배열에 담아주기
			for(int i = 0; i < N; i++) {
				String[] line = br.readLine().split(" ");
				for(int j = 0; j < N; j++) {
					arr[i][j] = line[j];
				}
			}

      //8방탐색을 위한 델타값 준비
			int[] dr = {-1, -1, 0, 1, 1, 1, 0, -1};
			int[] dc = {0, 1, 1, 1, 0, -1, -1, -1};
			int maxDepth = 0;
			
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < N; j++) {
					int cnt = 0;
          //전체 배열 돌면서 W면 8방 탐색 시작
					if(arr[i][j].equals("W")) {
						for(int k = 0; k < 8; k++) {
							if(i+dr[k] < 0 || i+dr[k] >= N || j+dc[k] < 0 || j+dc[k] >= N) { //인덱스 제한
								continue;
							}
              //주변에 W가 있으면 cnt++;
							if(arr[i+dr[k]][j+dc[k]].equals("W")) {
								cnt++;
							}
						}
            //8방 탐색했는데도 W가 아예 없었다면 본인 값만 포함해서 1로. (문제 조건)
					  if(cnt == 0) 
						  cnt = 1;
					}

					maxDepth = Math.max(maxDepth, cnt);
				}
	
			}
			
			bw.write("#" + tc + " " + Integer.toString(maxDepth) + "\n");
		}
		
		bw.close();

	}

}
