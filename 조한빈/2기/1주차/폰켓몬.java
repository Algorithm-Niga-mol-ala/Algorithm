import java.util.Set;
import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        // cnt : 데려갈 수 있는 포켓몬의 수
        int cnt = nums.length / 2;
        
        // set : 포켓몬의 종류 수를 구하기 위해 선언
        Set<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        
        // 데려갈 수 있는 포켓몬의 수와 포켓몬 종류 수를 비교, 더 작은 값이 정답
        answer = cnt > set.size() ? set.size() : cnt;
        
        return answer;
    }
}
