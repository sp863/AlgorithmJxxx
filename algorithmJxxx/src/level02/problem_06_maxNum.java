package level02;

import java.util.Scanner;

public class problem_06_maxNum{
    public static void main(String[] args){
      
      Scanner sc = new Scanner(System.in);
      
      int max = 0;
      int order = 0;
      for (int i = 0; i < 9; i++) {
        int x = sc.nextInt();
        
        if (x > max) {
          max = x;
          order = i+1;
        }
      }
      
      System.out.println(max);
      System.out.println(order);
      
    }
}
