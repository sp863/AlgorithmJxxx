package level02;

import java.util.Scanner;

public class problem_11_dicegame{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
      int n = sc.nextInt();
      int[][] arr = new int[n][3];
      
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < 3; j++) {
          arr[i][j] = sc.nextInt();
        }
      }
      
      int maxPrize = 0;
      
      for (int i = 0; i < n; i++) {
        int a = arr[i][0];
        int b = arr[i][1];
        int c = arr[i][2];
        
        int prize = 0;

        if (a == b && b == c) {
          prize = 10000 + (1000*a);
        } else if (a == b && b != c) {
          prize = 1000 + (100*a);
        } else if (a == c && c != b) {
          prize = 1000 + (100*a);
        } else if (b == c && c != a) {
          prize = 1000 + (100*b);
        } else if (a != b && b != c && a != c) {
          if (a > b && a > c) {
            prize = 100 * a;
          } else if (b > a && b > c) {
            prize = 100 * b;
          } else if (c > a && c > b) {
            prize = 100 * c;
          }
        }
        
        if (prize > maxPrize) {
          maxPrize = prize;
        }
      }
      
      System.out.println(maxPrize);
    }
}
