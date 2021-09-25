package level04;

import java.util.Scanner;

public class problem_03_baseballgame{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
      int n = sc.nextInt();
      int[][] arr = new int[105][3];
      
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < 3; j++) {
          arr[i][j] = sc.nextInt();
        }
      }
      
      int count = 0;
      
      for (int i = 1; i <= 9; i++) {
        for (int j = 1; j <= 9; j++) {
          for (int k = 1; k <= 9; k++) {
            if (i != j && j != k && i != k) {
              
              int cnt = 0;
              
              for (int x = 0; x < n; x++) {
                int hund = arr[x][0]/100;
                int ten = arr[x][0]%100/10;
                int one = arr[x][0]%10;
                
                int strike = arr[x][1];
                int ball = arr[x][2];
                
                int s = 0;
                int b = 0;
                
                if (hund == i) s++;
                if (ten == j) s++;
                if (one == k) s++;
                
                if (hund == j || hund == k) b++;
                if (ten == i || ten == k) b++;
                if (one == i || one == j) b++;
                
                if (b == ball && s == strike) {
                  cnt++;
                }
              }
              if (cnt == n) {
                count++;
              }
            }
          }
        }
      }
      System.out.println(count);
    }
}