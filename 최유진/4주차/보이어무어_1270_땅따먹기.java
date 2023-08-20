package algo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Map;
import java.util.HashMap;

public class bj1270 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		for (int tc = 0; tc < N; tc++) {

			String[] land = br.readLine().split(" ");
			int M = Integer.parseInt(land[0]);
			
			Map<String, Integer> cntMap = new HashMap<>();
			String answer = null;

			for (int i = 0; i < M; i++) {
        //land배열의 첫 번째 수는 개수를 의미하므로 i+1로 계산
				String num = land[i+1];

				if (cntMap.containsKey(num)) {
					int original = cntMap.get(num);
					cntMap.put(num, original + 1);
				} else {
					cntMap.put(num, 1);
				}

				if (cntMap.get(num) > M / 2) {
					answer = num;
					break;
				}
				
			}

			if (answer == null) {
				bw.write("SYJKGW");
			} else {
				bw.write(answer);
			}
			bw.newLine();

		}
		
		bw.close();

	}

}
