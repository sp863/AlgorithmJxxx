package level07;

import java.util.Scanner;

public class problem_03_mountain{
    static int n;
    
    static void getMount(int x) {
      if (x < 1) {
        return;
      } else {
        getMount(x-1);
        System.out.print(x);
        getMount(x-1);
      }
    }
    
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
      n = sc.nextInt();
      
      getMount(n);
    }
}
