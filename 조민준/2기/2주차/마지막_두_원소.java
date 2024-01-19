import java.util.Arrays;
/*
 * 정수 리스트 num_list가 주어질 때,
 * 마지막 원소가 그전 원소보다 크면 마지막 원소에서 그전 원소를 뺀 값을
 * 마지막 원소가 그전 원소보다 크지 않다면 마지막 원소를 두 배한 값을 추가하여
 * return 하도록 solution 함수를 완성해주세요.
 */
class Solution {
    public int[] solution(int[] num_list) {
        int len = num_list.length;	// 파라미터의 길이
        int[] answer = Arrays.copyOf(num_list, len+1);	// 배열을 복사하는데 길이는 하나 더 길게 만들어 줌.
        
        if(num_list[len-1] > num_list[len-2]) {					// 마지막 원소가 그전 원소보다 크면
        	answer[len] = num_list[len-1] - num_list[len-2];	// 마지막 원소 - 그전 원소
        } else {												// 마지막 원소가 그전 원소보다 작거나 같으면
        	answer[len] = num_list[len-1] * 2;					// 마지막 원소 * 2
        }
        
        return answer;
    }
}