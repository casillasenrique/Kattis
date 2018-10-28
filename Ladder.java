import java.util.*;
public class Ladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int height = in.nextInt();
		double angle = Math.toRadians(in.nextDouble());
		
		System.out.println((int)(height/Math.sin(angle))+1);
	}

}
