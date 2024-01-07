import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2858_기숙사바닥 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		st = new StringTokenizer(br.readLine());

		int R = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());

		// R+B=방의 넓이 -> 최대한 시간을 줄이기 위해 중간부터 반복문을 돌리기로 함
    // 사각형의 넓이를 구할 때 가로와 세로가 가장 큰 경우는 가로=세로 임 -> 각 길이가 루트넓이부터 시작해서 점점 차이가 나도록 i와 j 설정
		loop: for (int i = (int) Math.sqrt(R + B); i >= 1; i--) { // W
			for (int j = i; j <= (R + B); j++) { // L
				if (i * j != (R + B)) continue;
				if (2 * j + 2 * (i - 2) == R) {
					sb.append(j).append(" ").append(i);
					break loop;
				}

			}
		} // for
		System.out.println(sb);
	} // main
}
