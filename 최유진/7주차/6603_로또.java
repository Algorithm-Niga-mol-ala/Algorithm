package algo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class bj_6603 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static int[] arr;
	public static int[] sel;
	public static int K;

	public static void main(String[] args) throws IOException {

		boolean isNextCmd = true;
		while (isNextCmd) {
			String[] lineArr = br.readLine().split(" ");
			K = Integer.parseInt(lineArr[0]);
			if (K == 0)
				isNextCmd = false;
			else {
				arr = new int[K];
				sel = new int[6];
				for (int i = 0; i < K; i++) {
					arr[i] = Integer.parseInt(lineArr[i + 1]);
				}
				combination(0, 0);
			}
			bw.write("\n");
		}

		bw.close();

	}

  //조합 수업 참고
	public static void combination(int idx, int sidx) throws IOException {
		if (sidx == 6) {
			bw.write(sel[0] + " " + sel[1] + " " + sel[2] + " " + sel[3] + " " + sel[4] + " " + sel[5] + "\n");
			return;
		}
		if (idx == K)
			return;
		sel[sidx] = arr[idx];
		combination(idx + 1, sidx + 1);
		combination(idx + 1, sidx);
	}

}
