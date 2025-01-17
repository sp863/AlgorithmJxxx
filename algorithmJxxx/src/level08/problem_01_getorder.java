package level08;

import java.util.Scanner;

public class problem_01_getorder{
    static int n, r;
    static char[] result = new char[15];
    static boolean[] check = new boolean[15];
    static char alpha = 'a';
    
    static void getAlpha (int x) {
      if (x >= r) {
        for (int i = 0; i < r; i++) {
          System.out.print(result[i]);
        }
        System.out.println();
      } else {
        for (int i = 0; i < n; i++) {
          char temp = alpha;
          temp += i;
          result[x] = temp;
          if (check[i] == false) {
            check[i] = true;
            getAlpha(x+1);
            check[i] = false;
          }
        }
      }
    }
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
      n = sc.nextInt();
      r = sc.nextInt();
      
      getAlpha(0);
    }
}
