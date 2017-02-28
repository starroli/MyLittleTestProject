package testproject;

import java.math.BigDecimal;

public class TestProject {
	
	public static void main(String[] args) {
		String alternativeName = "Max";
		BigDecimal youShouldNotDoThis = new BigDecimal(1.5d);
		if (args.length > 0) {
			System.out.println("Hello " + String.join(",", args) + "!");
			System.out.println("How are you?");
		} else {
			System.out.println("Hello World!");
		}
	}
}
