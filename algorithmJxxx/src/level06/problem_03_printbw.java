package level06;

import java.util.Scanner;

public class problem_03_printbw{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
      String x = sc.nextLine();
      
      for (int i = x.length()-1; i >= 0; i--) {
        System.out.print(x.charAt(i));
      }
    }
}
