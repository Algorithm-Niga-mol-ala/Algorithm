
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Main {
	static int N, L, ans,cnt;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] NL = br.readLine().split(" ", 0);
		N = Integer.parseInt(NL[0]);// 2~100
		L = Integer.parseInt(NL[1]);// 1~N

		int[][] row_map = new int[N][N];
		int[][] col_map = new int[N][N];

		for (int i = 0; i < N; i++) {
			String[] row = br.readLine().split(" ", 0);
			for (int j = 0; j < N; j++) {
				row_map[i][j] = Integer.parseInt(row[j]);
				col_map[j][i] = Integer.parseInt(row[j]);
			}
		}
		ans = 0;
		cnt=0;
		for (int i = 0; i < N; i++) {
			check(row_map[i]);
			check(col_map[i]);
		}
		System.out.println(ans);

	}

	private static void check(int[] line) {
		cnt++;
		int height = line[0];
		int len = 1;
		boolean slope = true;
		for (int i = 1; i < N; i++) {
			if (Math.abs(height - line[i]) > 1) {
				return;
			} 
			//높이 차이 1인 애들
			else if (line[i] == height) {
				len++;
				if(!slope && len==L) {
					len-=L;
					slope=true;
				}
			} // 층이 같으면 길이를 늘리고 넘김
			else if (line[i] < height) {
				if(!slope) return;
				// 현채보다 낮은 층을 만나면
				height = line[i];// 높이를 바꾸고
				len = 1;// 1로 초기화
				slope = false;
				if(len==L) {
					len-=L;
					slope=true;
				}
			} else {
				// 현재보다 높은 층을 만나면
				if(len<L) {
					return;
				}else {
					height = line[i];// 높이를 바꾸고
					len = 1;// 1로 초기화
				}
				
			}
			
		}
		if (!slope) return;
			ans++;

	}

}
