package level05;

import java.util.Scanner;

public class problem_08_beehive{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
      int n = sc.nextInt();
      
      if (n == 1) {
        System.out.println(1);
        System.exit(0);
      }
      // 2-7    6
      // 8-19   12
      // 20-37  18
      // 38-61  24
      
      int room = 2;
      int start = 2;
      int end = start+6;
      int inc = 6;
      while (true) {
        if (n >= start && n < end) {
          System.out.println(room);
          break;
        }
        start += inc;
        inc += 6;
        end += inc;
        room++;
      }
    }
}
