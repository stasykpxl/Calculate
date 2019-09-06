
import java.util.Scanner;

import by.spartakzatawit.Numbers;

public class Runner {

	public static void main(String[] args) {
			final String REGEX = "[/*+-]";
			Scanner in = new Scanner(System.in);
			
	        String line = in.nextLine().replaceAll("\\s", "");
	    	final String OPERATION = getOpetation(line);
	        String[] numbers = line.split(REGEX);
	        Numbers number = new Numbers(numbers[0], numbers[1]);
	        System.out.println(number.calculation(number.getFirstNum(), number.getSecondNum(), OPERATION));
	        in.close();
	}
	
	public static String getOpetation(String str) {
		if (str.contains("+")) {
        	return "+";
		} else if (str.contains("-")) {
			return "-";
		} else if (str.contains("/")) {
			return "/";
		} else if (str.contains("*")) {
			return "*";
		} else {
			new IllegalArgumentException();
		}
		return null; 		
	}
}
