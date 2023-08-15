package java23;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		//테스트 케이스의 개수
		for(int t=0; t<T; t++) {
			String[] fst = br.readLine().split(" ");
			//테스트 케이스의 첫째줄 A의 수 N 과 B의 수 M이 주어짐
			int N = Integer.parseInt(fst[0]); //A의 수
			int M = Integer.parseInt(fst[1]); //B의 수
			
			String [] A_num_str = br.readLine().split(" "); //A의 값들
			String [] B_num_str = br.readLine().split(" "); //B의 값들
			
			int[] A_num = new int[N];
			int[] B_num = new int[M];
			
			for(int i=0; i<N;i++) {
				A_num[i] = Integer.parseInt(A_num_str[i]);
			}
			for(int i=0; i<M;i++) {
				B_num[i] = Integer.parseInt(B_num_str[i]);
				
			}
			//String을 int로 바꿔줌
			int cnt =0; //쌍의 개수
			//A_num 과 B_num을 정렬한 뒤 반복문에 A_num[i] <= B_num[j] 인 경우 
			//어차피 뒤의 것듫 전부 A_num보다 클 것이기 떄문에 break를 넣으면 시간초과가 안남
			
			for(int i=0; i<N; i++) {
				for(int j=0; j<M; j++) {
					if(A_num[i]>B_num[j]) cnt++;
				}
			}
			
			bw.write(String.valueOf(cnt)+"\n");
			
		}
		
		
		bw.flush();
		bw.close();
		br.close();

	}// main

}
