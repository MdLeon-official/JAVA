public class Book {

    String title;
    int pages;

    Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }
    String displayInfo() {
        return "Title: " + title + ", Pages: " + pages;
    }
}
