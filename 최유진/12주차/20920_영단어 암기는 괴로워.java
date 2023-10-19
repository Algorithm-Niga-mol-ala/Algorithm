import java.util.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

public class bj_20920 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] input1 = br.readLine().split(" ");
		int N = Integer.parseInt(input1[0]);
		int M = Integer.parseInt(input1[1]);
		
		HashMap<String, Integer> hashmap = new HashMap<>();
		
		for(int i = 0; i < N; i++) {
			String word = br.readLine();
			if(word.length() >= M) { //단어의 길이가 M 이상일 경우
				if(!hashmap.containsKey(word)) //hashmap에 <단어, 나온 횟수>로 저장한다.
					hashmap.put(word, 1);
				else
					hashmap.put(word, hashmap.get(word)+1);
			}
		}
		
		List<String> keySet = new ArrayList<>(hashmap.keySet()); //key만 모아둔 리스트를 만들고, 이 리스트를 정렬할 것이다.
		keySet.sort(new Comparator<String>() { //정렬 기준을 새로 정의해준다. 
			@Override
			public int compare(String o1, String o2) {
				if(hashmap.get(o1) == hashmap.get(o2)) { //hashmap에 저장해둔 '나온 횟수' 비교. 같다면?
					if(o2.length() == o1.length()) return o1.compareTo(o2); //길이도 똑같다면? 오름차순으로 비교
					else return o2.length() - o1.length(); //길이 다르면 길이로 비교.
				} else { //'나온 횟수' 다르다면?
					return hashmap.get(o2) - hashmap.get(o1); //나온 횟수로 비교.
				}
			}
		});
		
		StringBuilder sb = new StringBuilder(); //스트링빌더로 안 하니까 시간 초과가 났다. 시간 까다로운 문제 조심하기.
		for(String w : keySet) {
			sb.append(w + "\n");
		}
		bw.write(sb.toString());
		bw.close();
		
	}

}
