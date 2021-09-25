package level03;

import java.util.Scanner;

public class problem_04_offset{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
      int[][] arr = new int[10][10];
      int[] dy = {-1,0,0,1};
      int[] dx = {0,-1,1,0};
      
      for (int i = 1; i <= 5; i++) {
        for (int j = 1; j <= 5; j++) {
          arr[i][j] = sc.nextInt();
        }
      }
      
      for (int i = 0; i <= 6; i++) {
        for (int j = 0; j <= 6; j++) {
          if (i == 0 || j == 0 || i == 6 || j == 6) {
            arr[i][j] = 11;
          }
        }
      }
      
      for (int i = 1; i <= 5; i++) {
        for (int j = 1; j <= 5; j++) {
          int x = arr[i][j];
          
          int count = 0;
          
          for (int k = 0; k < 4; k++) {
            int yy = dy[k]+i;
            int xx = dx[k]+j;
            
            if (arr[yy][xx] > x) {
              count++;
            }
          }
          
          if (count == 4) {
            System.out.printf("* ");
          } else {
            System.out.printf("%d ", arr[i][j]);
          }
        }
        System.out.println();
      }
    }
}
