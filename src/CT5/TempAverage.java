package CT5;
import java.util.Scanner;
public class TempAverage {
public static void main(String[] args) {
	Scanner myObj = new Scanner(System.in);
	int dayNumber = 7;
	int x =0;
	int weekSum = 0;
	int weeklyAverage;
	int [] averageTemp = {80, 78, 75, 77, 79, 76, 69};
	String [] dayName = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};
	System.out.println("Enter a day of the week or enter 'week' for weekly average.");
	String userInput = myObj.nextLine().toUpperCase();
	for (x=0; x < dayNumber; x++) {
		if (userInput.equals(dayName[x])) {
		
			System.out.println(dayName[x] + ": "+ averageTemp[x]);
		}
		if (userInput.equals("WEEK")) {
			for (x = 0; x < dayNumber; x++) {
				System.out.println(dayName[x] + ": " + averageTemp[x]);
				weekSum += averageTemp[x];
			}
			weeklyAverage = weekSum/dayNumber;
			System.out.println("Average: " + weeklyAverage);
		}
	}
}
}
	