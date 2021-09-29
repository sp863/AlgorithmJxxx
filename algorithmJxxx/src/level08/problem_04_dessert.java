package level08;

import java.util.Scanner;

public class problem_04_dessert{
    static int n;
    static int[] result = new int[25];
    static int cnt = 0;
    
    static void getDiv(int x, int sum) {
      if (sum >= n) {
        System.out.print(result[0]);
        for (int i = 1; i < x; i++) {
          System.out.print("+" + result[i]);
        }
        System.out.println();
        cnt++;
        return;
      } else {
        int a;
        if (x == 0) a = n-1;
        else a = n - sum;
        for (int i = a; i >= 1; i--) {
          result[x] = i;
          if (x > 0 && result[x-1] < result[x]) continue;
          getDiv(x+1, sum+i);
        }
      }
    }
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
      n = sc.nextInt();
      
      getDiv(0, 0);
      System.out.println(cnt);
    }
}
