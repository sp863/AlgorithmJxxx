package level03;

import java.util.Scanner;

public class problem_06_gcdlcm{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
      int a = sc.nextInt();
      int b = sc.nextInt();
      
      int x = a;
      int y = b;
      
      int gcd = 0;
      
      while (true) {
        int r = x % y;
        if (r == 0) {
          gcd = y;
          break;
        }
        x = y;
        y = r;
      }
      
      int lcm = gcd * (a/gcd) * (b/gcd);
      
      System.out.printf("%d\n%d", gcd, lcm);
    }
}