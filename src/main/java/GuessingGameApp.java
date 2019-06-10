import java.util.Scanner;

public class GuessingGameApp {

	public static void main(String[] args) {

		int secretNumber = 7;
		int guess;
		boolean correct = false;

		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome to Guessing Game");
		System.out.print("Guess a number between 1 and 10: ");


		while (!correct) {

		
			guess = keyboard.nextInt();
			if (guess == secretNumber) {
				correct = true;
				System.out.println("You Win");
			}

			else if (guess < secretNumber) {
				System.out.println("Guess Higher");
			}

			else if (guess > secretNumber) {
				System.out.println("Guess Lower");
			}
		}
	}

}
