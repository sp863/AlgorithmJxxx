package level05;

import java.util.Scanner;

public class problem_05_lcm{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
      long a = sc.nextLong();
      long b = sc.nextLong();
      
      long x = a;
      long y = b;
      long gcd = 0;
      
      while (true) {
        long r = x % y;
        if (r == 0) {
          gcd = y;
          break;
        }
        x = y;
        y = r;
      }
      long lcm = gcd*(a/gcd)*(b/gcd);
      
      System.out.println(lcm);
    }
}
