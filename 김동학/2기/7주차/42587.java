import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Integer> que = new LinkedList<Integer>();
        for(int p : priorities)
            que.add(p);
        Arrays.sort(priorities);
        int len = priorities.length-1;
        // priorites의 0인덱스부터 바라보면서 que의 프로세스 값을 비교해본다.
        while(!que.isEmpty()){
            int peek = que.poll();
            if(peek == priorities[len - answer]){ // 실행해야할 우선순위의 프로세스
                answer++;
                location--;
                if(location<0)
                    break;
            }
            else{ // 실행할 우선순위가 아닌 프로세스
                que.add(peek);
                location--;
                if(location<0) location = que.size()-1;
            }
        }
        return answer;
    }
}
