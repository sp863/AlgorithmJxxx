package level05;

import java.util.Scanner;

public class problem_02_nextnum{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
      while (true) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        if (a == 0 && b == 0 && c == 0) {
          break;
        }
        
        if (c-b == b-a) {
          System.out.println("AP " + ((c-b)+c));
        } else {
          System.out.println("GP " + c*(c/b));
        }
      }
    }
}
