import java.util.*;
public class LeftBeehind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		int numSweet = in.nextInt();
		int numSour = in.nextInt();
		
		while(numSweet != 0 || numSour != 0)
		{
			if(numSour + numSweet == 13)
				System.out.println("Never speak again.");
			else if(numSour > numSweet)
				System.out.println("Left beehind.");
			else if(numSweet > numSour)
				System.out.println("To the convention.");
			else
				System.out.println("Undecided.");

				
			
			numSweet = in.nextInt();
			numSour = in.nextInt();
		}
	}
}
