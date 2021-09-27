package level05;

import java.util.Scanner;

public class problem_10_combinationzero{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
      int n = sc.nextInt();
      int m = sc.nextInt();
      
      int[][] arr = new int[35][35];
      
      for (int i = 0; i <= n; i++) {
        if (i == 0) {
          arr[i][0] = 1;
        } else if (i == 1) {
          arr[i][0] = 1;
          arr[i][1] = 1;
        } else {
          for (int j = 0; j < i+1; j++) {
            if (j == 0 || j == i) {
              arr[i][j] = 1;
            } else {
              arr[i][j] = arr[i-1][j-1]+arr[i-1][j];
            }
          }
        }
      }
      System.out.println(arr[n][m]);
    }
}
