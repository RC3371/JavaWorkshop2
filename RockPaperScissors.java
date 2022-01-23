import java.util.Scanner;
public class RockPaperScissors {
	public static void main(String[] args) {
		Scanner myKeyboard = new Scanner(System.in);
		int rounds = 1;
		int wins = 0;
		int losses = 0;
		while(rounds <= 3) {
			double CPUChoice = Math.random() * 10;
			int cpu = (int) CPUChoice;
			if(cpu == 9) {
				while(cpu == 9) {
					CPUChoice = Math.random() * 10;
					cpu = (int) CPUChoice;
				}
			}
			switch(cpu) {
				case 1:
					cpu = 0;
					break;
				case 2:
					cpu = 0;
					break;
				case 3: 
					cpu = 1;
					break; 
				case 4:
					cpu = 1;
					break;
				case 5: 
					cpu = 1;
				case 6:
					cpu = 2;
					break;
				case 7:
					cpu = 2;
					break;
				case 8:
					cpu = 2;
					break;
				default:
					break;
			}
			System.out.println("Enter 0 to play rock, 1 to play paper, or 2 to play scissors");
			int guess = myKeyboard.nextInt();
			
			if((guess == 0 && cpu == 2) || (guess == 1 && cpu == 0) || (guess == 2 && cpu == 1)) {
				wins++;
				System.out.println("You have won! You have " + wins + " wins and " + losses + " losses");
				rounds++;
			}
			else if(guess == cpu) {
				System.out.println("You have tied! You have " + wins + " wins and " + losses + " losses");
			}
			else {
				losses++;
				System.out.println("You have lost! You have " + wins + " wins and " + losses + " losses");
				rounds++;
			}
			
		}
		System.out.println("Your final record was " + wins + " wins and " + losses + " losses");
	}

}
