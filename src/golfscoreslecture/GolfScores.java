package golfscoreslecture;

import java.util.ArrayList;

public class GolfScores {
	
	ArrayList<Double> scoreList;
	GolfScoresView golfScoresView;
	
	public GolfScores() {
		scoreList = new ArrayList<Double>();
		golfScoresView = new GolfScoresView(this);
	}
	
	public void start() {
		golfScoresView.fill();
		golfScoresView.showDifference();
	}
	
	public void add(Double score) {
		scoreList.add(score);
	}
	
	public int size() {
		return scoreList.size();
	}
	
	private ArrayList<Double> copy() {
		ArrayList<Double> copyList = new ArrayList<Double>();
		for (Double element : scoreList)
			copyList.add(element);
		return copyList;
	}
	
	public double computeAverage() {
		double total = 0;
		for (Double element : scoreList)
			total = total + element;
		
		int numberOfScores = scoreList.size();
		if (numberOfScores > 0) {
			return (total / numberOfScores);
		}
		else {
			System.out.println("ERROR: Trying to average 0 numbers.");
			System.out.println("computeAverage returns 0.");
			return 0;
		}
	}
	
	public ArrayList<Double> getList() {
		return copy();
	}
}
