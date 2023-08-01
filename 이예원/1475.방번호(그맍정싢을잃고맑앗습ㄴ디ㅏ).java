
import java.util.Scanner;

public class Day_0801_1475 {

	public static void main(String[] args) {

		// 한세트에는 0~9까지 한개씩 들어있고 6이랑 9는 뒤집어서 사용 가능

		// 입력 첫째줄에 방 번호 N이 주어짐

		// 출력 필요한 세트의 개수를 출력

		Scanner sc = new Scanner(System.in);

		// 애초에 String 배열로 입력받기
		String n = sc.next();

		// 숫자를 String 배열에 하나씩 담아줘욤
		String[] cnt = n.split("");

		// 수를 배열에다가 카운트.....
		// 9는 나오면 6에다가 넣어줄거니까 8까지만
		int[] num = new int[8];
		
		for (int i = 0; i < cnt.length; i++) {
			String temp = cnt[i]; // String temp에 cnt 배열의 값 하나하나 넣어줌
			int temp2 = Integer.parseInt(temp); // String을 int로 바꿔주기
			num[temp2] = ++num[temp2];

			if (num[temp2] == 9) { // 값이 9라면 5번인덱스에 넣는다
				num[5] = num[temp2];
			}
			
//			int set = 0;
//			for (int j = 0; j < num.length; j++) {
//				int a;
//				if (num[temp2] <= 1) {
//					continue;
//				}else if (num[temp2] > 1) {
//					set += num[temp2]-1;
//				}
//				
//			}
//			System.out.println(set);
		}

	}

}
