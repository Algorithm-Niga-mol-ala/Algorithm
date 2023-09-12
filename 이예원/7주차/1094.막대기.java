import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int X = Integer.parseInt(br.readLine());
		
		int stick = 64; //막대기의 길이
		int count = 0; //막대기 갯수 세어줄 변수
		
		while(X > 0) {
			if(stick > X) { //남은 막대기의 크기가 X보다 클 때 
				stick = stick/2; //반으로 자른다. (하나는 버림)
			}else { //남은 막대기가 X보다 작으면 자른거 하나 남겨두기 (이따 풀로 붙여야함)
				X = X - stick; // X에서 자른 막대기 빼주기 (왜냐면 붙일거니까)
				count++; //막대기 개수 세어주기
			}
		}
		System.out.println(count);
		
	}//main

}
