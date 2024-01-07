import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

public class Main {

	static HashMap<Integer, int[]> map;
	static StringBuilder sb = new StringBuilder() ;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] NM = br.readLine().split(" ");
		// N 과 M

		int N = Integer.parseInt(NM[0]);
		int M = Integer.parseInt(NM[1]);

		String[] nums_str = br.readLine().split(" ");
		
		map = new HashMap<>();
		// 링크드 리스트처럼 생겨서 링크드 리스트 사용
		// 그냥 인덱스를 계산해서 사용하니까 시간초과
    //역들의 정보를 계속 수정해줘야해서 map을 써봄
		int[] nums = new int[nums_str.length];
		for(int i=0; i<N ; i++) {
			nums[i]= Integer.parseInt(nums_str[i]);
		}

		for (int i = 0; i < N; i++) {
			if (i - 1 < 0) {
				map.put(nums[i], new int[] { nums[N - 1], nums[i + 1] });
			} else if (i + 1 >= N) {
				map.put(nums[i], new int[] { nums[i - 1], nums[0] });
			} else {
				map.put(nums[i], new int[] { nums[i - 1], nums[i + 1] });
			}
		}
		
		for (int l = 0; l < M; l++) {
			String[] command = br.readLine().split(" ");
			int i = 0;
			int j = 0;

			switch (command[0]) {

			case "BN":
				// 고유 번호 i를 가진 역의 다음 역의 고유 번호를 출력하고,
				// 그 사이에 고유 번호 j인 역을 설립한다.
				i = Integer.parseInt(command[1]);
				j = Integer.parseInt(command[2]);
				BN(i, j);

				break;
			case "BP":
				// 고유 번호 i를 가진 역의 이전 역의 고유 번호를 출력하고,
				// 그 사이에 고유 번호 j인 역을 설립한다.
				i = Integer.parseInt(command[1]);
				j = Integer.parseInt(command[2]);
				BP(i, j);
				break;
			case "CN":
				// 고유 번호 i를 가진 역의 다음 역을 폐쇄하고,
				// 그 역의 고유 번호를 출력.
				i = Integer.parseInt(command[1]);
				CN(i);
				break;

			case "CP":
				// 고유 번호 i를 가진 역의 이전 역을 폐쇄하고,
				// 그 역의 고유 번호를 출력.
				i = Integer.parseInt(command[1]);
				CP(i);
				break;

			}
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();

	}
//역하나가 들어오면 역을 만들고 그 다음역의 pre와 그 전역의 next를 고쳐야함
	static void BN(int target, int value) {
	
		int [] PN = map.get(target);
		int [] PN2 = map.get(PN[1]);
		sb.append(String.valueOf(PN[1])).append("\n");
		
		map.put(target, new int[] {PN[0],value});
		map.put(value, new int[] {target,PN[1]});
		map.put(PN[1], new int[] {value,PN2[1]});
		
	}

	static void BP(int target, int value) {
		
		int [] PN = map.get(target);
		int [] PN2 = map.get(PN[0]);
		sb.append(String.valueOf(PN[0])).append("\n");
		
		map.put(target, new int[] {value,PN[1]});
		map.put(value, new int[] {PN[0],target});
		map.put(PN[0], new int[] {PN2[0],value});
		
	}

	static void CN(int target) {
		
		int [] PN = map.get(target);
		int []PN2 = map.get(PN[1]);
		int []PN3 = map.get(PN2[1]);
		sb.append(map.remove(PN[1])).append("\n");
		
		map.put(target, new int[] {PN[0],PN2[1]});
		map.put(PN2[1], new int[] {target,PN3[1]});
		
	}

	static void CP(int target) {
	
		int [] PN = map.get(target);
		int []PN2 = map.get(PN[0]);
		int []PN3 = map.get(PN2[0]);
		sb.append(map.remove(PN[0])).append("\n");

		map.put(target, new int[] {PN2[0],PN[1]});
		map.put(PN2[0], new int[] {PN3[0],target});
		
	}

}
