/**
 * Created by Adam on 2017. 04. 27..
 */
public class Main {
  public static void main(String[] args) {

    BookShelf myShelf = new BookShelf();
    System.out.println(myShelf.toString());

    myShelf.addBook("Douglas Adams", "The Hitchhiker's Guide to the Galaxy", 1979);
    myShelf.addBook("Douglas Adams", "Mostly Harmless", 1992);
    myShelf.addBook("Frank Herbert", "Dune", 1965);
    myShelf.addBook("Frank Herbert", "The Dragon in the Sea", 1957);
    myShelf.removeBook("The Dragon in the Sea");


    System.out.println(myShelf.toString());
  }
}
