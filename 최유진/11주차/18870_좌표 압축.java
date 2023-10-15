import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		HashMap<Integer, Integer> hashMap = new HashMap<>();
    //hashmap의 key : 해당 값 , value : 해당 값보다 작은 수
    //값을 추가할 때 key가 중복되면 value에 +1 하지 않는다. 
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N]; 
		int[] sortArr = new int[N]; //원래 순서를 알아야하므로 정렬된 버전의 arr를 생성한다
    
		String[] input = br.readLine().split(" ");
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(input[i]);
			sortArr[i] = arr[i];
		}
		
		Arrays.sort(sortArr);
		
		int rank = 0;
		for(int v : sortArr) {
			if(!hashMap.containsKey(v)) {
				hashMap.put(v, rank++);
			}
		}
		
		for(int key: arr) {
			bw.write(hashMap.get(key) + " ");
		}
		
		bw.close();
	}

}
