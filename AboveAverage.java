import java.util.ArrayList;
import java.util.Scanner;

public class AboveAverage {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cases = in.nextInt();
		for(int i = 0; i<cases; i++) {
			int numGrades = in.nextInt();
			ArrayList<Integer> grades = new ArrayList<Integer>();
			int sum = 0;
			for(int j = 0; j<numGrades; j++) {
				int g = in.nextInt();
				sum += g;
				grades.add(g);
			}
			
			double avg = (double)sum/numGrades;
			
			int count = 0;
			for(int j = 0; j<numGrades; j++)
				count += grades.get(j) > avg ? 1 : 0;
			
			System.out.printf("%.3f%%\n", (double)count/numGrades*100);
			
		}

	}

}
