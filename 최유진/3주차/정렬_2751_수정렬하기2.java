import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class bj2751 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int[] countArr = new int[2000001];
		
		for(int i = 0; i < N; i++) {
			int num = Integer.parseInt(br.readLine());
			countArr[num+1000000]++;
		}
		
		for(int j = 0; j < 2000001; j++) {
				while(countArr[j] != 0) {
					bw.write(Integer.toString(j-1000000));
					bw.write("\n");
					countArr[j]--;
				}
		}
		
		bw.close();
		
	}

}
