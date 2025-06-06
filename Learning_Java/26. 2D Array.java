public class Main {
    public static void main(String[] args) {
        // 2D array = An array where each element is an array
        //          Useful for storing a matrix of data

        // String[] fruits = {"Mango", "Apple", "Banana"};
        // String[] vegetables = {"Potato", "Onions", "Carrot"};
        // String[] meats = {"Chicken", "Beef", "Fist", "Mutton"};

        // String[][] groceries = {{"Mango", "Apple", "Banana"}, 
        //                     {"Potato", "Onions", "Carrot"},
        //                     {"Chicken", "Beef", "Fist", "Mutton"}};

        // groceries[0][1] = "pineapple";

        // for(String[] foods : groceries) {
        //     for(String food : foods) {
        //         System.out.print(food + " ");
        //     }
        //     System.out.println();
        // }



        char[][] telephone ={{'1','2','3'},
                             {'4','5','6'},
                             {'7','8','9'},
                             {'*','0','#'}};

        for(char[] row : telephone) {
            for(char number : row){
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
