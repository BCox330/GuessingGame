
public class GuessingGame {

public String playGame(int guess){
	if (guess > 7){
		return "Too High";
		
	}if (guess < 7){
		return "Too Low";
		 
	}if (guess != 7){
		return "You Lose";
		
	}else {
		return "You Win";}}}
				
			
