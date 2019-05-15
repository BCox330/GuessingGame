import java.util.Scanner;

public class GuessingGameApp {

	public static void main(String[] args) {
		Scanner keyboardInput = new Scanner(System.in);
		
		int secretNumber = 7;
		String guess = "";
		int guessCount = 0;
		int guessLimit = 3;
		boolean outOfGuesses = false;
		
		
		while(!guess.equals(secretNumber) && !outOfGuesses) {
			if(guessCount < guessLimit){
				System.out.print("Guess a Number 1 through 10: ");
				guess = keyboardInput.nextLine();
				guessCount++;
			}else {
				outOfGuesses = true;
				}
			
		}
		if(outOfGuesses){
			System.out.println("You Lose");
		}else {
			System.out.println("You Win");
		}
		
	}
}
	


