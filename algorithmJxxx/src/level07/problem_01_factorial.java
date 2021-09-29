package level07;

import java.util.Scanner;

public class problem_01_factorial{
    static int n;
    
    static int getFact(int x) {
      if (x == 0) {
        return 1;
      } else {
        return x*getFact(x-1);
      }
    }
    
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
      n = sc.nextInt();
      
      System.out.println(getFact(n));

    }
}
