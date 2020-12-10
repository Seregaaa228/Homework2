import java.util.Scanner;

public class WordsSum {
    public static void main(String[] args) {

        builderConcatenation();

    }

    public static void concatenation() {
        Scanner wordInput = new Scanner(System.in);


        String word = "";
        while (true) {
            String i = wordInput.nextLine();
            if (i.equals("Стоп")) {
                System.out.println(word.substring(0, word.length() - 2) + ".");
                break;


            }
            word += i + ", ";


        }

    }

    public static void builderConcatenation() {
        Scanner wordInput = new Scanner(System.in);
        StringBuilder word = new StringBuilder("");
        while (true) {
           String i = wordInput.nextLine();
            if (i.equals("Стоп")) {
                System.out.println(word.substring(0, word.length() - 2) + ".");
                break;
            }
            word.append(i).append(", ");

        }
    }
}


