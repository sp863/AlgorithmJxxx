package level08;

import java.util.Scanner;

public class problem_02_tobin{
    static int n, k;
    static int[] result = new int[35];
    static int cnt = 0;
    
    static void getTobin(int x) {
      if (cnt == k) {
        for (int i = 0; i < n; i++) {
          System.out.print(result[i]);
        }
        System.out.println();
        return;
      }
      if (x >= n) {
        return;
      }
      for (int i = 1; i >= 0; i--) {
        result[x] = i;
        if (i == 1) {
          cnt++;
        }
        getTobin(x+1);
        if (i == 1) {
          cnt--;
        }
      }
    }
    
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
      n = sc.nextInt();
      k = sc.nextInt();
      
      getTobin(0);
    }
}
