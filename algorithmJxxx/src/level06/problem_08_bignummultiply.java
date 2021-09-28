package level06;

import java.util.Scanner;

public class problem_08_bignummultiply{
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
      int[] result = new int[210];
      
      int[][] multi = new int[210][210];
      
      int k = 0;
      for (int i = 105-lenA; i < 105; i++) {
        char x = a.charAt(k);
        A[i] = Integer.parseInt(String.valueOf(x));
        k++;
      }
      k = 0;
      for (int i = 105-lenB; i < 105; i++) {
        char x = b.charAt(k);
        B[i] = Integer.parseInt(String.valueOf(x));
        k++;
      }
      
      if (lenA >= lenB) {
        for (int i = 0; i < 105; i++) {
          big[i] = A[i];
          small[i] = B[i];
        }
        lenA = a.length();
        lenB = b.length();
      } else if (lenA < lenB) {
        for (int i = 0; i < 105; i++) {
          big[i] = B[i];
          small[i] = A[i];
        }
        lenA = b.length();
        lenB = a.length();
      }
      
      int idxY = 0;
      int idxX = 210-1;
      for (int i = 105-1; i >= 0; i--) {
        int[] temp = new int[105];
        for (int j = 105-1; j >= 0; j--) {
          int times = big[j]*small[i];
          if (times > 9) {
            temp[j-1] += (times/10);
            temp[j] += (times%10);
            if (temp[j] > 9) {
              temp[j-1] += (temp[j]/10);
              temp[j] = temp[j]%10;
            }
          } else {
            temp[j] += times;
            if (temp[j] > 9) {
              temp[j-1] += (temp[j]/10);
              temp[j] = temp[j]%10;
            }
          }
        }
        int idxX2 = idxX;
        for (int j = 105-1; j >= 0; j--) {
          multi[idxY][idxX2] = temp[j];
          idxX2--;
        }
        idxY++;
        idxX--;
      }
      
      for (int i = 210-1; i >= 0; i--) {
        int sum = 0;
        for (int j = 0; j < 210; j++) {
          sum += multi[j][i];
        }
        if (sum > 9) {
          result[i] = sum%10;
          multi[0][i-1] += sum/10;
        } else {
          result[i] = sum;
        }
      }
      
      for (int i = 0; i < 210; i++) {
        if (result[i] != 0) {
          for (int j = i; j < 210; j++) {
            System.out.print(result[j]);
          }
          break;
        }
      }
    }
}
