package level02;

import java.util.Scanner;

public class problem_07_binary{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
      int n = sc.nextInt();
      
      int m = n;
      int[] arr = new int[100000];
      int idx = 0;
            
      while (true) {
        int x = m % 2;
        
        arr[idx++] = x;
        
        m /= 2;
        if (m == 0) break;
      }
      
      for (int i = idx-1; i >= 0; i--) {
        System.out.printf("%d", arr[i]);
      }
      
    }
}
