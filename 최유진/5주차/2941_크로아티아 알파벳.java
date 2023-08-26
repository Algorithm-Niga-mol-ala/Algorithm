package algo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class bj2941 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] str = br.readLine().split("");
		String[] langArr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		int cnt = 0;
		
		int idx = 0;
		while(idx < str.length) {
			boolean wordFound = false;
			//먼저 두 글자 떼기.
			if(idx+1 < str.length) {
				String temp = str[idx] + str[idx+1];
				for(String lang: langArr) {
					if(lang.equals(temp)) {
						cnt++;
						idx+=2;
						wordFound = true;
						break;
					} 
				}
				//못찾았으면 세 자인지 체크.
				if(!wordFound && idx+2 < str.length) {
		 			temp += str[idx+2];
					if(temp.equals("dz=")) {
						cnt++;
						idx += 3;
						wordFound = true;
					} 
				}
			}
			
			//끝까지 못찾았으니 일반 글자로 들어가렴.
			if(!wordFound) {
				cnt++;
				idx++;
			}


		}
		
		bw.write(Integer.toString(cnt));
		bw.close();
	}

}
