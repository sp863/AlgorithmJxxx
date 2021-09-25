package level03;

import java.util.Scanner;

public class problem_15_rowcolflip2{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
      int n = sc.nextInt();
      int[][] arr = new int[15][15];
      
      for (int i = 0; i < 10; i++) {
        for (int j = 0; j < 10; j++) {
          arr[i][j] = sc.nextInt();
        }
      }
      
      for (int i = 0; i < n; i++) {
        
        for (int j = 0; j < 10; j++) {
          for (int k = 0; k < 10; k++) {
            if (j == i || k == i) {
              if (arr[j][k] == 1) {
                arr[j][k] = 0;
              } else {
                arr[j][k] = 1;
              }
            }
          }
        }
      }
      
      for (int i = 0; i < 10; i++) {
        for (int j = 0; j < 10; j++) {
          System.out.printf("%d ", arr[i][j]);
        }
        System.out.println();
      }
    }
}