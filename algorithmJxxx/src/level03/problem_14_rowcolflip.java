package level03;

import java.util.Scanner;

public class problem_14_rowcolflip{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
      int[][] arr = new int[15][15];
      
      int n = sc.nextInt();
      
      for (int i = 0; i < n; i++) {
        
        for (int j = 0; j < 10; j++) {
          for (int k = 0; k < 10; k++) {
            if (j == i || k == i) {
              if (arr[j][k] == 0) {
                arr[j][k] = 1;
              } else {
                arr[j][k] = 0;
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