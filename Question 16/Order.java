package chapter7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Order {

	public static void main(String[] args) {
		String s1 = getInput("Enter number of Be Prepared books you are ordering: ");
		String s2 = getInput("Enter number of Next Best books you are ordering: ");
		int bp = Integer.parseInt(s1);
		int nb = Integer.parseInt(s2);
		
		OrderCalc calculator = new OrderCalc();
		System.out.println(calculator.getOrderTotal(bp, nb));
	}



private static String getInput(String prompt) {
	BufferedReader stdin = new BufferedReader(
			new InputStreamReader(System.in));

	System.out.print(prompt);
	System.out.flush();
	
	try {
		return stdin.readLine();
	} catch (Exception e) {
		return "Error: " + e.getMessage();
	}
}
}