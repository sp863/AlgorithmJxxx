package level02;

import java.util.Scanner;

public class problem_04_deci2{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
      int n = sc.nextInt();
      int m = sc.nextInt();
      
      int count = 0;
      
      for (int i = n; i <= m; i++) {
        int cnt = 0;
        for (int j = 1; j <= i; j++) {
          if (i % j == 0) cnt++;
        }
        if (cnt == 2) {
          System.out.printf("%d ", i);
        }
      }
    }
}
