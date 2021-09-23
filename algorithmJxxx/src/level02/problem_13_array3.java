package level02;

import java.util.Scanner;

public class problem_13_array3{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
      int n = sc.nextInt();
      
      int y = 1;
      int incY = 2;
      int incX = 1;
      
      for (int i = 0; i < n; i++) {
        
        for (int j = i; j < n; j++) {
          System.out.printf("%d ", y);  
        }
        System.out.println();
        y += incY;
        incY += 1;
        incX += 1;
      }
      
    }
}
