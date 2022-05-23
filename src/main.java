public class main {

    public static void main(String[] args) {

        ///////////////////////////
        //  Reserved Keywords
        // https://en.wikipedia.org/wiki/List_of_Java_keywords

        // anything in orange color(depends on ide) is a reserved keyword.
        // int int = 5; // cant do this
        // false, ture, null, are reserved etc...

        ///////////////////////
        // Expressions

        double kilometres = (100 * 1.609344);  // a mile is equal to 1.609344 kilometers
        // the expression is:  kilometres = (100 * 1.609344);

        int highScore = 50;
        // the expressions is: highScore = 50;

        if (highScore == 50) {
            // the expression is: highScore == 50
            System.out.println("This is an expression");
            // the expression is:  "This is an expression"
        }

        ////////////////////
        //  Challenge
        // what are the expressions?

        int score = 100;
        // expression: score = 100;
        if (score > 99) {
            // expression:  score > 99
            System.out.println("You got the high score!");
            // expression: "You got the high score!"
            score = 0;
            // expression: score = 0;
        }


    }

}
