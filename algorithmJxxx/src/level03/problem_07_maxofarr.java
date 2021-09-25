package level03;

import java.util.Scanner;

public class problem_07_maxofarr{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
      int[][] arr = new int[15][15];
      
      int max = 0;
      int y = -1;
      int x = -1;
      
      for (int i = 1; i <= 9; i++) {
        for (int j = 1; j <= 9; j++) {
          arr[i][j] = sc.nextInt();
          if (arr[i][j] > max) {
            max = arr[i][j];
            y = i;
            x = j;
          }
        }
      }
      
      System.out.printf("%d\n%d %d", max, y, x);
      
    }
}