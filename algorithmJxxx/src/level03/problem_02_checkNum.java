package level03;

import java.util.Scanner;

public class problem_02_checkNum{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
      int sum = 0;
      
      for (int i = 0; i < 5; i++) {
        int x = sc.nextInt();
        sum += (x*x);
      }
      
      int answer = sum%10;
      
      System.out.println(answer);
    }
}
