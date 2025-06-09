public class Main {
    public static void main(String[] args) {
        /*
        Aggregation = Represents a "has-a" relationship between objects.
                      One object contains another object as part of its structure,
                      but the contained object/s can exist independently 
        */

        Book book1 = new Book("1984", 328);
        Book book2 = new Book("To Kill a Mockingbird", 281);
        Book book3 = new Book("The Great Gatsby", 180);

        Book[] books = {book1, book2, book3};

        // for (Book book : books) {
        //     System.out.println(book.displayInfo());
        // }

        Library library = new Library("City Library", 2023, books);
    }
}
