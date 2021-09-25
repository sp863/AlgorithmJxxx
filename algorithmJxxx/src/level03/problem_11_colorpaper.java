package level03;

import java.util.Scanner;

public class problem_11_colorpaper{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
      int n = sc.nextInt();
      
      int[][] arr = new int[105][105];
      
      for (int i = 0; i < n; i++) {
        int y = sc.nextInt();
        int x = sc.nextInt();
        
        int h = sc.nextInt();
        int w = sc.nextInt();
        
        for (int j = y; j < y+h; j++) {
          for (int k = x; k < x+w; k++) {
            arr[j][k] = i+1;
          }
        }
      }
      
      for (int i = 0; i < n; i++) {
        int cnt = 0;
        for (int j = 0; j < 105; j++) {
          for (int k = 0; k < 105; k++) {
            if (arr[j][k] == i+1) {
              cnt++;
            }
          }
        }
        System.out.println(cnt);
      }
    }
}