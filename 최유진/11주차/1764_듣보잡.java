import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] input = br.readLine().split(" ");
		int N = Integer.parseInt(input[0]);
		int M = Integer.parseInt(input[1]);

		HashSet<String> set = new HashSet<>();
		//hash에 n만큼 넣어준다.
		for(int i = 0; i < N; i++) {
			set.add(br.readLine());
		}
		
		ArrayList<String> result = new ArrayList<>();
		for(int i = 0; i < M; i++) {
			String tmp = br.readLine();
			if(set.contains(tmp)) { //만약에 이 값이 있다면(중복).
				result.add(tmp);
			}
		}
		
		Collections.sort(result);
		
		StringBuilder sb = new StringBuilder();
	
		sb.append(result.size() + "\n");
		for(int i = 0; i < result.size(); i++) {
			sb.append(result.get(i) + "\n");
		}
		System.out.println(sb.toString());
		
	}

}
