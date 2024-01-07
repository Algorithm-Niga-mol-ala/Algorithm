import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class No_1764_듣보잡 {

	public static void main(String[] args) {

    // 1. Arraylist를 이용한 풀이
    
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); // 듣도 못한 사람
		int M = sc.nextInt(); // 보도 못한 사람
		
		String[] tmp = new String[N+M]; // 듣보잡들을 모두 담아줄 배열
		
		for (int i=0; i<N+M; i++) { // 2~N줄까지 듣못사, N_2부터 보못사이므로
			tmp[i] = sc.next(); // N+M크기로 쭉 담아주면 모든 듣못사 보못사가 담긴다.
		}
		
		Arrays.sort(tmp); // 듣보잡 찾기 & 사전순 출력을 위한 정렬
		
		int res = 0; // 듣보잡의 수
		ArrayList<String> al = new ArrayList<>();
		
		for (int i=1; i<N+M; i++) { // tmp 0번인덱스부터 비교를 위해
			if (tmp[i-1].equals(tmp[i])) { // 앞뒤가 같은지를 구분한다
				res++; // 만약 그렇다면 듣보잡의 수를 올려주고
				al.add(tmp[i-1]); // al에 그 내용물을 담는다.
			}
		}
		
		// 출력부
		System.out.println(res);
		for (int i=0; i<al.size(); i++) {
			System.out.println(al.get(i));
		}
	}
}
