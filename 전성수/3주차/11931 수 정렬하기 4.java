import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		//출력은 버퍼를 비우는 작업이므로 자주 할 수록 안좋음
		
		int N = Integer.parseInt(br.readLine());

		
		Integer [] nums = new Integer[N];
		//int 의 Wrapper 클래스 int를 객체로 사용해야할 때 씀 
		//(1)기본 타입의 데이터를 객체로 표현해야 하는 경우 Wrapper클래스를 쓴다~
		
		for(int i =0; i<N ; i++) {
			nums[i]=Integer.parseInt(br.readLine());
		}

		
		Arrays.sort(nums, Collections.reverseOrder());
		//(2)Collections 클래스의 reverseOrder매서드 값들을 비교해서 내림차순으로 뱉음
		
		
		for(int i=0; i<N; i++) {
			bw.write(nums[i]+"\n");
		}
		
		bw.flush();
	}
}
