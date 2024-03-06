package java23;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static int one, two, three;
	static int [] [] map;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		
		int N = Integer.parseInt(br.readLine());
		//크기
		
		map = new int[N][N];
		
		for(int i=0; i<N; i++) {
			String [] row = br.readLine().split(" ",0);
			for(int j=0; j<N; j++) {
				map[i][j] = Integer.parseInt(row[j]);
			}
		}
		
		dfs(N,0,0);
		
		System.out.println(one);
		System.out.println(two);
		System.out.println(three);
		
	}
	
	static void dfs(int size,int r, int c) {
		int st = map[r][c];
		for(int i=r; i<r+size;i++) {
			for(int j=c;j<c+size; j++) {
				if(map[i][j]!=st) {
					dfs(size/3,r,c);
					dfs(size/3,r,c+size/3);
					dfs(size/3,r,c+2*size/3);
					dfs(size/3,r+size/3,c);
					dfs(size/3,r+size/3,c+size/3);
					dfs(size/3,r+size/3,c+2*size/3);
					dfs(size/3,r+2*size/3,c);
					dfs(size/3,r+2*size/3,c+size/3);
					dfs(size/3,r+2*size/3,c+2*size/3);
					return;
				}
			}
		}
		if(st==-1) {
			one++;
		}else if(st==0) {
			two++;
		}else {
			three++;
		}
	}
}
