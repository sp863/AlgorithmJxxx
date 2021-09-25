package level03;

import java.util.Scanner;

public class problem_09_attackrange{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
      int n = sc.nextInt();
      int y = sc.nextInt();
      int x = sc.nextInt();
      int r = sc.nextInt();
      
      int[][] map = new int[105][105];
      
      for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n; j++) {
          int diffY = y-i;
          if (diffY < 0) diffY *= -1;
          int diffX = x-j;
          if (diffX < 0) diffX *= -1;
          
          int dist = diffY+diffX;
          
          if (dist <= r && dist != 0) {
            System.out.printf("%d ", dist);
          } else if (i == y && j == x) {
            System.out.printf("x ");
          } else {
            System.out.printf("%d ", map[i][j]);
          }
        }
        System.out.println();
      }
      
      
      
    }
}