package level05;

import java.util.Scanner;

public class problem_11_streetree{
    static int findGCD(int x, int y) {
      int a = x;
      int b = y;
      int gcd = 0;
      while (true) {
        int r = a % b;
        if (r == 0) {
          gcd = b;
          break;
        }
        a = b;
        b = r;
      }
      return gcd;
    } 
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
      int n = sc.nextInt();
      int[] arr = new int[100005];
      
      for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
      }
      
      int gcd = 0;
      for (int i = 0; i < n; i++) {
        if (i == 0) gcd = arr[i+1]-arr[i];
        else {
          int diff = arr[i]-arr[i-1];
          gcd = findGCD(gcd, diff);
        }
      }
      
      int total = ((arr[n-1]-arr[0])/gcd)+1;
      int answer = total-n;
      
      System.out.println(answer);
    }
}
