package level06;

import java.util.Scanner;

public class problem_04_palindrome{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
      String x = sc.next();
      
      int cnt = 0;
      int k = x.length()-1;
      for (int i = 0; i < x.length(); i++) {
        char a = x.charAt(i);
        char b = x.charAt(k);
        if (a == b) {
          cnt++;
        }
        k--;
      }
      if (cnt == x.length()) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }
}
