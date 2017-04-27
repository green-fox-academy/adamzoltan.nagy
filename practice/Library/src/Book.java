/**
 * Created by Adam on 2017. 04. 27..
 */
public class Book {
  private String author;
  private String title;
  private int releaseYear;

  public Book(String author, String title, int releaseYear) {
    this.author = author;
    this.title = title;
    this.releaseYear = releaseYear;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public int getReleaseYear() {
    return releaseYear;
  }

  public void setReleaseYear(int releaseYear) {
    this.releaseYear = releaseYear;
  }

  @Override
  public String toString() {
    String bookInfo =(getAuthor() + " : " + getTitle() + " (" +getReleaseYear() + ")");
    return bookInfo;
  }
}
