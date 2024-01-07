
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

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

		ArrayList<Integer> list = new ArrayList<>();
		// 요소값을 저장할 list

		StringBuilder sb = new StringBuilder();
		// 100만개나 되는 입력값을 다 하나하나 출력하려면 메모리와 시간 낭비가 너무 크기 땜시
		// StringBuilder를 사용해서 시간을 줄여야한다고한다,,,~!

		for (int i = 0; i < N; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		// list에 입력값 하나씩 넣어주기

		Collections.sort(list);
		// Arrays.sort보다 빠른 Collections.sort 사용해서 정렬하기

		for (int i = 0; i < N; i++) {
			sb.append(list.get(i)).append("\n");
		} //문자추가메서드 append를 사용해서 하나씩 저장(개행문자까지)
		
		System.out.println(sb);

	}// main

}// class
