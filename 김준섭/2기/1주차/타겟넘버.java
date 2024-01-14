import java.util.*;

class Node{
    int value;
    int index;
    
    Node(int value, int index) {
        this.value = value;
        this.index = index;
    }
}

class Solution {
    public int solution(int[] numbers, int target) {
        int answer = 0;
    
        Queue<Node> bfs = new LinkedList<>();
        bfs.add(new Node(numbers[0], 1));
        bfs.add(new Node(numbers[0] * -1, 1));
        
        while(!bfs.isEmpty()) {
            Node temp = bfs.poll();
            
            if(temp.index == numbers.length) {
                if(target == temp.value)
                    answer++;
                continue;
            }            
            
            bfs.add(new Node(temp.value + numbers[temp.index], temp.index+1));
            bfs.add(new Node(temp.value - numbers[temp.index], temp.index+1));
        }
        
        return answer;
    }
}
