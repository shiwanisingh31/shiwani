import java.util.Scanner;
import java.util.Random;

public class shiw {
    public static void main(String[] args) {
        String[] rps = {"r", "p", "s"};  // r for Rock, p for Paper, s for Scissors
        String computer = rps[new Random().nextInt(rps.length)];
        Scanner sc = new Scanner(System.in);
        String human;

        while (true) {
            System.out.println("Enter your move (r for Rock, p for Paper, s for Scissors):");
            human = sc.nextLine().trim().toLowerCase();  // Trim spaces and convert input to lowercase
            if (human.equals("r") || human.equals("p") || human.equals("s")) {
                break;
            }
            System.out.println(human + " is an invalid input. Please enter r, p, or s.");
        }

        System.out.println("Computer played: " + computer);

        if (human.equals(computer)) {
            System.out.println("Match draw!");
        } else if (human.equals("r")) {
            if (computer.equals("p")) {
                System.out.println("You lose! Paper covers Rock.");
            } else {
                System.out.println("You win! Rock breaks Scissors.");
            }
        } else if (human.equals("p")) {
            if (computer.equals("s")) {
                System.out.println("You lose! Scissors cut Paper.");
            } else {
                System.out.println("You win! Paper covers Rock.");
            }
        } else if (human.equals("s")) {
            if (computer.equals("r")) {
                System.out.println("You lose! Rock breaks Scissors.");
            } else {
                System.out.println("You win! Scissors cut Paper.");
            }
        }
    }
}
