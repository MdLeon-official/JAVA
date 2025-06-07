public class Main {
    public static void main(String[] args) {
        /*
        static = Makes a variable or method belong to the class
                 rather than to any specific object.
                 Commonly user for utility methods or shared resources
        */

        Friend friend1 = new Friend("Luffy");
        Friend friend2 = new Friend("Zoro");
        Friend friend3 = new Friend("Sanji");
        Friend friend4 = new Friend("Nami");
        Friend friend5 = new Friend("Usopp");

        // System.out.println(friend1.numOfFriends);
        // System.out.println(friend2.numOfFriends);
        // System.out.println(friend3.numOfFriends);

        // System.out.println(Friend.numOfFriends);

        Friend.showFriends();
    }
}
