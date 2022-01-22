import java.util.Scanner;
public class LeapYearCalendar {

	public static void main(String[] args) {
		Scanner myKeyboard = new Scanner(System.in);
		System.out.println("Enter your Birth Year");
		int birthYear = myKeyboard.nextInt();
		for(int i = 1948; i <= 2064; i++) {
			System.out.print(i);
			if(i % 4 == 0 && i == birthYear) {
				System.out.print(" - Leap and My Birth Year");
			}
			else if(i % 4 == 0) {
				System.out.print(" - Leap Year");
			}
			else if(i == birthYear) {
				System.out.print(" - My Birth Year");
			}
			System.out.println();
		}

	}

}
