import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		

		int[] mush = new int[10];

		for (int i = 0; i < mush.length; i++) {
			mush[i] = Integer.parseInt(br.readLine());
		} // 버섯의 점수 입력받음

		int sum1 = 0;
		int sum2 = 0;

		int i = 0;
		while (i < mush.length && sum1 < 100) { // 100보다 작은 동안 더해주다가
			sum1 += mush[i];

			if (sum1 == 100) {
				break;
			}else if (sum1 > 100) {// 100넘으면 마지막 더한 값 빼고 break
				sum1 = sum1 - mush[i];
				break;
			}
			i++;

		}

		for (int j = 0; j < mush.length; j++) {
			sum2 += mush[j];
			if (sum2 > 100) {
				break;
			}
		} // 더해주다가 100넘으면 break

		// 100과의 차이가 sum1이 작을 때만 sum1 출력
		if ((100 - sum1) < (sum2 - 100)) {
			System.out.println(sum1);
		} else {
			System.out.println(sum2);
		}

	}

}
