package proj1sp16;

/**
* <title>Project1App class</title>
* <p> 
* This class runs the app using the BingoBall, BallCage, and BingoCard class methods.
* </p>
* @author Nicholas Tromboukis
*
*/

public class Project1App {
	public static void main(String[] args) {
		
		
		BallCage ballCage = new BallCage();
		
		BingoCard card1 = new BingoCard();
		BingoCard card2 = new BingoCard();
		
		System.out.println("The first card: " + card1.toString());
		System.out.println("Bingo: " + card1.hasBingo());
		
		System.out.println("The second card: " + card2.toString());
		System.out.println("Bingo: " + card2.hasBingo());
		
		System.out.println("Number of balls in ballCage are: " + ballCage.returnNumBalls() + "\n");
		
		boolean bool = true;
		int numRounds = 0;
		while(bool){
			BingoBall ball = ballCage.returnBall();
			
			card1.updateCard(ball);
			card2.updateCard(ball);
			
			System.out.println("The Ball that was chosen is: " + ball.toString());
			System.out.println("Card 1: " + "\n" + card1.toString());
			System.out.println("Bingo: " + card1.hasBingo() + "\n");
			
			System.out.println("Card 2: " + "\n" + card2.toString());
			System.out.println("Bingo: " + card2.hasBingo()  + "\n");
			
			System.out.println("Number of balls in ballCage are: " + ballCage.returnNumBalls() + "\n");
			numRounds++;
			
			if(card1.hasBingo() == true || card2.hasBingo() == true){
				bool = false;
				System.out.println("Number of rounds to bingo: " + numRounds);
				if(card1.hasBingo() == true && card2.hasBingo() == true) {
					System.out.println("It is a draw!");
				} else if(card1.hasBingo() == true){
					System.out.println("The winner is: Player1");
				} else if(card2.hasBingo() == true){
					System.out.println("The winner is: Player 2");
				}
			}
		}
	}
}
