import java.util.*;
import java.io.*;

class Solution {
    static class Node {
        int idx; // 프로세스 순서
        int num; // 프로세스 중요도
        public Node() {};
        public Node(int idx, int num) {
            this.idx=idx;
            this.num=num;
        };
        @Override
        public String toString() {
            return "Node[idx:"+idx+", num:"+num+"]";
        };
    }
    public int solution(int[] priorities, int location) {
        Queue<Node> q = new LinkedList<>();
        
        for(int i=0; i<priorities.length; i++) {
            q.add(new Node(i, priorities[i]));
        }
        
        int find = priorities[location];
        int answer=0;
        boolean flag=true; // 우선순위가 가장 높은지 판별
        
        while(!q.isEmpty()) {
            flag=true; // 초기화
            Node out = q.poll();
            
            for(Node node : q) {
                if (out.num<node.num) {
                    flag=false; // 우선순위가 가장 높은 것이 아니라면 false
                    break;
                }
            }
            
            if (flag) answer++; // 우선순위가 가장 높으면 순서++
            else {
                q.add(out); // 아니라면 다시 큐에 넣기
            }
            
            // 우선순위가 가장 높고 찾는 순서의 프로세스라면 break
            if (flag&&out.idx==location&&out.num==find) break;
        }
        
        return answer;
    }
}
