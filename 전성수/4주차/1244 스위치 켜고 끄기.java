import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int Switch = Integer.parseInt(br.readLine());
		// 스위치의 개수
		String[] str = br.readLine().split(" ");
		// 스위치의 상태. str 은 Switch 개의 요소를 가지는 문자열 배열
		int [] pos = new int[length];
		// 문데에서 스위치의 번호가 1부터 시작이니까 0번 인덱스를 버리고 1번부터 시작하기 위해 크기를 length 해줌
		int idx=0;
		int length = pos.length;
		
		for(int i=1; i< length; i++) {
			pos[i]=Integer.parseInt(str[idx++]);
		}//pos의 1번 인덱스부터 스위치의 값을 넣어줌
		
		int S = Integer.parseInt(br.readLine());
		// 학생의 수
		student[] students = new student[S];
		// 크기 S의 student 배열을 생성

		for (int s = 0; s < S; s++) {
			// 학생 수만큼의 반복
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int gender = Integer.parseInt(st.nextToken());
			int number = Integer.parseInt(st.nextToken());
			students[s] = new student(gender, number);

			// StringTokenizer로 문자열을 나누고
			// students에 새로 만든 student를 넣음
		}
		
		for (int i = 0; i < S; i++) {
			// 학생 수만큼의 반복
			
			if (students[i].gender == 1) {
				// 남학생일 때
				int num = students[i].number; // 학생이 가지고 있는 스위치의 번호
				int n = 1; // 배수

				while (num * n< length) {
					
					if (pos[num*n]==1)
						pos[num*n] = 0;
					else
						pos[num*n] = 1;
					n++;
				} // Switch보다 작은 num의 배수 스위치 on off
			} else {
				// 여학생일 때
				int num = students[i].number;

				if (pos[num]==1) {
					pos[num] = 0;
				} else {
					pos[num] = 1;
				}//가지고 있는 번호의 스위치를 바꿔줌

				int left = num - 1;
				int right = num + 1;
				//왼쪽 오른쪽 탐색
				while (left > 0 && right < length) {
					//pos의 0번 인덱스는 버리는 인덱스이므로 0보다 커야하고 길이보다 짧아야한다
					if (pos[left]==(pos[right])) {
						if (pos[left]==0) {
							pos[left]=1;
							pos[right]=1;
						} else if (pos[left]==1) {
							pos[left] = 0;
							pos[right] = 0;
						}
						left--;
						right++;
					}else {
						break;
					}
				}
			}

		} // switch 바꾸는 반복
		for (int i = 1; i < length; i++) {
			
			bw.write(pos[i] + " ");
			
			if (i% 20 == 0) //20의 배수이면 엔터를 한번씩 넣어줌
				bw.write("\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}

}

class student {
	int gender;
	int number;

	student(int gender, int number) {
		this.gender = gender;
		this.number = number;
	}
}
