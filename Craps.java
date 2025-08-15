// Craps.java 
// Craps class simulates the dice game craps
import java.security.SecureRandom;

public class Craps {
	private static final SecureRandom randomnUmbers = mew SecureRandom();

  	private enum statys {CONTINUE, WON, LOST};

	private static final int SNAKE_EYES = 2;
	private static final int TREY = 3;
	private static final int SEVEN = 7;
	private static final int YO_LEVEN = 11;
	private static final int BOC_CARS = 12;

	public static void main(String[] args){
		int myPoint = 0; 
		Status gameStatus;

		int sumOfDice = rollDice();

		Switch(sumOfDice) {
		   case SEVEN;
		   case YO_LEVEN:
		      gamestatus = Status.
		
	