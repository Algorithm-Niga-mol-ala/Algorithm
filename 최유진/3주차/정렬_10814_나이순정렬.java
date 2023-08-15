package algo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class bj10814 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		String[][] arr = new String[N][2];
		
		for(int i = 0; i < N; i++) {
			String[] inputArr = br.readLine().split(" ");
			String age = inputArr[0];
			String name = inputArr[1];
			arr[i][0] = age;
			arr[i][1] = name;
		}
		
		Arrays.sort(arr, (a, b) -> {
			int ageA = Integer.parseInt(a[0]);
			int ageB = Integer.parseInt(b[0]);
				return ageA - ageB;
		});
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < arr.length; i++) {
			sb.append(arr[i][0]);
			sb.append(" ");
			sb.append(arr[i][1]);
			sb.append("\n");
		}
		
		bw.write(sb.toString());
		bw.close();

	}

}
