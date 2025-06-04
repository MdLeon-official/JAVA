public class Main {
    public static void main(String[] arg) {
        //printf{} is a method used to format output
        //%[flags][width][.precision][specifier-character]

        String name = "Monkey";
        char firstLetter = 'M';
        int age = 21;
        double height = 60.5;
        boolean isAlive = true;
        System.out.printf("Hello %s\n", name);
        System.out.printf("Your name starts with a %c", firstLetter);
        System.out.printf("You are %d years old\n", age);
        System.out.printf("You are %f inches tall\n", height);
        System.out.printf("Alive: %b\n", isAlive);
        System.out.printf("%s is %d years old\n\n\n", name,age);


        /*
        [FLAGS]
        + = output a plus
        , = comma grouping separator (thousand, million)
        ( = negative numbers are enclosed in ()
        space = display a minus if negative, space if positive
        */
        double price1 = 9.99;
        double price2 = 100.15;
        double price3 = -54.01;
        double price4 = 10000.323;
        System.out.printf("%+.1f\n",price1);
        System.out.printf("%(.2f\n",price2);
        System.out.printf("%(.3f\n",price3);
        System.out.printf("%,.2f\n",price4); 
        System.out.printf("% .1f\n",price1);
        System.out.printf("% .2f\n",price2);
        System.out.printf("% .3f\n",price3);
        System.out.printf("% .2f\n",price4);


        /*
        [width]
        0 = zero padding
        number = right justified padding
        negative number = left justified padding
        */
        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;
        System.out.printf("%04d\n", id1);
        System.out.printf("%4d\n", id2);
        System.out.printf("%-4d\n", id3);
        System.out.printf("%d\n", id4);
    }
}
