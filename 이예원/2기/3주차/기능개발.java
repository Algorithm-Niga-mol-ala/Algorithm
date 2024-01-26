import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        
        Queue<Integer> daysQueue = new LinkedList<>(); // 각 기능이 배포되기까지 걸리는 일수를 담는 큐
        List<Integer> answerList = new ArrayList<>(); // 각 배포마다 몇 개의 기능이 배포되는지 담는 리스트

        // 각 기능이 배포되기까지 걸리는 일수를 계산하여 큐에 저장
        for (int i = 0; i < progresses.length; i++) {
            int remainder = 100 - progresses[i];
            int days = (remainder % speeds[i] == 0) ? remainder / speeds[i] : remainder / speeds[i] + 1;
            daysQueue.offer(days);
        }

        while (!daysQueue.isEmpty()) {
            int deployCount = 1; // 현재 배포되는 기능 수 (첫 번째 기능이 배포됨)

            // 다음 기능이 배포 가능한지 확인하면서 배포되는 기능 수 증가
            int currentDay = daysQueue.poll();
            while (!daysQueue.isEmpty() && daysQueue.peek() <= currentDay) {
                deployCount++;
                daysQueue.poll();
            }

            // 현재 배포되는 기능 수를 리스트에 추가
            answerList.add(deployCount);
        }

        // 리스트를 배열로 변환
        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }
}
