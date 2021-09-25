package level04;

import java.util.Scanner;

public class problem_02_tetris{
    static int c, r;
    static int[][] map = new int[25][25];
    
    static int getScore() {
      int count = 0;
      for (int i = 0; i < r; i++) {
        int cnt = 0;
        for (int j = 0; j < c; j++) {
          if (map[i][j] == 1) {
            cnt++;
          }
        }
        if (cnt == c) {
          count++;
        }
      }
      return count;
    }
  
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
      c = sc.nextInt();
      r = sc.nextInt();
      
      for (int i = 0; i < r; i++) {
        for (int j = 0; j < c; j++) {
          map[i][j] = sc.nextInt();
        }
      }
      
      int column = -1;
      int max = 0;
      for (int i = 0; i < c; i++) {
        int x = 0;
        for (int j = 0; j < r; j++) {
          if (map[j][i] == 1) {
            int zeroCnt = 0;
            for (int k = j-1; k >= 0; k--) {
              if (map[k][i] == 0) {
                zeroCnt++;
              }
            }
            if (zeroCnt >= 4) {
              for (int k = 0; k < 4; k++) {
                map[j-1-k][i] = 1;
              }
              int score = getScore();
              if (score > max) {
                column = i;
                max = score;
              }
              for (int k = 0; k < 4; k++) {
                map[j-1-k][i] = 0;
              }
            }
            break;
          } else {
            x++;
          }
        }
        if (x == r) {
          for (int k = 0; k < 4; k++) {
            map[r-1-k][i] = 1;
          }
          int score = getScore();
          if (score > max) {
            column = i;
            max = score;
          }
          for (int k = 0; k < 4; k++) {
            map[r-1-k][i] = 0;
          }
        }
      }
      
      System.out.printf("%d %d", column+1, max);
      
      
    }
}