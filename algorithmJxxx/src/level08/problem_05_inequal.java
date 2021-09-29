package level08;

import java.util.Scanner;

public class problem_05_inequal{
    static int n;
    static boolean[] checkA = new boolean[10];
    static boolean[] checkB = new boolean[10];
    static int[] resultA = new int[15];
    static int[] resultB = new int[15];
    static char[] comp = new char[15];
    static boolean printA = false;
    static boolean printB = false;
    
    static void getBig(int x) {
      if (x > n) {
        if (printA == false) {
          for (int i = 0; i <= n; i++) {
            System.out.print(resultA[i]);
          }
          printA = true;
        }
      } else {
        for (int i = 9; i >= 0; i--) {
          resultA[x] = i;
          if (checkA[i] == false) {
            boolean check = false;
            if (x < 1) {
              check = true;
            } else {
              if (comp[x-1] == '<') {
                if (resultA[x-1] < resultA[x]) {
                  check = true;
                }
              } else {
                if (resultA[x-1] > resultA[x]) {
                  check = true;
                }
              }
            }
            if (check == true) {
              checkA[i] = true;
              getBig(x+1);
              checkA[i] = false;
            }
          }
        }
      }
    }
    static void getSmall(int x) {
      if (x > n) {
        if (printB == false) {
          for (int i = 0; i <= n; i++) {
            System.out.print(resultB[i]);
          }
          printB = true;
        }
      } else {
        for (int i = 0; i <= 9; i++) {
          resultB[x] = i;
          if (checkB[i] == false) {
            boolean check = false;
            if (x < 1) {
              check = true;
            } else {
              if (comp[x-1] == '<') {
                if (resultB[x-1] < resultB[x]) {
                  check = true;
                }
              } else {
                if (resultB[x-1] > resultB[x]) {
                  check = true;
                }
              }
            }
            if (check == true) {
              checkB[i] = true;
              getSmall(x+1);
              checkB[i] = false;
            }
          }
        }
      }
    }
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
      n = sc.nextInt();
      for (int i = 0; i < n; i++) {
        comp[i] = sc.next().charAt(0);
      }
      
      getBig(0);
      System.out.println();
      getSmall(0);
    }
}