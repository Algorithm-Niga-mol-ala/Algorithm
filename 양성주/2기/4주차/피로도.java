class Solution {
    public int solution(int k, int[][] dungeons) {
        boolean[] visited = new boolean[dungeons.length];
		dfs(k,dungeons,visited);
        return max;
    }
    public static int max=0;
    static void dfs(int k, int[][] dg, boolean[] v) {
		
		int cnt = 0;
		for(int i=0;i<v.length;i++) {
			if(v[i]) {
				cnt++;
			}
		}
		if(cnt > max) {
			max = cnt;
		}
		if(max == dg.length) return;
		
		for(int i=0;i<dg.length;i++) {
			if(!v[i]) {
				if(dg[i][0]<=k) { //남은 체력보다 필수가 적다면
					v[i] = true;
					k -= dg[i][1]; //남은체력 - 소모체력
					dfs(k,dg,v);
					v[i] = false;
					k += dg[i][1];
				}
			}
		}
	}

}
	
