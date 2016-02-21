package proj1sp16;

/**
 * <p>Title: The BingoBall Class</p>
 *
 * <p>Use this class to create a new BingoBall object</p>
 *
 * @author Nicholas Tromboukis
 */

public class BingoBall {

	private int bingoNum;
	private char bingoChar;
	
	/*
	 * param constructor 
	 * 
	 * @param num is used to define the letter associated with each BingoBall
	 */
	public BingoBall(int num)
	{
		bingoNum = num;
		if(num<=15)
		{
			bingoChar = 'B';
		}
		else if(num>15 && num <= 30) 
		{
			bingoChar = 'I';
		}
		else if(num > 30 && num <= 45)
		{
			bingoChar = 'N';
		}
		else if(num > 45 && num <= 60) 
		{
			bingoChar = 'G';
		}
		else if(num > 60 && num <= 75)
		{
			bingoChar = 'O';
		}
		else
		{
			System.out.println("Number out of bounds " + num); // for debugging purposed
		}
	}
	
	/*
	 * getValue method
	 */
	public int getValue(){
		return bingoNum;
	}
	
	/*
	 * getChar method
	 */
	public char getChar(){
		return bingoChar;
	}
	
	/*
	 * The toString method 
	 * @return a String containing bingo ball's number and letter
	 */
	public String toString()
	{
		String str = bingoChar+Integer.toString(bingoNum);
		return str;
	}
}
