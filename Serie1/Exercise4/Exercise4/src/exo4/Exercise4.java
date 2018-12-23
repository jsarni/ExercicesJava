package exo4;

public class Exercise4 {
    public static void main(String[] args){
        String theAlphabet = args[0];
        String theString = args[1];
        if(!isCorrect(theAlphabet, theString)){
            System.out.println("Error ! a letter is used in your string is unknown in the alphabet");
        } else {
            System.out.println("OK !");
        }

        rotateToLeft(3,theString);
        System.out.println(theString);

        rotateToRight(3, theString);
        System.out.println(theString);



    }

    private static boolean isCorrect(String alphabet, String stringToTest){
        for(int i = 0; i < stringToTest.length(); i++){
            if(alphabet.indexOf(i) == -1){
                return false;
            }
        }
        return true;
    }

    private static void rotateToLeft(int nbChar, String theString){
        for(int i = 0; i < nbChar; i++) {
            theString = (theString.substring(1)).concat(theString.substring(0, 1));
        }
    }

    private static void rotateToRight(int nbChar, String theString){
        for(int i = 0; i < nbChar; i++) {
            theString = (theString.substring(theString.length() - 1)).concat(theString.substring(0, theString.length()-2));
        }
    }
}
