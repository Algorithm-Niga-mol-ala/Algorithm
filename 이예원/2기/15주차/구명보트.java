import java.util.Arrays;

class Solution {
    public int solution(int[] people, int limit) {
		int answer = 0;
        
		//무게 순으로 정렬
		Arrays.sort(people);
		
		int min_index = 0; //가장 가벼운 사람 위치
		int max_index = people.length - 1; //가장 무거운 사람 위치
		
		while(max_index >= min_index) {
			if(people[max_index] + people[min_index] <= limit) {
				answer++;
				max_index--;
				min_index++;
			}
			else {
				answer++;
				max_index--;
			}
		}
        
        return answer;
    }
}
