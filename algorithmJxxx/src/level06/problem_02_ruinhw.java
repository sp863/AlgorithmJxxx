package level06;

import java.util.Scanner;

public class problem_02_ruinhw{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
      String x = sc.nextLine();
      
      for (int i = 0; i < x.length(); i++) {
        char y = x.charAt(i);
        if (y == ' ') {
          continue;
        } else {
          System.out.print(y);
        }
      }

    }
}
