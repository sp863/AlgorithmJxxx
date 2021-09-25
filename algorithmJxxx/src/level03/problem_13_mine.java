package level03;

import java.util.Scanner;

public class problem_13_mine{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
      int n = sc.nextInt();
      int m = sc.nextInt();
      int y = sc.nextInt();
      int x = sc.nextInt();
      
      int[][] map = new int[105][105];
      int[] dy = {-1,1,0,0,-1,-1,1,1};
      int[] dx = {0,0,-1,1,-1,1,1,-1};
      
      for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= m; j++) {
          map[i][j] = sc.nextInt();
        }
      }
      
      if (map[y][x] == 1) {
        System.out.println("game over");
        System.exit(0);
      }
      
      int cnt = 0;
      for (int i = 0; i < 8; i++) {
        int yy = y + dy[i];
        int xx = x + dx[i];
        
        if (map[yy][xx] == 1) {
          cnt++;
        }
      }
      
      System.out.println(cnt);
    }
}