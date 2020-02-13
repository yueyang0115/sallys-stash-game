package edu.duke.ece651.sallysstash;

import java.util.Scanner;

public class Game {
  public static void main(String[] args) {
    System.out.println("This is my main method!\n");
    int id = 0;
    Board board_A = new Board();
    Board board_B = new Board();

    BoardDrawer.drawOne(board_A);
    putStack(2, 'G', id, board_A);
    putStack(3, 'P', id, board_A);
    putStack(3, 'R', id, board_A);
    putStack(2, 'B', id, board_A);
  }

  public static void putStack(int num, char color, int id, Board myboard) {
    int count = 0;
    while (count != num) {
      Scanner input = new Scanner(System.in);
      String myString = input.next();

      InputHandler myhandler = new InputHandler(myString, color, myboard);
      System.out.println("myhandler.getValid=" + myhandler.getValid());
      if (myhandler.getValid() == 1) {
        System.out.println("myhandler.getX=" + myhandler.getCoordinateX());
        System.out.println("myhandler.getY=" + myhandler.getCoordinateY());
        System.out.println("myhandler.getHeight=" + myhandler.getHeight());
        System.out.println("myhandler.getWidth=" + myhandler.getWidth());
        Rectangle stack = new Rectangle(myhandler.getHeight(), myhandler.getWidth(), color, id);
        stack.putonBoard(myhandler.getCoordinateX(), myhandler.getCoordinateY(), myboard);

        BoardDrawer.drawOne(myboard);
        count++;
        id++;
      }
    }
  }
}

/*
  Scanner input = new Scanner(System.in);
  String myString = input.next();
  int x = InputHandler.getCoordinateX(myString);
  int y = InputHandler.getCoordinateY(myString);
  char direc = InputHandler.getDirection(myString);
  System.out.println(x);
  System.out.println(y);
  System.out.println(direc);
  */
