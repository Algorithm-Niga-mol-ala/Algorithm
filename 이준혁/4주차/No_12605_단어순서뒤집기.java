import java.util.Scanner;
import java.util.Stack;

public class No_12605_단어순서뒤집기 {

	public static void main(String[] args) {
		// 스페이스로 띄어쓰기 된 단어들의 리스트가 주어질 때 반대 순서로 뒤집기
		// StringBuffer 사용하는건 어때 <= 영규 의견
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		Stack<String> L = new Stack<>();
		
		for (int tc=0; tc<=N; tc++) { // 원래 tc 1부터 N까지 했는데 1번이 계속 씹힘
			String a = sc.nextLine(); // nextLine이 뭔가 오류가 좀 있는데.. 왤까..
			String[] arr = a.split(" "); // 어쨌거나 split을 이용해 공백 기준으로 잘라서 배열에 넣음
			
			for (int j=0; j<arr.length; j++) {
				L.push(arr[j]); // 배열 안의 내용물들을 모두 push
			}
			
			if ( tc >= 1) { // tc 0일 때 출력물 내지 않기 위한 조건
				System.out.print("Case #"+tc+": ");
				for (int j=0; j<arr.length; j++) {
					System.out.print(L.pop()+" ");
				}
				System.out.println();
			}
		}
	}
}
