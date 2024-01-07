import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_영준이의카드카운팅 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= T; tc++) {
			String str = br.readLine();

			// 각 카드 배열 생성
			int[] S = new int[13];
			int[] D = new int[13];
			int[] H = new int[13];
			int[] C = new int[13];

			// 입력받은 카드+숫자의 문자열 쪼개주기
			for (int i = 0; i < str.length(); i += 3) {
				String cNum = str.substring(i, i + 3);
				String card = cNum.substring(0, 1);
				int num = Integer.parseInt(cNum.substring(1, 3));

//				System.out.print(cNum + " ");
//				System.out.print(card + " ");
//				System.out.print(num);
//				System.out.println();

				if (card.equals("S"))
					S[num - 1]++; // 1~13까지의 번호를 0~12까지인 인덱스에 담아야 하므로
				else if (card.equals("D"))
					D[num - 1]++;
				else if (card.equals("H"))
					H[num - 1]++;
				else
					C[num - 1]++;
			}
//			System.out.println(Arrays.toString(S));
//			System.out.println(Arrays.toString(D));
//			System.out.println(Arrays.toString(H));
//			System.out.println(Arrays.toString(C));

			boolean flag = true;

			// 각 배열에서 없는 숫자의 개수 세주기
			int Scnt = 0;
			int Dcnt = 0;
			int Hcnt = 0;
			int Ccnt = 0;

			for (int i = 0; i < 13; i++) {
				if (S[i] >= 2 || D[i] >= 2 || H[i] >= 2 || C[i] >= 2) {
					flag = false;
					break;
				}
				if (S[i] == 0)
					Scnt++;
				if (D[i] == 0)
					Dcnt++;
				if (H[i] == 0)
					Hcnt++;
				if (C[i] == 0)
					Ccnt++;
			}
			if (flag)
				System.out.printf("#%d %d %d %d %d\n", tc, Scnt, Dcnt, Hcnt, Ccnt);
			else
				System.out.printf("#%d %s\n", tc, "ERROR");
		} // tc

	} // main
}
