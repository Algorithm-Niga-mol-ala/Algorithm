import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	static int cnt;

	public static void main(String[] args) throws IOException {
		//회문 판단 + 함수의 호출 횟수 구하기
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		for(int tc = 1 ; tc <= T; tc++) {
			cnt = 1;
		String str = br.readLine();
		
//		System.out.println(str);

		System.out.println(isPalin(str) + " " + cnt);
		}//tc
		
	}//main
	
	static int isPalin(String s) {
		return result(s, 0, s.length()-1);
	}
	
	static int result(String s, int i, int j) {
		//기저 (한글자이거나 포인터가 겹쳤을 때)
		if(i >= j) return 1;
		
		//재귀
		else if(s.charAt(i) == s.charAt(j)) {//대칭되는 문자가 같으면 하나씩좁혀서 재귀
			cnt += 1;
			return result(s, i+1, j-1);
		}else if (s.charAt(i) != s.charAt(j)) return 0;
		
				
		return 0;

	}

}
