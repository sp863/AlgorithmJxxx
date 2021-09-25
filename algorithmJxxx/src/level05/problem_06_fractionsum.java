package level05;

import java.util.Scanner;

public class problem_06_fractionsum{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
      int num1 = sc.nextInt();
      int denom1 = sc.nextInt();
      
      int num2 = sc.nextInt();
      int denom2 = sc.nextInt();
      
      int denom = denom1*denom2;
      int numer = ((denom/denom1)*num1) + ((denom/denom2)*num2);
      
      int a = denom;
      int b = numer;
      int gcd = 0;
      
      while (true) {
        int r = a % b;
        if (r == 0) {
          gcd = b;
          break;
        }
        a = b;
        b = r;
      }
      
      System.out.printf("%d %d", numer/gcd, denom/gcd);
    }
}
