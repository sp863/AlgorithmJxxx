package level05;

import java.util.Scanner;

public class problem_04_prosjek{
    static int[] arr = new int[50];
    static int n;

    static void getFibo(int x) {
      if (x > n) {
        return;
      } else {
        arr[x] = arr[x-1]+arr[x-2];
        getFibo(x+1);
      }
    }
  
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
      n = sc.nextInt();
      
      arr[0] = 0;
      arr[1] = 1;
      
      getFibo(2);
      
      System.out.println(arr[n]);
    }
}
