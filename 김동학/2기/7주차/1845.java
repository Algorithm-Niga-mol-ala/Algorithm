import java.util.*;

class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> hash = new HashSet<Integer>();
        int answer = 0;
        int len = nums.length;
        for(int i = 0; i < len; i++){
            hash.add(nums[i]);
        }
        if(hash.size() >= len/2)
            answer = len/2;
        else
            answer = hash.size();
        return answer;
    }
}
