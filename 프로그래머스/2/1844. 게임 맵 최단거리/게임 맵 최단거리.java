import java.util.*;

class Solution {
    boolean[][] visited;
    int[] dx = {1,-1,0,0};
    int[] dy = {0,0,1,-1};
    int N, M;
    
    public int solution(int[][] maps) {
        N = maps.length;
        M = maps[0].length;
        
        visited = new boolean[N][M];
        
        bfs(0,0,maps);
        
        return maps[N-1][M-1] == 1 ? -1 : maps[N-1][M-1];
    }
    
    public void bfs(int startX, int startY, int[][] maps) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{startX,startY});
        visited[startX][startY] = true;
        
        while(!q.isEmpty()) {
            int[] cur = q.poll();
            int x = cur[0];
            int y = cur[1];
          
            for(int i=0; i<4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                if(nx >= 0 && nx < N && ny >=0 && ny < M 
                   && !visited[nx][ny] && maps[nx][ny] != 0) {
                    maps[nx][ny] += maps[x][y];
                    q.add(new int[]{nx,ny});
                    visited[nx][ny] = true;
                }
            }
        }
    }
}