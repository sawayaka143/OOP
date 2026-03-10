package lab2.Problem_1.Part_b;

public class Test {
  public static void main(String[] args) {
    Book textbook = new Book(
        "Some kind of name of the Book",
        "Some Kind of Author",
        1967,
        667,
        "some-kind-of-code");

    System.out.println(textbook.toString());
  }
}