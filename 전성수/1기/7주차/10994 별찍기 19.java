
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

//sb로 바로 입력하면서 해보려했는데 생각이 안나서 2차배열로 받음

public class Main {
	static int N, A;
	static StringBuilder sb;
	static String[][] starmap;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		sb = new StringBuilder();

		N = Integer.parseInt(br.readLine());
		
		A =4*(N-1)+1;
		//N에 따라서 늘어나는 map의 크기
		
		starmap = new String [A][A];
		
		star(N,0);
		
		for(int i=0; i<A; i++) {
			for(int j=0; j<A; j++) {
				sb.append(starmap[i][j]);
			}
			sb.append("\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

	static void star(int depth, int st) {
		if(depth==1) {
			int mid = (A)/2;
			for(int i=st; i<A; i++) {
				if(i%2==0) {
					starmap[mid][i]="*";
				}else {
					starmap[mid][i]=" ";
				}
			}
			return;
		}//가운데 행이 기저 
		
		
		
		
		int B = 4*(depth-1)+1;
		//재귀를 하면서 도형의 크기가 바뀜
		
		for(int i=st; i<st+B;i++) {
			//재귀를 하면서 시작점이 바뀌면서 작아짐
			for(int j=st; j<st+B; j++) {
				if(i==st||i==st+B-1) {
					starmap[i][j]="*";
				}else {
					if(j==st||j==st+B-1) {
						starmap[i][j]="*";
					}else {
						starmap[i][j]=" ";
					}
				}
					
			}
		}
		star(depth-1,st+2);
		

	}

}
