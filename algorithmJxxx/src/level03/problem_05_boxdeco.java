package level03;

import java.util.Scanner;

public class problem_05_boxdeco{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
      int n = sc.nextInt();
      int[] color = new int[1005];
      int[] count = new int[1005];
      
      for (int i = 0; i < n; i++) {
        color[i] = sc.nextInt();
        count[color[i]] += 1;
      }
      
      int cnt = 0;
      
      for (int i = 0; i < 1005; i++) {
        if (count[i] >= 2) {
          cnt += 2;
        } else if (count[i] == 1) {
          cnt += 1;
        }
      }
      
      if (cnt >= 6) {
        System.out.print("YES");
      } else {
        System.out.print("NO");
      }
    }
}
