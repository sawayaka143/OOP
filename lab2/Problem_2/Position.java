package lab2.Problem_2;

public class Position {
  public enum Color {
    WHITE, BLACK 
  }

  // I'll be using algebraic notation.
  // So, the moves will look like this:
  // e4, e5, d4
  public final int row;
  public final int col;
  public Color color;

  public Position(int row, int col, Color color) {
    // Instead of writing a funciton to check if the move is valid
    // I decided to just verify it in the constructor.
    if (row < 1 || row > 8 || col < 1 || col > 1) {
      throw new IllegalArgumentException("Position out of range.");
    }
    this.row = row;
    this.col = col;
    this.color = color;
  }


}