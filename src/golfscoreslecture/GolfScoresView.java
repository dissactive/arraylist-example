package golfscoreslecture;

import java.util.Scanner;

public class GolfScoresView {

	GolfScores golfScores;
	
	public GolfScoresView(GolfScores golfScores) {
		this.golfScores = golfScores;
		printHeadLine();
	}
	
	private void printHeadLine() {
		System.out.println("This program reads golf scores and shows");
		System.out.println("how much each differs from the average.");
	}

	public void fill() {
		System.out.println("Enter golf scores:");
		System.out.println("Enter a list of nonegative numbers.");
		System.out.println("Mark the end of the list with a negative number.");
		Scanner keyboard = new Scanner(System.in);

		double next;
		next = keyboard.nextDouble();
		while (next >= 0) {
			golfScores.add(next);
			next = keyboard.nextDouble();
		}
		
		keyboard.close();
	}
	
	public void showDifference() {
		double average = golfScores.computeAverage();
		System.out.println("Average of the " + golfScores.size()
						   + " scores = " + average);
		System.out.println("The scores are:");
		for (Double element : golfScores.getList())
			System.out.println(element + " differs from average by "
											 + (element - average));
	}
}
