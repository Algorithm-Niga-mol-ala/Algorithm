
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
//1초 1억

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	static int N, C;
	static StringBuilder sb;
	static String[] word, pwd;


	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		sb = new StringBuilder();

		String[] LC = br.readLine().split(" ");

		N = Integer.parseInt(LC[0]);
		C = Integer.parseInt(LC[1]);
		
		word = br.readLine().split(" ");
		pwd = new String [N];
		Arrays.sort(word);

		make(0,0);

		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

	public static void make(int depth, int st) {
		if (depth == N) {
			int cnt_mo=0;
			int cnt_ja=0;
			for(int i=0; i<N; i++ ) {
				if(pwd[i].equals("a")||pwd[i].equals("e")||pwd[i].equals("i")||pwd[i].equals("o")||pwd[i].equals("u")) {
					cnt_mo++;
				}else {
					cnt_ja++;
				}
			}
			if(!(cnt_mo>=1 && cnt_ja>=2)) {
				return;
			}
			for(int i =0; i<N; i++) {
				sb.append(pwd[i]);
			}
			sb.append("\n");
			return;
		}
		for(int i=st; i<C; i++) {//중복을 허용하지 않는 조합만들기
			pwd[depth]=word[i];
			make(depth+1, i+1);
		}
	}

}

