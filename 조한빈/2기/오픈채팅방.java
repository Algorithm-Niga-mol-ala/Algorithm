import java.util.HashMap;
import java.util.Map;

class Solution {
	public String[] solution(String[] record) {
		Map<String, String> map = new HashMap<>();

		// 아이디 : 닉네임 저장하기

		// output : 정답을 저장할 answer 배열 크기 지정을 위해 선언
		int output = 0;
		for (String s : record) {
			String[] input = s.split(" ");

			if (input[0].equals("Enter") || input[0].equals("Change")) {
				map.put(input[1], input[2]);
			}

			// Enter, Leave 일 때만 answer 배열에 정답 저장
			if (input[0].equals("Enter") || input[0].equals("Leave")) {
				++output;
			}
		}

		// answer : 정답 배열
		String[] answer = new String[output];

		// 출력 문구 저장하기
		int idx = 0;
		for (int i = 0; i < record.length; ++i) {
			String[] input = record[i].split(" ");

			// answer 배열에 출력문 저장하기
			if (input[0].equals("Enter")) {
				answer[idx++] = map.get(input[1]) + "님이 들어왔습니다.";
			} else if (input[0].equals("Leave")) {
				answer[idx++] = map.get(input[1]) + "님이 나갔습니다.";
			}
		}

		return answer;
	}

}