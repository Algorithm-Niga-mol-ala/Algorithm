import java.util.HashMap;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];

        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            map.put(name[i], yearning[i]);
        }

        // 각 사진마다 인물의 이름을 확인하고 점수를 합산
        for (int i = 0; i < photo.length; i++) {
            int memoryScore = 0;  // 현재 사진의 점수
            for (int j = 0; j < photo[i].length; j++) {
                if (map.containsKey(photo[i][j])) {
                    memoryScore += map.get(photo[i][j]);
                }
            }
            answer[i] = memoryScore;
        }

        return answer;
    }
}
