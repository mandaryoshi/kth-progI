import java.util.*;
import static java.lang.System.out;

public class OperationsWithNaturalNumbersGivenAsStrings {

	public static void main(String[] args) {

		out.println("OPERATIONS ON NATURAL NUMBERS " + "IN CHARACTER STRINGS");

		// enter two natural numbers
		Scanner in = new Scanner(System.in);
		out.println("two natural numbers :");
		String tal1 = in.next();
		String tal2 = in.next();
		out.println();
		in.close();

		// add the numbers and show the result
		String sum = add(tal1, tal2);
		show(tal1, tal2, sum, '+');

		// subtract the numbers and show the result
		String subtract = subtract(tal1, tal2);
		show(tal1, tal2, subtract, '-');
	}

	// The add method accepts two natural numbers represented as character strings and returns their sum as a character string .
	public static String add(String num1, String num2) {

		StringBuilder sum = new StringBuilder();
		int carry = 0;
		int totalsum = 0;
		int len1 = num1.length();
		int len2 = num2.length();
		
		for (int i = len1 - 1, j = len2 - 1; i >= 0; i--, j--) {
			int digit1 = 0;
			int digit2 = 0;
			digit1 = Character.getNumericValue(num1.charAt(i));
			
			if (j >= 0) {
				digit2 = Character.getNumericValue(num2.charAt(j));	
			}
			
			totalsum = digit1 + digit2;
			
			if (carry == 1) {
				totalsum += 1;
				carry = 0;
			}
			
			if (totalsum > 9) {
				carry = 1;
				totalsum -= 10;
			}
			
			sum.insert(0, totalsum);
		}
		
		if (carry == 1) {
			sum.insert(0, 1);
		}
		
		return sum.toString().replaceFirst("^0+(?!$)", "");
	}

	// The subtract method accepts two natural numbers represented as character strings and returns their difference as a character string .
	// The first number is not smaller than the second
	
	public static String subtract(String num1, String num2) {

		StringBuilder minus = new StringBuilder();
		int remainder = 0;
		int difference = 0;
		int len1 = num1.length();
		int len2 = num2.length();
		
		for (int i = len1 - 1, j = len2 - 1; i >= 0; i--, j--) {
			int digit1 = 0;
			int digit2 = 0;
			digit1 = Character.getNumericValue(num1.charAt(i));
			
			if (j >= 0) {
				digit2 = Character.getNumericValue(num2.charAt(j));	
			}
			
			difference = digit1 - digit2;
			
			if (remainder == 1) {
				difference -= 1;
				remainder = 0;
			}
			
			if (difference < 0) {
				remainder = 1;
				difference += 10;
			}
			
			minus.insert(0, difference);
		}
	
		return minus.toString().replaceFirst("^0+(?!$)", "");	
	}

	// The show method presents two natural numbers , an operator and the result string .
	public static void show(String num1, String num2, String result, char operator) {

		// set an appropriate length on numbers and result
		int len1 = num1.length();
		int len2 = num2.length();
		int len = result.length();
		int maxLen = Math.max(Math.max(len1, len2), len);
		num1 = setLen(num1, maxLen - len1);
		num2 = setLen(num2, maxLen - len2);
		result = setLen(result, maxLen - len);
		// show the expression
		out.println(" " + num1);
		out.println("" + operator + " " + num2);
		for (int i = 0; i < maxLen + 2; i++)
			out.print("-");
			out.println();
			out.println(" " + result + "\n");
	}

	// The setLen method prepends the supplied number of spaces at the beginning
	// of a string
	public static String setLen(String s, int nofSpaces) {
		StringBuilder sb = new StringBuilder(s);
		for (int i = 0; i < nofSpaces; i++)
			sb.insert(0, " ");
		return sb.toString();
	}
}