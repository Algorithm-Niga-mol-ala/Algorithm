import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class bj11651 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int[N][2];

		// arr == {{0, 4}, {1, 2}, {1, -1}, {2, 2}, {3, 3}}
		for(int i = 0; i < N; i++) {
			String[] numsArr = br.readLine().split(" ");
			arr[i][0] =  Integer.parseInt(numsArr[0]);
			arr[i][1] =  Integer.parseInt(numsArr[1]);
		}
		
		// (검색 도움 받은 부분)
		Arrays.sort(arr, (numA, numB) -> {
			if(numA[1] == numB[1]) { //y값이 동일하면,
				return numA[0] - numB[0]; //x값으로 비교해서 정렬.
			}
			else {
				return numA[1] - numB[1]; //y값으로 비교해서 정렬.
			}
		});
		
		StringBuilder sb = new StringBuilder();
		for(int[] numsArr : arr) {
			sb.append(numsArr[0] + " " + numsArr[1]);
			sb.append("\n");
		}
		
		bw.write(sb.toString());
		bw.close();
		
	}

}
