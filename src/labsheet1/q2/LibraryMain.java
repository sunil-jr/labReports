package labsheet1.q2;

public class LibraryMain {
    public static void main(String[] args) {
        DVD dvd = new DVD("Coherence");
        Book book = new Book("Java");
        dvd.checkOUt();
        book.checkOUt();
        dvd.returnItem();
        book.returnItem();
    }
}
