package level07;

import java.util.Scanner;

public class problem_02_binary{
    static int n;
    
    static void getBinary(int x) {
      if (x == 0) {
        return;
      } else {
        int r = x % 2;
        getBinary(x/2);
        System.out.print(r);
      }
    }
    
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
      n = sc.nextInt();
      
      getBinary(n);
    }
}
