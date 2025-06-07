public class User {
    String username;
    String email;
    int age;

    User() {
        this.username = "Guest";
        this.email = "Not Given";
        this.age = 0;
    }
    User(String username) {
        this.username = username;
        this.email = "Don't Have";
        this.age = 0;
    }
    User(String username, String email) {
        this.username = username;
        this.email = email;
        this.age = 0;
    }
    User(String username, String email, int age) {
        this.username = username;
        this.email = email;
        this.age = age;
    }
}
