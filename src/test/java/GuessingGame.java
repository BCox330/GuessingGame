import static org.junit.Assert.*;

import org.junit.Test;

public class GuessingGame {

	@Test
	public void shouldSayWinwhenNumbersMatch() {
		GuessingGame underTest = new GuessingGame();
		String response = underTest.playGame(7);
		assertEquals("You Win!", response);

	}

	@Test
	public void shouldSayYouLosewhenGuessIsSix() {
		GuessingGame underTest = new GuessingGame();
		String response = underTest.playGame(6);
		assertEquals("You Lose!", response);
	}

	@Test
	public void shouldSayYouLosewhenGuessIsFive() {
		GuessingGame underTest = new GuessingGame();
		String response = underTest.playGame(5);
		assertEquals("You Lose!", response);
	}

	@Test
	public void shouldSayTooHighWhenGuessIsAboveSeven() {
		GuessingGame underTest = new GuessingGame();
		String response = underTest.playGame(8);
		assertEquals("You Lose!", response);
}
     // give hint even or odd
     // test a point update for a win
     // test point deduction for a loss
     // test for a loss after 3 tries
     // test for 0 or other invalid responses	