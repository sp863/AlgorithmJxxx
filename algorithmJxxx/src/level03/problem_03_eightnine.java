package level03;

import java.util.Scanner;

public class problem_03_eightnine{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
      int[][] arr = new int[105][105];
      
      int n = sc.nextInt();
      int m = sc.nextInt();
      
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
          arr[i][j] = sc.nextInt();
        }
      }
      
      for (int i = 0; i < n; i++) {
        for (int j = m-1; j >= 0; j--) {
          System.out.printf("%d ", arr[i][j]);
        }
        System.out.println();
      }

    }
}
