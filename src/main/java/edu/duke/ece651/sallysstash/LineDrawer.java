package edu.duke.ece651.sallysstash;

public class LineDrawer {
  private Board board;

  public LineDrawer(Board myboard) {
    this.board = myboard;
  }

  public void toSelf(int line) {
    for (int i = 0; i < board.getWidth(); i++) {
      Pixel mypixel = board.getPixel(line, i);
      char mychar = ' ';
      if (mypixel.getOccupied() == 1 && mypixel.getHitted() == 1) {
        mychar = '*';
      } else {
        mychar = mypixel.getColor();
      }
      System.out.print(mychar);
      System.out.print('|');
    }
  }

  public void toOther(int line) {
    for (int i = 0; i < board.getWidth(); i++) {
      Pixel mypixel = board.getPixel(line, i);
      char mychar = ' ';
      if (mypixel.getOccupied() == 1 && mypixel.getMissed() == 1) {
        mychar = 'X';
      }
      if (mypixel.getOccupied() == 1 && mypixel.getHitted() == 1) {
        mychar = mypixel.getColor();
      }

      System.out.print(mychar);
      System.out.print('|');
    }
  }
}
