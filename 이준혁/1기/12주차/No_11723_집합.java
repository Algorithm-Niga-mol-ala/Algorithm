import java.util.Scanner;

public class No_11723_집합 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		
		StringBuilder sb = new StringBuilder();
		
		boolean[] bm = new boolean[21]; // 총 20까지의 숫자만 들어가므로 boolean으로 판별해준다.
		
		for (int i=0; i<M; i++) {
			String tmp = sc.next();
			
			if (tmp.equals("add")) { // add인 경우 입력받은 값을 true로 변경
				int ntmp = sc.nextInt();
				bm[ntmp] = true;
			} else if (tmp.equals("remove")) { // remove인 경우 입력받은 값을 false로 변경
				int ntmp = sc.nextInt();
				bm[ntmp] = false;
			} else if (tmp.equals("check")) { // check가 들어왔다면
				int ntmp = sc.nextInt(); // 판별할 숫자
				if (bm[ntmp]) { // bm[ntmp]에서의 인덱스가 되므로
					sb.append(1+"\n"); // true인 경우 있으므로 1
				} else {
					sb.append(0+"\n"); // false인 경우 없으므로 0
				}
			} else if (tmp.equals("toggle")) { // 토글은 있는 경우 지우고, 없는 경우 넣어주는 역할이므로
				int ntmp = sc.nextInt();
				if (bm[ntmp]) { // true일 때
					bm[ntmp] = false; // false로 바꾸고
				} else { // false일 때
					bm[ntmp] = true; // true로 바꾼다.
				}
			} else if (tmp.equals("all")) { // all은 1~20까지를 모두 넣어주는 역할
				for (int j=1; j<=20; j++) // 반복문을 통해 넣어준다.
					bm[j] = true;
			} else if (tmp.equals("empty")) { // empty는 모두 없애는 것이므로
				bm = new boolean[21]; // 새로운 boolean 배열로 바꿔준다.
			}
		}
		System.out.println(sb); // 결과들 출력
	}
}
