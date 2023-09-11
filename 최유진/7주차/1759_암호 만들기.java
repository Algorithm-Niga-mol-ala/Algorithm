package algo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class bj_1759 {
	
	public static String[] sel;
	public static StringBuilder sb = new StringBuilder();
	public static int L;
	public static int C;
	public static String[] wordArr;
	public static String[] vowel = {"a", "e", "i", "o", "u"};

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] inputArr = br.readLine().split(" ");
		L = Integer.parseInt(inputArr[0]);
		C = Integer.parseInt(inputArr[1]);
		
		wordArr = br.readLine().split(" ");
		Arrays.sort(wordArr); //암호는 무조건 정렬되어 있으므로 정렬.
		
		sel = new String[L];
		
		combination(0, 0); //정렬되어 있는 것 중에 네 개를 뽑기 위해 조합 활용.
		
		bw.write(sb.toString());
		bw.close();
	}
	
	public static void combination(int idx, int sidx) {
		if(sidx == L) {
			int cnt = 0;
			for(int i = 0; i < L; i++) {
				//최소 한 개 모음이 있는지 체크.
				for(int j = 0; j < vowel.length; j++) {
					if(sel[i].equals(vowel[j])) {
						cnt++;
					}
				}
			}
			
			if(cnt >= 1 && L - cnt >= 2) { //한 개 이상의 모음이 있고 && 전체 - 모음 개수 (자음 개수)가 2개 이상일 때.
				for(int i = 0; i < L; i++) {
					sb.append(sel[i]); //차례대로 원소 출력.
				}
				sb.append("\n");
			}
			return;
		}
		
		if(idx == C) return;
		
		sel[sidx] = wordArr[idx];
		combination(idx+1, sidx+1);
		combination(idx+1, sidx);
	}

}
