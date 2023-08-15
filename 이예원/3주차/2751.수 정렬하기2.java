
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) throws IOException {

		// N개의 수가 주어졌을 때 이를 오름차순으로 정렬

		// 첫째 줄에 N 입력, 둘째 줄부터 N개의 줄에 수가 주어짐

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		ArrayList<Integer> list = new ArrayList<>();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < N; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		
		Collections.sort(list);
		
		for(int i = 0; i < N; i++) {
			sb.append(list.get(i)).append("\n");
		}
		System.out.println(sb);

	}// main

}// class
