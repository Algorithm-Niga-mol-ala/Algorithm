import java.util.*;

class Person {
    int row;
    int col;
    int count;
    
    Person(int row, int col, int count) {
        this.row = row;
        this.col = col;
        this.count = count;
    }
}

class Solution {
    public int solution(int[][] maps) {
        int answer = -1;
        
        boolean[][] visit = new boolean[maps.length][maps[0].length];
        int[] dr = {0,0,1,-1};
        int[] dc = {1,-1,0,0};
        
        Queue<Person> bfs = new LinkedList<>();
        bfs.add(new Person(0,0,1));
        
        while(!bfs.isEmpty()) {
            Person p = bfs.poll();
            
            if(visit[p.row][p.col])
                continue;
            
            if(p.row == maps.length-1 && p.col == maps[0].length-1) {
                answer = p.count;
                break;
            }
            
            visit[p.row][p.col] = true;
            
            for(int i = 0; i < dr.length; i++) {
                int searchRow = p.row + dr[i];
                int searchCol = p.col + dc[i];
                
                if(searchRow < 0 || searchRow >= maps.length ||
                    searchCol < 0 || searchCol >= maps[0].length)
                    continue;
                
                if(visit[searchRow][searchCol] 
                   || maps[searchRow][searchCol] == 0)
                    continue;
                
                bfs.add(new Person(searchRow,searchCol, p.count+1));
            }
        }
        
        return answer;
    }
}
