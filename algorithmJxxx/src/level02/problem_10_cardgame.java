package level02;

import java.util.Scanner;

public class problem_10_cardgame{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
      int[] A = new int[10];
      int[] B = new int[10];
      
      int scoreA = 0;
      int scoreB = 0;
      
      for (int i = 0; i < 10; i++) {
        A[i] = sc.nextInt();
      }
      for (int i = 0; i < 10; i++) {
        B[i] = sc.nextInt();
      }
      
      for (int i = 0; i < 10; i++) {
        if (A[i] > B[i]) {
          scoreA += 1;
        } else if (B[i] > A[i]) {
          scoreB += 1;
        }
      }
      
      if (scoreA > scoreB) {
        System.out.println("A");
      } else if (scoreB > scoreA) {
        System.out.println("B");
      } else {
        System.out.println("D");
      }
      
    }
}
