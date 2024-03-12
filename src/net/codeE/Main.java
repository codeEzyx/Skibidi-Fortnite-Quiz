package net.codeE;

import java.util.Scanner;

public class Main {
    static int correctAns;
    static int incorrectAns;
    static int questionCount = 5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Epic Skibidi Fortntie Quiz!1!11!11!");
        System.out.println("\nIf you're ready, press Enter to continue");
        new java.util.Scanner(System.in).nextLine();

        String[] que = new String[questionCount];
        que[0] = "\nWhat POI in Fortnite gives the Aspect of Agility?\nA. The Underworld\nB. Brawler's Battleground\nC. Grim Gate\nD. Mount Olympus";
        que[1] = "What is the name of the fourth Fortnite chapter?\nA. Nexus War\nB. Last Resort\nC. Mega\nD. Wilds";
        que[2] = "How much gold does it cost to buy an attachment?\nA. 100\nB. 50\nC. 60\nD. 75";
        que[3] = "How much V-Bucks does it cost to buy the Star Wand?\nA. 650\nB. 750\nC. 800\nD. 950";
        que[4] = "What is the name of the newest season? \nA. Myths and Greeks\nB. Myths and Mortals\nC. Myths and Immortals\nD. Myths and Gods";

        String[] ans = new String[questionCount];
        ans[0] = "C";
        ans[1] = "B";
        ans[2] = "D";
        ans[3] = "C";
        ans[4] = "B";

        boolean playAgain = true;
        while (playAgain) {
            correctAns = 0;
            incorrectAns = 0;

            for (int i = 0; i < questionCount; i++) {
                System.out.println(que[i]);
                String answer = scanner.nextLine();
                if (answer.equalsIgnoreCase(ans[i])) {
                    AddScoreCorrect();
                    correctPrint();
                } else {
                    AddScoreIncorrect();
                    IncorrectPrint();
                }
            }

            System.out.println("\nYou got " + correctAns + " out of " + questionCount + " correct!\n\nWould you like to play again? (Y/N)");
            String playChoice = scanner.nextLine();
            if (!playChoice.equalsIgnoreCase("Y")) {
                playAgain = false;
                System.out.println("Bye bye!");
                break;
            }
        }
    }

    public static void AddScoreCorrect() {
        correctAns++;
    }

    public static void AddScoreIncorrect() {
        incorrectAns++;
    }

    public static void correctPrint() {
        System.out.println("Correct! So far you have " + correctAns + " correct answer(s) and " + incorrectAns + " incorrect answer(s).\n\nPress Enter to Continue");
        new java.util.Scanner(System.in).nextLine();
    }

    public static void IncorrectPrint() {
        System.out.println("Incorrect. So far you have " + correctAns + " correct answer(s) and " + incorrectAns + " incorrect answer(s).\n\nPress Enter to Continue");
        new java.util.Scanner(System.in).nextLine();
    }
}
