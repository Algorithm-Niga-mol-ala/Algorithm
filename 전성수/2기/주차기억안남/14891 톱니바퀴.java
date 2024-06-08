import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;

public class Main {
	static boolean[] checked, already;
	static int[] one_arr, two_arr, three_arr, four_arr;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String[] one = br.readLine().split("");
		String[] two = br.readLine().split("");
		String[] three = br.readLine().split("");
		String[] four = br.readLine().split("");

		one_arr = new int[8];
		two_arr = new int[8];
		three_arr = new int[8];
		four_arr = new int[8];

		checked = new boolean[3];
		for (int i = 0; i < 8; i++) {
			one_arr[i] = Integer.parseInt(one[i]);
			two_arr[i] = Integer.parseInt(two[i]);
			three_arr[i] = Integer.parseInt(three[i]);
			four_arr[i] = Integer.parseInt(four[i]);
		}
		// N =0, S=1
		int cnt = Integer.parseInt(br.readLine());
		for (int i = 0; i < cnt; i++) {
			check();
			String[] rotate = br.readLine().split(" ");
			int target = Integer.parseInt(rotate[0]) - 1;
			int direction = Integer.parseInt(rotate[1]);
			already = new boolean[4];
			round(target, direction);
		}
		int ans =0;
		if(one_arr[0]==1) {
			ans+=1;
		}
		if(two_arr[0]==1) {
			ans+=2;
		}
		if(three_arr[0]==1) {
			ans+=4;
		}
		if(four_arr[0]==1) {
			ans+=8;
		}
		System.out.println(ans);
	}

	private static void round(int target, int direction) {
		// target은 인덱스 0~3
		already[target] = true;
		if (direction == 1) {
			int[] tmp = new int[8];
			switch (target) {
			case 0:
				for (int i = 1; i < 8; i++) {
					tmp[i] = one_arr[i - 1];
				}
				tmp[0] = one_arr[7];
				one_arr = tmp;
				break;
			case 1:
				for (int i = 1; i < 8; i++) {
					tmp[i] = two_arr[i - 1];
				}
				tmp[0] = two_arr[7];
				two_arr = tmp;
				break;
			case 2:
				for (int i = 1; i < 8; i++) {
					tmp[i] = three_arr[i - 1];
				}
				tmp[0] = three_arr[7];
				three_arr = tmp;
				break;
			case 3:
				for (int i = 1; i < 8; i++) {
					tmp[i] = four_arr[i - 1];
				}
				tmp[0] = four_arr[7];
				four_arr = tmp;
				break;
			}
		} else {
			int[] tmp = new int[8];
			switch (target) {
			case 0:
				for (int i = 6; i >= 0; i--) {
					tmp[i] = one_arr[i + 1];
				}
				tmp[7] = one_arr[0];
				one_arr = tmp;
				break;
			case 1:
				for (int i = 6; i >= 0; i--) {
					tmp[i] = two_arr[i + 1];
				}
				tmp[7] = two_arr[0];
				two_arr = tmp;
				break;
			case 2:
				for (int i = 6; i >= 0; i--) {
					tmp[i] = three_arr[i + 1];
				}
				tmp[7] = three_arr[0];
				three_arr = tmp;
				break;
			case 3:
				for (int i = 6; i >= 0; i--) {
					tmp[i] = four_arr[i + 1];
				}
				tmp[7] = four_arr[0];
				four_arr = tmp;
				break;
			}
		}
		int right = target + 1;
		int left = target - 1;
		// 옆톱니의 인덱스

		if (left >= 0 && !already[left] && !checked[target - 1]) {
			round(left, -1 * direction);

		}
		if (right <= 3 && !already[right] && !checked[target]) {
			round(right, -1 * direction);
		}

	}

	private static void check() {
		if (one_arr[2] == two_arr[6]) {
			checked[0] = true;
		} else {
			checked[0] = false;
		}

		if (two_arr[2] == three_arr[6]) {
			checked[1] = true;
		} else {
			checked[1] = false;
		}

		if (three_arr[2] == four_arr[6]) {
			checked[2] = true;
		} else {
			checked[2] = false;
		}

	}

}
