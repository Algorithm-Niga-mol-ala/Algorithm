import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		Integer [] nums = new Integer[N];
		for(int i =0; i<N ; i++) {
			nums[i]=Integer.parseInt(br.readLine());
		}
		Arrays.sort(nums, Collections.reverseOrder());
		
		for(int i=0; i<N; i++) {
			bw.write(nums[i]+"\n");
		}
		
		bw.flush();
	}
}
