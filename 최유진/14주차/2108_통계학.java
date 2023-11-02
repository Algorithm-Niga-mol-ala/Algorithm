package algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class bj_2108 {

	public static void main(String[] args) {

		// N은 홀수다
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		Map<Integer, Integer> map = new HashMap<>();

		StringBuilder sb = new StringBuilder();
		double sum = 0;
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}

		}
		sb.append(Math.round(sum / N) + "\n"); // 평균

		Arrays.sort(arr);
		sb.append(arr[N / 2] + "\n"); // 중앙값

		List<Integer> keySet = new ArrayList<>(map.keySet());
		keySet.sort((o1, o2) -> o1.compareTo(o2)); //key를 오름차순으로 정렬
		keySet.sort((o1, o2) -> map.get(o2).compareTo(map.get(o1))); //value(빈도)를 내림차순으로 정렬
		if (N != 1 && map.get(keySet.get(0)) == map.get(keySet.get(1))) {
			sb.append(Integer.toString(keySet.get(1)) + "\n");
		} else {
			sb.append(Integer.toString(keySet.get(0)) + "\n");
		}

		sb.append(Integer.toString(Math.abs(arr[N - 1] - arr[0]))); // 범위

		System.out.println(sb.toString());
	}

}
