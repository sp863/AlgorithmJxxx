package level02;

import java.util.Scanner;

public class problem_12_numpyramid{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
      int n = sc.nextInt();
      int s = sc.nextInt();
      
      int preFirst = 0;
      int preLast = 0;
      
      int inc = 1;
      
      for (int i = 1; i <= n; i++) {
        for (int j = i; j < n; j++) {
          System.out.print(" ");
        }
        if (i % 2 == 1) {
          int currFirst = 0;
          if (i == 1) currFirst = s;
          else {
            currFirst = preLast;
            for (int k = 0; k < inc; k++) {
              currFirst += 1;
              if (currFirst > 9) currFirst = 1;
            }
          }
          preFirst = currFirst;
          for (int j = 0; j < inc; j++) {
            System.out.printf("%d", currFirst);
            currFirst -= 1;
            if (currFirst < 1) currFirst = 9;
          }
        } else {
          int currFirst = preFirst+1;
          if (currFirst > 9) currFirst = 1;
          for (int j = 0; j < inc; j++) {
            System.out.printf("%d", currFirst);
            preLast = currFirst;
            currFirst += 1;
            if (currFirst > 9) currFirst = 1;
          }
        }
        inc += 2;
        System.out.println();
      }
      
    }
}
