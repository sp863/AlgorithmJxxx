package level04;

import java.util.Scanner;

public class problem_01_bingo{
    static int[][] table = new int[5][5];
    static int[] call = new int[30];
    static boolean[][] check = new boolean[5][5];
    
    static void checkNum(int x) {
      for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 5; j++) {
          if (table[i][j] == x) {
            check[i][j] = true;
          }
        }
      }
    }
    
    static boolean checkBingo() {
      int bingoCnt = 0;
      //hor
      for (int i = 0; i < 5; i++) {
        int cnt = 0;
        for (int j = 0; j < 5; j++) {
          if (check[i][j]) {
            cnt++;
          }
        }
        if (cnt == 5) {
          bingoCnt++;
        }
        if (bingoCnt == 3) {
          return true;
        }
      }
      //verti
      for (int i = 0; i < 5; i++) {
        int cnt = 0;
        for (int j = 0; j < 5; j++) {
          if (check[j][i]) {
            cnt++;
          }
        }
        if (cnt == 5) {
          bingoCnt++;
        }
        if (bingoCnt == 3) {
          return true;
        }
      }
      //right Diagonal
      int k = 0;
      int cntR = 0;
      for (int i = 0; i < 5; i++) {
        if (check[i][k]) {
          cntR++;
        }
        k++;
      }
      if (cntR == 5) {
        bingoCnt++;
      }
      if (bingoCnt == 3) {
        return true;
      }
      //left Diagonal
      k = 5-1;
      int cntL = 0;
      for (int i = 0; i < 5; i++) {
        if (check[i][k]) {
          cntL++;
        }
        k--;
      }
      if (cntL == 5) {
        bingoCnt++;
      }
      if (bingoCnt == 3) {
        return true;
      }
      
      return false;
    }
    
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
      for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 5; j++) {
          table[i][j] = sc.nextInt();
        }
      }
      
      for (int i = 1; i <= 25; i++) {
        call[i] = sc.nextInt();
      }
      
      for (int i = 1; i <= 25; i++) {
        int x = call[i];
        
        checkNum(x);
        
        if (checkBingo()) {
          System.out.println(i);
          break;
        }
      }
    }
}
