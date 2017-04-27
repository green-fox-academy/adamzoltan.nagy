import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adam on 2017. 04. 27..
 */
public class BookShelf {
  private List<Book> bookshelf;

  public BookShelf() {
    List<Book> bookshelf = new ArrayList<>();
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
  
}
