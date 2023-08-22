package algo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class bj2309 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] arr = new int[9];
		int sum = 0;
		for (int i = 0; i < 9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
		}

    //전체 합에서 뺄 두 명의 키를 골라 낼 것임.
		int minusSum = 0;
		check: for (int i = 0; i < 9; i++) {
			for (int j = i + 1; j < 9; j++) {
				minusSum = arr[i] + arr[j];
        //뺄 두 명을 전체 합에서 뺐더니 100이라면
				if (sum - minusSum == 100) {
          //fake난쟁이들 키는 0으로 바꿔준다. 
					arr[i] = 0;
					arr[j] = 0;
					break check;
				} else {
					minusSum = 0;
				}
			}
		}

    //오름차순으로 출력해야하므로 정렬해주고
		Arrays.sort(arr);
    //0으로 설정한 두 명의 키가 인덱스 0, 1에 있으니까 i는 2부터 시작
		for (int i = 2; i < 9; i++) {
			bw.write(Integer.toString(arr[i]) + "\n");
		}

		bw.close();

	}

}
