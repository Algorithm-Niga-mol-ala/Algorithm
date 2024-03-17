import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        HashSet<Integer> set = new HashSet<Integer>();
        Arrays.sort(reserve);
        
        for(int x: lost)
            set.add(x);
        
        for(int i =0 ;i < reserve.length; i++){
            if(set.contains(reserve[i])){
              set.remove(reserve[i]);
            reserve[i] = -1;
            } 
        }
        
        int ans =reserve.length ;
        for(int i =0 ;i < reserve.length; i++){
            int left = reserve[i] -1;
            int right = reserve[i]+1;
            if(set.contains(left)){
                set.remove(left);
            }else if(set.contains(right)){
                set.remove(right);
            }
        }
        return n - set.size();
    }
}
