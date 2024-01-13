class Solution {
    static int [] answer;
    public int[] solution(int[][] edges) {

        int [] [] counting = new int [1000001][2];
        //노드 번호 {출발 , 도착}
        int max = 0;
        for(int i=1; i<=edges.length; i++){
            int [] now = edges[i-1];//출발 도착 간선
            counting[now[0]][0]++;//출발 노드의 출발 횟수 늘리기
            counting[now[1]][1]++;//도착 노드의 도착 횟수 늘리기
            max=Math.max(max,Math.max(now[0],now[1]));
        }
        //List<List<Integer>> 로 했었는데 런타임 에러가 났었는데
        //아마 노드 번호가 노드 10개라고 1~10 인게 아니라 마음대로 정해질 수 있었는듯 list.get(i)로 없는 인덱스를 불러와서 런타임 에러 난듯함
      
        answer = new int[4];
        for(int i=1; i<=max; i++){
        if(counting[i][0]>=2 && counting[i][1]==0){
            //나가는게 2개 이상, 들어오는게 없음
            answer[0] = i;
        }else if(counting[i][0]==0 && counting[i][1]>=1){
            //나가는 게 없고 들어오기만 함
            answer[2]++;//스틱
        }else if(counting[i][0]==2 && counting[i][1]>=2){
            //나가는 게 2개이고 들어오는게 2개 이상
            answer[3]++;//8자
        }
            
        }
        answer[1] = counting[answer[0]][0]-answer[2]-answer[3];
        
        return answer;
    }
   
}
