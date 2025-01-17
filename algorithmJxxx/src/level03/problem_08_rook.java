package level03;

import java.util.Scanner;

public class problem_08_rook{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int[][] board = new int[8][8];
    
    int kingY = 0;
    int kingX = 0;
    
    for (int i = 0; i < 8; i++) {
      for (int j = 0; j < 8; j++) {
        board[i][j] = sc.nextInt();
        if (board[i][j] == 1) {
          kingY = i;
          kingX = j;
        }
      }
    }
    
    boolean check = false;
    
    //up
    for (int i = kingY; i >= 0; i--) {
      if(board[i][kingX] == 3) {
        break;
      }
      if (board[i][kingX] == 2) {
        check = true;
      }
    }
    //down
    for (int i = kingY; i < 8; i++) {
      if(board[i][kingX] == 3) {
        break;
      }
      if (board[i][kingX] == 2) {
        check = true;
      }
    }
    //left
    for (int i = kingX; i >= 0; i--) {
      if(board[kingY][i] == 3) {
        break;
      }
      if (board[kingY][i] == 2) {
        check = true;
      }
    }
    //right
    for (int i = kingX; i < 8; i++) {
      if(board[kingY][i] == 3) {
        break;
      }
      if (board[kingY][i] == 2) {
        check = true;
      }
    }
    
    if (check == false) {
      System.out.println(0);
    } else {
      System.out.println(1);
    }
  }    
}