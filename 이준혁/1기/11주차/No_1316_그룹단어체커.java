import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class No_1316_그룹단어체커 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		String[] group = new String[N]; // 입력을 받아줄 문자 그룹
		
		int res = 0; // 정답을 담아줄 res 변수
		
		for (int i=0; i<N; i++) {
			group[i] = sc.next();
			
			ArrayList<String> tmp = new ArrayList<>(); // arraylist 선언
			
			tmp.add(String.valueOf(group[i].charAt(0))); // 첫번째 인덱스를 담아주고
			
			for (int j=1; j<group[i].length(); j++) { // 마지막으로 담겨진 arraylist의 값과 j번째 글자를 비교
				if ((tmp.get(tmp.size()-1)).equals(String.valueOf(group[i].charAt(j)))) { // 같으면 생략
				} else {
					tmp.add(String.valueOf(group[i].charAt(j))); // 다른경우 arraylist에 담아준다.
				}
			}
			
			// 위 for문을 통해 좌우에 인접한 문자들은 통합이 됐으므로
			tmp.sort(Comparator.naturalOrder()); // 오름차순으로 정렬
			
			if (tmp.size() == 1) { // arraylist가 1인 경우, 그룹 단어지만 아래 for문이 실행되지 않으므로
				res++; // 미리 1을 올려준다.
			}

			for (int k=0; k<tmp.size()-1; k++) { // 인덱스 범위 터지지 않기 위해 사이즈의 -1
				if ( tmp.get(k).equals(tmp.get(k+1)) ) { // 현재 값과 다음 값이 같다면
					break; // 그룹 단어가 아니므로 for문을 종료
				}
				
				if ( k == tmp.size()-2 ) { // k가 끝까지 돌았다면 그룹 단어이므로
					res++; // res 증가
				}
			}
		}
		System.out.println(res);
	}
}
