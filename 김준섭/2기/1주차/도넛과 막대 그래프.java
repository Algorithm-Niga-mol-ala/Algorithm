import java.util.*;

class Solution {
    static boolean[] visit;
    static int[] answer;
    static int[] fromCount;
    static int[] toCount;
    static int search;
    static ArrayList<Integer>[] graph;
    public int[] solution(int[][] edges) {
        answer = new int[4];
        
        // find size of nodes
        int max = 0;
        for(int i = 0; i < edges.length; i++) {
            int from = edges[i][0];
            int to = edges[i][1];
            
            max = Math.max(Math.max(max, from), to);
        }
        // init graph
        graph = new ArrayList[max+1];
        fromCount = new int[max+1];
        toCount = new int[max+1];
        visit = new boolean[max+1];
        for(int i = 0 ; i < graph.length; i++)
            graph[i] = new ArrayList<>();
        
        // sort nodes
        for(int i = 0; i < edges.length; i++) {
            int from = edges[i][0];
            int to = edges[i][1];
            
            fromCount[from]++;
            toCount[to]++;
            graph[from].add(to);
        }
        
        // find start Point and get stick count
        for(int i = 1; i < fromCount.length; i++) {
            if(toCount[i] == 0 && fromCount[i] > 1) {
                answer[0] = i;
                visit[i] = true;
                for(int j = 0; j < graph[i].size(); j++) {
                    toCount[graph[i].get(j)]--;
                }
                break;
            } 
        }
        
        for(int i = 1; i < fromCount.length; i++) {
            // get 8 count
            if(toCount[i] == 2 && fromCount[i] == 2 && !visit[i]) {
                answer[3]++;
                DFS(i);
                // System.out.println("8 node : " + i);
            } else if(toCount[i] == 0 && !visit[i]) {
                // get stick count
                DFS(i);
                answer[2]++;
                // System.out.println("stick node : " + i);
            }
        }
        
        // get donut count
        for(int i = 0; i < graph.length; i++) {
            for(int j = 0; j < graph[i].size(); j++) {
                if(!visit[graph[i].get(j)]) {
                    DFS(graph[i].get(j));
                    answer[1]++;
                    // System.out.println("donut node : " + graph[i].get(j));
                }
            }
        }
        
        return answer;
    }
    
    void DFS(int node) {
        if(visit[node])
            return;
            
        visit[node] = true;
        for(int i = 0; i < graph[node].size(); i++) {
            DFS(graph[node].get(i));
        }
    }
    
    
}
