package level02;

import java.util.Scanner;

public class problem_09_scorecal{
    static int n;
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
      n = sc.nextInt();
      
      int total = 0;
      int score = 0;
      
      for (int i = 0; i < n; i++) {
        int a = sc.nextInt();
        
        if (a == 1) {
          score += 1;
          total += score;
        } else {
          score = 0;
        }
      }
      
      System.out.println(total);
    }
}
