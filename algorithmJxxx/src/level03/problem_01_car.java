package level03;

import java.util.Scanner;

public class problem_01_car{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
      int n = sc.nextInt();
      
      int result = 0;
      
      for (int i = 0; i < 5; i++) {
        int x = sc.nextInt();
        
        if (x == n) {
          result++;
        }
      }
      System.out.println(result);
    }
}