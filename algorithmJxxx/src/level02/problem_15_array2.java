package level02;

import java.util.Scanner;

public class problem_15_array2{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
      int n = sc.nextInt();
      int m = sc.nextInt();
      int[][] arr = new int[n][m];
      
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
          arr[i][j] = sc.nextInt();
        }
      }
      
      int y = sc.nextInt();
      int x = sc.nextInt();
      
      System.out.println(arr[y][x]);
      
    }
}
