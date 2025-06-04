public class Main {
    public static void main(String[] arg) {
        String name = "One Piece";

        int length = name.length();
        char letter = name.charAt(0);
        int index = name.indexOf(" ");
        int lastIndex = name.lastIndexOf("i");
        String nameAgain = "       ONe Piece    ";


        System.out.println(length);
        System.out.println(letter);
        System.out.println(index);
        System.out.println(lastIndex);
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(nameAgain.trim());
        System.out.println(name.isEmpty());

        nameAgain = nameAgain.replace("N", "n");
        System.out.println(nameAgain);

        /*
        if(name.contains(" ") ) {
            System.out.println("Contains space");
        }else {
            System.out.println("Doesn't contains space");
        }
        */

        /*
        if(name.equals(nameAgain)) {
            System.out.println("Matched");
        }
        else {
            System.out.println("Doesn't Matched");
        }
        */
    }
}
