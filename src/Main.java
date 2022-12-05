import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class Main {
    private static int count = 0;

    public static void main(String[] args) throws IOException {

        List<String> listOfStrings = new ArrayList<String>();
        Scanner sc = new Scanner(new FileReader("words.txt")).useDelimiter(",\\s*");
        String str;

        while (sc.hasNext()) {
            str = sc.next();
            listOfStrings.add(str);
        }

        String[] wordList = listOfStrings.toArray(new String[0]);
        String[] splitList = wordList[0].split("\n");

        Random r = new Random();
        int rand = r.nextInt(splitList.length);
        String word = splitList[rand];


        Scanner sca = new Scanner(System.in);
        String asterisk = new String(new char[word.length()]).replace("\0", "*");

        while (count < 6 && asterisk.contains("*")) {
            System.out.println("Guess any letter in the word");
            System.out.println(asterisk);
            String guess = sca.next();

            String newAsterisk = "";
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == guess.charAt(0)) {
                    newAsterisk += guess.charAt(0);
                } else if (asterisk.charAt(i) != '*') {
                    newAsterisk += word.charAt(i);
                } else {
                    newAsterisk += "*";
                }
            }

            if (asterisk.equals(newAsterisk)) {
                count++;
                if (count == 1) {
                    System.out.println("Wrong guess, try again");
                    System.out.println("   |");
                    System.out.println("   |");
                    System.out.println("   |");
                    System.out.println("   |");
                    System.out.println("   |");
                    System.out.println("   |");
                    System.out.println("   |");
                    System.out.println("___|___");
                }
                if (count == 2) {
                    System.out.println("Wrong guess, try again");
                    System.out.println("   ____________");
                    System.out.println("   |");
                    System.out.println("   |");
                    System.out.println("   |");
                    System.out.println("   |");
                    System.out.println("   |");
                    System.out.println("   |");
                    System.out.println("   | ");
                    System.out.println("___|___");
                }
                if (count == 3) {
                    System.out.println("Wrong guess, try again");
                    System.out.println("   ____________");
                    System.out.println("   |          _|_");
                    System.out.println("   |        /     \\");
                    System.out.println("   |        |     |");
                    System.out.println("   |         \\_ _/");
                    System.out.println("   |");
                    System.out.println("   |");
                    System.out.println("   |");
                    System.out.println("___|___");
                }
                if (count == 4) {
                    System.out.println("Wrong guess, try again");
                    System.out.println("   ____________");
                    System.out.println("   |          _|_");
                    System.out.println("   |        /     \\");
                    System.out.println("   |        |     |");
                    System.out.println("   |         \\_ _/");
                    System.out.println("   |           |");
                    System.out.println("   |           |");
                    System.out.println("   |           |");
                    System.out.println("   |           |");
                    System.out.println("   | ");
                    System.out.println("___|___");
                }
                if (count == 5) {
                    System.out.println("Wrong guess, try again");
                    System.out.println("   ____________");
                    System.out.println("   |          _|_");
                    System.out.println("   |        /     \\");
                    System.out.println("   |        |     |");
                    System.out.println("   |         \\_ _/");
                    System.out.println("   |           |");
                    System.out.println("   |           |");
                    System.out.println("   |           |");
                    System.out.println("   |           |");
                    System.out.println("   |          / \\ ");
                    System.out.println("   |         /   \\");
                    System.out.println("___|___     /     \\");
                }
                if (count == 6) {
                    System.out.println("GAME OVER!");
                    System.out.println("   ____________");
                    System.out.println("   |          _|_");
                    System.out.println("   |        /     \\");
                    System.out.println("   |        |     |");
                    System.out.println("   |         \\_ _/");
                    System.out.println("   |          /|\\");
                    System.out.println("   |         / | \\");
                    System.out.println("   |        /  |  \\");
                    System.out.println("   |           |   \\");
                    System.out.println("   |          / \\ ");
                    System.out.println("   |         /   \\");
                    System.out.println("___|___     /     \\");
                    System.out.println("GAME OVER! The word was " + word);
                }
            } else {
                asterisk = newAsterisk;
            }
            if (asterisk.equals(word)) {
                System.out.println("Correct! You win! The word was " + word);
                sca.close();
            }
        }
    }

}


