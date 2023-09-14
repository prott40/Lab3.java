/*<Lab3.java
  * <Preston Rottinghaus / Section: 02B/ Day: Thursday/ Time: 3:30-5:20pm>
  *<This program is designed to collected grade scored in class and credit hours. 
  *<Multiply grade points by credit hours.
  *Add total points together and divide by total credit hours.
  *Resulting in cumulative GPA.> 
  */
import java.util.Random;
import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random r = new Random ();
		
		int guess;
		int ctrL = 0;
		int ctrH = 0;
		char cont = 'Y';
		String input;
		double avgGa = 0;
		double gmCtr= 0;
		double hiGus = 0;
		double lowGus = 0;
		double avgH = 0;
		double avgL = 0;
		
		
		
		
		
		
		while(cont == 'Y') {
			int num = r.nextInt(100) + 1;
			System.out.println(num);
			System.out.print("Guess a number from 1-100");
			guess = s.nextInt();
			do {
			
				while(guess<1 || guess>100) {
					System.out.println("Invalid input. 1-100 only");{
						System.out.print("Guess a number from 1-100");
						guess = s.nextInt();
					}
				}
		if(guess > num) {
			System.out.println("Your guess is too high");
			++ctrH;
			System.out.print("Guess a number from 1-100");
			guess = s.nextInt();
		}
		else if(guess < num) {
			System.out.println("Your guess is too low");
			++ctrL;
			System.out.print("Guess a number from 1-100");
			guess = s.nextInt();
					}
		else {
			
			}
			
	
		}
			while(guess != num); 
			System.out.println("Your guess was correct");
			System.out.println();
			System.out.println("Total number of guess "+ (1+ctrH+ctrL));
			System.out.println("Total guess that are too high " + ctrH);
			System.out.println("Total guess that are too low " + ctrL);
			System.out.print("Would you like to play again Y/N?");
			input = s.next().toUpperCase();
			cont = input.charAt(0);
			++gmCtr;
			hiGus = hiGus + ctrH;
			lowGus = lowGus + ctrL;
			ctrL = 0;
			ctrH = 0;
			
		}
		System.out.println("Game over");
		System.out.println("Total number of games " + gmCtr);
		avgGa = (gmCtr+hiGus+lowGus)/gmCtr;
		System.out.printf("Average number of guesses %.1f",avgGa );
		System.out.println();
		avgH = hiGus/gmCtr;
		avgL = lowGus/gmCtr;
		System.out.printf("Average of how many guesses too high %.1f" , avgH);
		System.out.println();
		System.out.printf("Average of how many guesses too high %.1f" ,avgL);
		System.out.println();
		
		
		s.close();
	}
}
		
	

