package level02;

import java.util.Scanner;

public class problem_03_triangle3{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
      int n = sc.nextInt();
      
      int odd = 1;
      for (int i = 0; i < n; i++) {
        for (int j = i; j < n-1; j++) {
          System.out.printf(" ");
        }
        for (int j = 0; j < odd; j++) {
          System.out.printf("*");
        }
        System.out.println();
        odd += 2;
      }
      
    }
}
