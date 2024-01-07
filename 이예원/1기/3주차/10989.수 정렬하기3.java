
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {

		/*
		 * N개의 수가 주어졌을 때, 오름차순으로 정렬하는 프로그램
		 * 
		 * 첫째 줄에는 수의 개수 N 입력 둘째줄부터 수가 N개 주어진다
		 */

		// BufferedReader 쓰는 방법 밖에는 없겠군요

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		// 버퍼리더는 정수 입력 못받으니까 입력 받자마자 정수로 바꿔주기
		
		StringBuilder sb = new StringBuilder();
		
		int[] arr = new int[N]; //N크기의 배열 생성

		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		Arrays.sort(arr);


		for(int i = 0; i < arr.length; i++) {
			sb.append(arr[i]).append("\n");
		}
		
		System.out.println(sb);
		
		
	}// main

}// class
