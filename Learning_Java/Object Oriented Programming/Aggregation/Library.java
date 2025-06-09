public class Library {
    String name;
    Book[] books;

    Library(String name, int year, Book[] books){
        this.name = name;
        this.year = year;
        this.books = books;
    }
    void displayInfo() {
        System.out.println("Library Name: " + name);
        System.out.println("Books in the library:");
        for (Book book : books) {
            System.out.println(book.displayInfo());
        }
    }
}
