package java23;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
//1초 1억

public class Main {
	static int N, M, cnt;
	static StringBuilder sb;
	static int[][] mission;


	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		sb = new StringBuilder();
		String [] NM = br.readLine().split(" ");
		N = Integer.parseInt(NM[0]);//일수
		M = Integer.parseInt(NM[1]);//점수 하한
		mission = new int [2] [3];
		for(int i=0; i<2; i++) {
			String [] str = br.readLine().split(" ");
			for(int j=0; j<3; j++) {
				mission[i][j]=Integer.parseInt(str[j]);
			}
		}//장소에 따른 미션 점수 받기

	
		cnt=0;
		spy(0, 0,-1);
		sb.append(String.valueOf(cnt));
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	//날이 3일 이상일 떄 숫자로 카운트를 해버리면 연속되는 날인지 하루 건너뛰고 인지 알 수가 없음
	//연속되는 날인지 알 수 있어야함
	//yesterday를 매개변수로 줘버림
	//yesterday를 이용하기 위해서 매일의 점수를 넘겨줘야함
	public static void spy(int day, int sum, int yesterday) {
		//기저 
		if(day==N) {
			if(M<=sum) cnt++;
			return;
		}
		
		for(int i=0; i<2 ; i++) {
			for(int j=0; j<3; j++) {
				if(j==yesterday) {
					spy(day+1, sum+(mission[i][j]/2), j);
				}else {
					spy(day+1, sum+mission[i][j], j);
				}
			}
		}
		
	}

	

}
