package level06;

import java.util.Scanner;

public class problem_07_bignumsubtraction{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
      String a = sc.next();
      String b = sc.next();
      
      int lenA = a.length();
      int lenB = b.length();
      
      int[] A = new int[105];
      int[] B = new int[105];
      int[] big = new int[105];
      int[] small = new int[105];
      boolean isNegative = false;
      
      int[] result = new int[105];
      
      int k = 0;
      for (int i = 105-lenA; i < 105; i++) {
        char y = a.charAt(k);
        A[i] = Integer.parseInt(String.valueOf(y));
        k++;
      }
      k = 0;
      for (int i = 105-lenB; i < 105; i++) {
        char y = b.charAt(k);
        B[i] = Integer.parseInt(String.valueOf(y));
        k++;
      }
      
      int size = 0;
      if (lenA > lenB) {
        size = 1;
      } else if (lenA < lenB) {
        size = -1;
      } else {
        for (int i = 0; i < 105; i++) {
          if (A[i] > B[i]) {
            size = 1;
            break;
          } else if (A[i] < B[i]) {
            size = -1;
            break;
          }
        }
      }
      
      if (size == 1) {
        for (int i = 0; i < 105; i++) {
          big[i] = A[i];
          small[i] = B[i];
        }
        lenA = a.length();
        lenB = b.length();
      } else if (size == -1) {
        for (int i = 0; i < 105; i++) {
          big[i] = B[i];
          small[i] = A[i];
        }
        lenA = b.length();
        lenB = a.length();
        isNegative = true;
      } else {
        System.out.println(0);
        System.exit(0);
      }
      
      //calculation
      for (int i = 105-1; i >= 0; i--) {
        if (big[i] >= small[i]) {
          result[i] = big[i]-small[i];
        } else {
          big[i-1] -= 1;
          result[i] = big[i]+10-small[i];
        }
      }
      
      if (isNegative == true) {
        System.out.print("-");
      }
      for (int i = 0; i < 105; i++) {
        if (result[i] != 0) {
          for (int j = i; j < 105; j++) {
            System.out.print(result[j]);
          }
          break;
        }
      }
    }
}
