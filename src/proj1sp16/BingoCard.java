package proj1sp16;
import java.util.Random;

/**
 * <p>Title: BingoCard class</p>
 * 
 * @author Nicholas Tromboukis
 */

public class BingoCard {
	private int[][] bingoCard;
	private boolean[][] taken;
	
	public BingoCard() {
		bingoCard = new int[5][5];
		taken = new boolean [5][5];
		
		Random randomGenerator = new Random();
		boolean bool = true;
		int randBall = 0;
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				while(bool==true){
					randBall = randomGenerator.nextInt(15) + (15*(i));
						if (randBall != bingoCard[0][i] && randBall != bingoCard[1][i]
								&& randBall != bingoCard[2][i] && randBall != bingoCard[3][i]
								&& randBall != bingoCard[4][i]){
							bool = false;
						}
					}
				bingoCard[j][i] = randBall;
				taken[j][i] = false;
				bool = true;
			}
		}
		taken[2][2] = true; // free bingo spot
	}
	
	/*
	 *updateCard class
	 *@param BingoBall object
	 *Updates the 2D array with the BingoBall object passed as the argument
	 */
	public void updateCard(BingoBall ball){
		for(int i=0; i<5; i++) {
			for(int j=0;j<5;j++) {
				if(ball.getValue() == bingoCard[j][i]){
					taken[j][i] = true;
				}
			}
		}
	}
	
	/*
	 * hasBingo method
	 * @returns boolean
	 * Checks to see if the 
	 */
	public boolean hasBingo(){
		boolean bool = false;
		int bingo = 0;
		for(int i=0; i<5; i++){
			if(taken[i][0]==true&&taken[i][1]==true&&taken[i][2]==true
					&&taken[i][3]==true&&taken[i][4]==true){
				bool = true;
			}else if(taken[0][i]==true&&taken[1][i]==true&&taken[2][i]==true
					&&taken[3][i]==true&&taken[4][i]==true) {
				bool = true;
			}
			else if(taken[i][i]==true){
				bingo++;
				if(bingo==5){
					bool = true;
				}
			}
		}
		return bool;
	}
	
	/*
	 * getBoolArray method
	 * @returns String object of taken Array
	 */
	public String getBoolArray(){
		String str = new String();
		for(int i=0; i<5; i++){
			for(int j=0; j<5; j++){
				str += taken[i][j] + " ";
			}
			str +="\n";
		}
		return str;
	}
	
	/*
	 * getCardVal method
	 * @returns String object of bingoCard Array
	 */
	public String getCardVal() {
		String str = new String();
		for(int i=0; i<5; i++){
			for(int j=0; j<5; j++){
				str += bingoCard[i][j] + " ";
			}
			str +="\n";
		}
		return str;
		
	}
	
	/*
	 * toString method
	 * returns getCardVal and getBoolArray as a string
	 */
	public String toString() {
		String str = new String();
		str += this.getCardVal() + "\n";
		str += this.getBoolArray();
		return str;
	}
}
