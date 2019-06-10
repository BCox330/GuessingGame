
public class GuessingGame {

	public String playGame(int guessedNumber) {
		int secretNumber = 7;

		if (guessedNumber > secretNumber) {
			return "Too High!";
		} else if (guessedNumber < secretNumber) {
			return "Too Low!";
		} else {
			return "You Win!";
		}

	}

}