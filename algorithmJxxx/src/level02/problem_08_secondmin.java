package level02;

import java.util.Scanner;
import java.util.Arrays;

public class problem_08_secondmin{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
      int[] arr = new int[9];
      int[] temp = new int[9];
      
      for (int i = 0; i < 9; i++) {
        arr[i] = sc.nextInt();
        temp[i] = arr[i];
      }
      
      Arrays.sort(temp, 0, 9);
      
      int secMin = temp[1];
      
      int answer = 0;
      for (int i = 0; i < 9; i++) {
        if (arr[i] == secMin) {
          answer = i+1;
        }
      }
      
      System.out.println(secMin);
      System.out.println(answer);

    }
}
