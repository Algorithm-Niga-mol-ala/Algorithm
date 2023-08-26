package algo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class bj2810 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		String[] line = br.readLine().split("");

		int holderNum = 1;

		int i = 0;
		while (i < N) {
			holderNum++;
      //L이 나오면 커플석이라 다음 인덱스는 확인할 필요 없으므로
			if (line[i].equals("L"))
				i += 2;
			else
				i++;

		}

    //먹을 수 있는 최대 사람의 수를 출력해야 하므로, 홀더 수가 더 크면 사람 수만큼 출력하면 된다.
		if (holderNum >= N)
			bw.write(Integer.toString(N));
		else
			bw.write(Integer.toString(holderNum));

		bw.close();
	}

}
