package level05;

import java.util.Scanner;

public class problem_12_fmttalpha{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
      int x = sc.nextInt();
      int y = sc.nextInt();
      
      int dist = y-x;
      
      if (dist == 1) {
        System.out.println(1);
        System.exit(0);
      }
      
      int move = 2;
      int moveMax = 2;
      int a = 0;
      int inc = 2;
      while (true) {
        if (dist <= moveMax) {
          System.out.println(move);
          break;
        }
        a++;
        moveMax += inc;
        if (a == 2) {
          inc += 1;
          a = 0;
        }
        move++;
      }
    }
}
