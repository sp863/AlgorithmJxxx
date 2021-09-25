package level05;

import java.util.Scanner;
import java.util.Arrays;

public class problem_01_kth{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
      int n = sc.nextInt();
      int k = sc.nextInt();
      int[] arr = new int[100005];
      
      for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
      }
      
      Arrays.sort(arr, 0, n);
      
      System.out.println(arr[n-k]);
    }
}
