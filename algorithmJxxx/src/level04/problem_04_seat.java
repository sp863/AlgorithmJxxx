package level04;

import java.util.Scanner;

public class problem_04_seat{
    static int r, c;
    static long k;
    static long[][] arr = new long[1005][1005];
    
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
      r = sc.nextInt();
      c = sc.nextInt();
      k = sc.nextLong();
      
      int y = 1;
      int x = 0;
      int num = 1;
      int dir = 1;
      
      for (int i = 0; i < r*c; i++) {
        int yy = y;
        int xx = x;
        
        if (dir == 1) {
          xx += 1;
        } else if (dir == 2) {
          yy += 1;
        } else if (dir == 3) {
          xx -= 1;
        } else if (dir == 4) {
          yy -= 1;
        }
        
        if (yy < 1 || yy > r || xx < 1 || xx > c || arr[yy][xx] != 0) {
          dir += 1;
          if (dir > 4) dir = 1;
          
          yy = y;
          xx = x;
          
          if (dir == 1) {
            xx += 1;
          } else if (dir == 2) {
            yy += 1;
          } else if (dir == 3) {
            xx -= 1;
          } else if (dir == 4) {
            yy -= 1;
          }
        }
        
        arr[yy][xx] = num;
        num++;
        y = yy;
        x = xx;
      }
      
      int locY = 0;
      int locX = 0;
      boolean kPossible = false;
      
      for (int i = 1; i <= r; i++) {
        for (int j = 1; j <= c; j++) {
          if (arr[i][j] == k) {
            locY = i;
            locX = j;
            kPossible = true;
          }
        }
      }
      
      if (kPossible) {
        System.out.printf("%d %d", locY, locX);
      } else {
        System.out.println(0);
      }
    }
}