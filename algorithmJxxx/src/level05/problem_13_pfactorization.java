package level05;

import java.util.Scanner;

public class problem_13_pfactorization{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
      int n = sc.nextInt();
      
      int x = n;
      
      int divv = 2;
      while (true) {
        
        if (x % divv == 0) {
          System.out.println(divv);
          x /= divv;
        } else {
          divv++;
        }
        if (x == 1) break;
      }
    }
}
