package level06;

import java.util.Scanner;
import java.lang.Character;

public class problem_01_changecapital{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
      String x = sc.nextLine();
      
      for (int i = 0; i < x.length(); i++) {
        char y = x.charAt(i);
        if (Character.isLowerCase(y)) {
          System.out.print(Character.toUpperCase(y));
        } else if (Character.isUpperCase(y)) {
          System.out.print(Character.toLowerCase(y));
        } else {
          System.out.print(y);
        }
      }
    }
}
