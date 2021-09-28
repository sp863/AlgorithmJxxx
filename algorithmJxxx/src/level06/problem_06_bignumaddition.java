package level06;

import java.util.Scanner;

public class problem_06_bignumaddition{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
      String a = sc.next();
      String b = sc.next();
      
      int[] A = new int[105];
      int[] B = new int[105];
      int[] result = new int[105];
      
      //A
      int k = 0;
      for (int i = 105-a.length(); i < 105; i++) {
        char x = a.charAt(k);
        A[i] = Integer.parseInt(String.valueOf(x));
        k++;
      }
      //B
      k = 0;
      for (int i = 105-b.length(); i < 105; i++) {
        char x = b.charAt(k);
        B[i] = Integer.parseInt(String.valueOf(x));
        k++;
      }
      
      //calculation
      for (int i = 105-1; i >= 0; i--) {
        int sum = A[i]+B[i];
        if (sum > 9) {
          A[i-1] += 1;
          result[i] = sum%10;
        } else {
          result[i] = sum;
        }
      }
      
      //show
      for (int i = 0; i < 105; i++) {
        if (result[i] != 0) {
          for (int j = i; j < 105; j++) {
            System.out.printf("%d", result[j]);
          }
          break;
        }
      }
    }
}
