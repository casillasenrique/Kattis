import java.util.*;
public class ABC {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		HashMap<String,Integer> abc = new HashMap<String,Integer>();
		int[] list = {in.nextInt(), in.nextInt(), in.nextInt()};
		Arrays.sort(list);
		
		abc.put("A", list[0]);
		abc.put("B", list[1]);
		abc.put("C", list[2]);
		
		String order = in.next();
		
		System.out.println(abc.get(String.valueOf(order.charAt(0))) + " " + abc.get(String.valueOf(order.charAt(1))) + " " + abc.get(String.valueOf(order.charAt(2))));
	}

}
