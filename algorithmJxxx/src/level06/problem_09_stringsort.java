package level06;

import java.util.Scanner;
import java.util.Arrays;

public class problem_09_stringsort{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
      int n = sc.nextInt();
      
      String[] arr = new String[105];
      
      for (int i = 0; i < n; i++) {
        arr[i] = sc.next();
      }
      
      Arrays.sort(arr,0,n);
      
      for (int i = 0; i < n; i++) {
        System.out.println(arr[i]);
      }
    }
}