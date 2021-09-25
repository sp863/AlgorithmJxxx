package level05;

import java.util.Scanner;

public class problem_07_findprime{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);  
      
      int n = sc.nextInt();
      
      int answer = 0;
      
      for (int i = 0; i < n; i++) {
        int x = sc.nextInt();
        int count = 0;
        for (int j = 1; j <= x; j++) {
          if (x % j == 0) {
            count++;
          }
        }
        if (count == 2) {
          answer++;
        }
      }
      
      System.out.println(answer);
    }
}
