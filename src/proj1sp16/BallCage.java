package proj1sp16;
import java.util.Random;

/**
 * <p>Title: BallCage class</p>
 * 
 * <p>Used to create a new BallCage object which holds BingoBall objects</p>
 * @author Nicholas Tromboukis
 *
 */

public class BallCage {
	
	private int numBalls;
	private BingoBall[] ballsInCage = new BingoBall[75];
	
	/* 
	 * default constructor creates an array of 75 BingoBall objects
	 */
	public BallCage()
	{
		numBalls = 0;
		for(int i=0; i<75; i++)
		{
			BingoBall ball = new BingoBall(i+1);
			ballsInCage[i] = ball;
			numBalls++;
		}
	}
	
	
	/* ReturnBall method 
	 * 
	 * @return a random BingoBall object from the cage,
	 * and decreases the number of balls in the cage by one.
	 */
	public BingoBall returnBall()
	{
		BingoBall ballToReturn;
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(numBalls);
		ballToReturn = ballsInCage[randomInt];

		for(int i=randomInt; i<numBalls-1; i++)
		{
			ballsInCage[i] = ballsInCage[i+1];
		}
		ballsInCage[numBalls-1] = null;
		
		numBalls--;
		return ballToReturn;
	}
	
	
	/*
	 * ReturnNumBalls method
	 * @ return the number of bingo balls in the cage. 
	 */
	public int returnNumBalls()
	{
		return numBalls;
	}
	
	
	/*
	 * The toString method 
	 * @return a String containing all of the bingo balls in the cage
	 */
	public String toString()
	{
		String str = new String();
		for(int i=0; i<numBalls; i++)
		{
			str += ballsInCage[i].toString() + "\n";
		}
		return str;
	}
}
