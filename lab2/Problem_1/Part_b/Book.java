package lab2.Problem_1.Part_b;

public class Book extends LibraryItem {
  private int numberOfPages;
  private String isbn;

  public Book(String title, String author, int publicationYear, int numberOfPages, String isbn) {
    super(title, author, publicationYear); 
    this.numberOfPages = numberOfPages; 
    this.isbn = isbn;
  }

  // Specific Getters
  public int getNumberOfPages() {
    return numberOfPages;
  }

  public String getIsbn() {
    return isbn;
  }

  // Specific Setters
  public void setNumberOfPages(int numberOfPages) {
    this.numberOfPages = numberOfPages;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  @Override
  public String toString() {
    return "[Book] " + super.toString() + ", Pages: " + numberOfPages + ", ISBN: " + isbn;
  }
}