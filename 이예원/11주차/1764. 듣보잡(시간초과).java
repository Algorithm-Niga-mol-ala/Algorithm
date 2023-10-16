import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		String[] cantSee = new String[N];
		String[] cantHear = new String[M];

		for (int i = 0; i < N; i++) {
			cantSee[i] = br.readLine();
		} //보도 못한 사람 저장

		for (int i = 0; i < M; i++) {
			cantHear[i] = br.readLine();
		} //듣도 못한 사람 저장

    
    //N, M 중 길이 비교를 위해 짧은 길이 긴 길이 만들어줌
		int shortLen = N < M ? N : M;
		int longLen = N > M ? N : M;

    //짧은 길이로 배열 생성해줌 (어차피 겹치는 사람의 최댓값은 shortLen)
		String[] res = new String[shortLen];

		for (int i = 0; i < longLen; i++) {
			for (int j = 0; j < shortLen; j++) {

				// cantSee가 작다면
				if (cantSee.length < cantHear.length) {
					if (cantSee[j].equals(cantHear[i])) { // 듣도 보도 못했으면
						res[j] = cantSee[j]; // res에 이름 저장
					}
				} else { // cantHear이 작다면
					if (cantHear[j].equals(cantSee[i])) {
						res[j] = cantHear[j];
					}
				}

			}

		}

		// null값 제거하는 Java API
		res = Arrays.stream(res).filter(item -> item != null).toArray(String[]::new);

		Arrays.sort(res);

		System.out.println(res.length);
		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}

	}// main
}
