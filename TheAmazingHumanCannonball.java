import java.util.*;
public class TheAmazingHumanCannonball {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int cases = in.nextInt();
		for(int i = 0; i<cases; i++)
		{
			double v0 = in.nextDouble();
			double theta = Math.toRadians(in.nextDouble());
			double x1 = in.nextDouble();
			double h1 = in.nextDouble();
			double h2 = in.nextDouble();
			
			double y = (x1/Math.cos(theta)) * Math.sin(theta) - (0.5)*(9.81)*Math.pow(x1/(v0*Math.cos(theta)), 2);    
			System.out.println((y >= h1+1 && y <= h2-1) ? "Safe" : "Not Safe");
		}
	}

}
