import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Adam on 2017. 04. 27..
 */
public class BookShelf {
  private List<Book> bookshelf;

  public BookShelf() {
    this.bookshelf = new ArrayList<>();
  }

  public void addBook(String author, String title, int year ) {
    Book book = new Book(author, title, year);
    bookshelf.add(book);
  }

  public void removeBook(String title) {
    for (int i = 0; i < bookshelf.size(); i++) {
      if (bookshelf.get(i).getTitle().equals(title)) {
        bookshelf.remove(i);
      }
    }
  }

  public int earliestBook() {
    int min = bookshelf.get(0).getReleaseYear();
    int bookNumber = 0;
    for (int i = 0; i < bookshelf.size(); i++) {
      if (bookshelf.get(i).getReleaseYear() < min) {
        min = bookshelf.get(i).getReleaseYear();
        bookNumber = i;
      }
    }
    return bookNumber;
  }

  public int latestBook() {
    int max = bookshelf.get(0).getReleaseYear();
    int bookNumber = 0;
    for (int i = 0; i < bookshelf.size(); i++) {
      if (bookshelf.get(i).getReleaseYear() > max) {
        max = bookshelf.get(i).getReleaseYear();
        bookNumber = i;
      }
    }
    return bookNumber;
  }

  

  public String toString() {
    String info = ("You have " + bookshelf.size() + " books.\n" +
            "Earliest released: " + bookshelf.get(earliestBook())+"\n" +
            "Latest released: " + bookshelf.get(latestBook())+"\n" +
            "Favourite author: " );

    return info;
  }

}
