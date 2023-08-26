import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
 
public class Solution {
    public static StringBuilder sb = new StringBuilder();
    public static int[][] tree; // 트리
    public static int[] ancestor; // 조상이 누구인지 담을 배열
    public static int N; // 정점의 ㄱㅐ수
    public static int cnt; // 정점의 깊이를 담을 int
 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
 
        for (int tc = 1; tc <= T; tc++) {// T번의 반복
            sb.append("#" + tc + " ");
 
            String[] str = br.readLine().split(" ");
 
            N = Integer.parseInt(str[0]);
            // 정점의 개수
 
            int E = Integer.parseInt(str[1]);
            // 간선의 개수
 
            tree = new int[N + 1][2];
            // 0번 인덱스를 쓰지 않으므로 N+1. 왼쪽 자식과 오른쪽 자식. 자식이 없으면 0이 됨
            ancestor = new int[N + 1];
            // 마찬가지
            int child1 = Integer.parseInt(str[2]);
            int child2 = Integer.parseInt(str[3]);
            // 주어진 정점 두개
 
            String[] nodes = br.readLine().split(" ");
            // 노드 정보를 담은 String
            for (int i = 0; i < E; i++) {
                if (tree[Integer.parseInt(nodes[2 * i])][0] == 0) {
                    tree[Integer.parseInt(nodes[2 * i])][0] = Integer.parseInt(nodes[2 * i + 1]);// 정보가 부모 자식 순으로 주어지니까
                    // 1 2 1 3
                    // nodes[0] = 1 nodes[1]=2 이니까 tree[1][0] 에 2가 담김
                    // nodes[2] = 1 nodes[3]=3 이니까 tree[1][0]이 0이 아니고 tree[1][1] 에 3이 담김
                    // 2 4 3 5
                    // nodes[4] = 2 nodes[5] =4 니까 tree[2][0] 에 4가 담김
                    // nodes[6] = 3 nodes[7] =5 니까 tree[3][0] 에 5가 담김
                } else {
                    tree[Integer.parseInt(nodes[2 * i])][1] = Integer.parseInt(nodes[2 * i + 1]);
                }
 
                ancestor[Integer.parseInt(nodes[2 * i + 1])] = Integer.parseInt(nodes[2 * i]);// 정보가 부모 자식 순이니까 거꾸로해서
                                                                                                // ancestor[자식] = 부모 의
                                                                                                // 값이 들어가게함
            }
 
            ArrayList<Integer> ch1_anc = new ArrayList<>();
            ArrayList<Integer> ch2_anc = new ArrayList<>();
 
            while (child1 != 1 || child2 != 1) {// 입력받은 child 값을 공통조상인 1까지 타고 올라감
                if (child1 != 1) {
                    ch1_anc.add(ancestor[child1]);// child1 의 조상을 리스트에 추가하고 그 값을 child에 넣음. 그리고 반복을 통해 1까지 조상을 넣으면서 올라감
                    child1 = ancestor[child1];
                }
                if (child2 != 1) {
                    ch2_anc.add(ancestor[child2]);
                    child2 = ancestor[child2];
                }
            }
//          for (int i = 0; i < ch1_anc.size(); i++) {
//              System.out.println("1의 조상   " + ch1_anc.get(i));
//          }
//          for (int i = 0; i < ch2_anc.size(); i++) {
//              System.out.println("2의 조상   " + ch2_anc.get(i));
//          }
 
            int common = 1;// 가장 작은 공통조상인 1
             
             
            for (int i = 0; i < ch1_anc.size(); i++) {
                for (int j = 0; j < ch2_anc.size(); j++) {
                    if (ch1_anc.get(i).equals( ch2_anc.get(j)) ){//==로는 비교가 안되서 equals매서드를 씀 Integer가 래퍼클래스라서 그런가
                         
                        if (preorder(common) > preorder(ch1_anc.get(i)))
                            common = ch1_anc.get(i);
 
                    }
                }
            } // 가까운 공통조상일 수록 총 자식수가 작음
 
            sb.append(common + " " + preorder(common) + "\n");
 
        } // T번의 반복
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
 
    }
 
    public static int preorder(int i) {
 
        int ans = 0;// 깊이 카운트
        if (i == 0)
            return ans;// 자식이 없는 노드이면 0으로 리턴
 
        if (i <= N) {
            cnt = 0;
            cnt += preorder(tree[i][0]) + preorder(tree[i][1]);
            // 왼쪽 오른쪽 자식들을 탐색
            // 리프노드일 경우 cnt 1이되고 리턴 됨 그럼 그다음 부모는 자식들의 cnt를 받고
            cnt++;
            // 자신까지 세서 cnt ++ 를 한뒤 리턴
        }
 
        ans = cnt;
 
        return ans;
    }
 
}
