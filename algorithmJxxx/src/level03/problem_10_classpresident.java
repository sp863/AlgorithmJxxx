package level03;

import java.util.Scanner;

public class problem_10_classpresident{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
      int n = sc.nextInt();
      
      int[][] arr = new int[1005][10];
      
      for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= 5; j++) {
          arr[i][j] = sc.nextInt();
        }
      }
      
      int student = 1;
      int same = -1;
      
      for (int i = 1; i <= n; i++) {
        int cnt = 0;
        for (int j = 1; j <= n; j++) {
          if (i != j) {
            if (arr[i][1] == arr[j][1] ||
                arr[i][2] == arr[j][2] ||
                arr[i][3] == arr[j][3] ||
                arr[i][4] == arr[j][4] ||
                arr[i][5] == arr[j][5]) {
                cnt++;  
            }
          }
        }
        if (cnt > same) {
          same = cnt;
          student = i;
        }
      }
      
      System.out.println(student);
      
      
    }
}