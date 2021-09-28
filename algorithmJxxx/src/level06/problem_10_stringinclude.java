package level06;

import java.util.Scanner;

public class problem_10_stringinclude{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
      String a = sc.next();
      String b = sc.next();
      
      int lenA = a.length();
      int lenB = b.length();
      
      boolean isIncluded = false;
      for (int i = 0; i < lenA; i++) {
        int cnt = 0;
        for (int j = 0; j < lenB; j++) {
          if (i <= lenA-lenB) {
            if (a.charAt(i+j) == b.charAt(j)) {
              cnt++;
            }
          }
        }
        if (cnt == lenB) {
          isIncluded = true;
          break;
        }
      }
      
      if (isIncluded) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }

    }
}