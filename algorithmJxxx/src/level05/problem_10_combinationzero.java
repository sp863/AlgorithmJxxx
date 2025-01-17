package level05;

import java.util.Scanner;

public class problem_10_combinationzero{
    static int n, m;
    
    static int getTwo(int x) {
      int cnt = 0;
      for (int i = 2; i <= x; i*=2) {
        cnt += (x/i);
      }
      return cnt;
    }
    
    static int getFive(int x) {
      int cnt = 0;
      for (int i = 5; i <= x; i*=5) {
        cnt += (x/i);
      }
      return cnt;
    }
  
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
      /*
      n!
      m!
      (n-m)!
      */
      
      n = sc.nextInt();
      m = sc.nextInt();
      
      int a = n-m;
      
      int cnt2 = getTwo(n)-(getTwo(m)+getTwo(a));
      int cnt5 = getFive(n)-(getFive(m)+getFive(a));
      
      if (cnt2 < cnt5) {
        System.out.println(cnt2);
      } else {
        System.out.println(cnt5);
      }
    }
}
