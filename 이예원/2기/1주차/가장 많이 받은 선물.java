import java.util.StringTokenizer;

class Solution {
    public int solution(String[] friends, String[] gifts) {

        int length = friends.length; // 친구 명수
        int[][] map = new int[length][length]; // 친구 수 길이의 2차원 배열

        for (int i = 0; i < gifts.length; i++) {
            // 선물을 주고 받은 경우를 돈다

            StringTokenizer st = new StringTokenizer(gifts[i]," ");

            String give = st.nextToken(); // 선물을 준 친구
            String get = st.nextToken(); // 선물을 받은 친구

            for (int j = 0; j < length; j++) {
                if (give.equals(friends[j])) {
                    // 선물을 준 친구의 인덱스 찾음

                    for (int k = 0; k < length; k++) {
                        if (get.equals(friends[k])) {
                            // 선물 받은 친구의 인덱스

                            map[j][k]++;


                        }
                    }
                }
            }
        }
        // 여기까지 2차원 배열 만들고 선물 준거 체크

        int[] score = new int[length]; // 선물지수 체크할 배열


        for(int i = 0; i < length; i++){

            int plus = 0;
            int minus = 0;

            for(int j = 0; j < length; j++){

                plus += map[i][j];
                minus += map[j][i];

            }

            score[i] = plus - minus;
        }

        int[] check = new int[length];

        for(int i = 0; i < length; i++){
            for(int j = 0; j < length; j++){
                if(map[i][j] > map[j][i]){ // 내가 선물을 더 많이 줬을 때
                    check[i]++;
                  
                }else if(map[i][j] == 0 && map[j][i] == 0 || map[i][j]==map[j][i]){
                  // 선물을 주고 받지 않았거나 주고 받은 선물의 갯수가 같을 때
                  
                    if(score[i] > score[j]){
                        check[i]++;
                    }
                    
                } else continue; // 내가 더 적게 줬으면 넘어가기
            }
        }

        int max = 0;
        for(int i = 0; i < length; i++){
            max = Math.max(max, check[i]);
        }


        return max;
    }
}
