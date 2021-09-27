package level05;

import java.util.Scanner;

public class problem_14_chebyshevtheo{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
      int[] arr = new int[250005];
      
      for (int i = 1; i <= 250000; i++) {
        arr[i] = i;
      }
      
      for (int i = 2; i <= 250000; i++) {
        if (arr[i] == 0) continue;
        for (int j = i+i; j <= 250000; j+=i) {
          arr[j] = 0;
        }
      }
      
      while (true) {
        int n = sc.nextInt();
        
        if (n == 0) break;
        
        int nTwo = 2*n;
        
        int cnt = 0;
        for (int i = n+1; i <= nTwo; i++) {
          if (arr[i] != 0) {
            cnt++;
          }
        }
        System.out.println(cnt);
      }
    }
}
