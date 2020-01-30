package examples.games;

import java.util.Scanner;

public class Craps {
    // Throws two dice. Users wins if they guess the
// sum. User’s guess is given as integer argument
    public static void main(String[] args) {
    System.out.println(
        "Throws two dice. Users wins if they guess the sum. User’s guess is given as integer argument ");

        // enter the guess
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your guess: ");
        byte guess = scan.nextByte();

        // build the dices
        Dice d1 = new Dice();
        Dice d2 = new Dice();
        System.out.println("Rolling...");
        d1.roll();
        d2.roll();
        System.out.println("Rolled: " + d1.getTop() + " and " + d2.getTop());
        if (d1.getTop() + d2.getTop() != guess) {
            System.out.println("Tough luck!");
        } else {
            System.out.println("You win");
        }
    }
}