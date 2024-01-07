import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main14244_트리만들기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = i;
		}
		for (int i = 0; i < m; i++) {
			System.out.print(0);
			System.out.print(" ");
			System.out.println(arr[i] + 1);
		}
		int k = 1;
		for (int i = m + 1; i < n; i++) {
			System.out.print(k++);
			System.out.print(" ");
			System.out.println(arr[i]);
		}

	} // main
}


