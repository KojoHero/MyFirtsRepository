package firstassignment;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class selftest_00 {
	
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int N = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		if (N > 1 && N < 100) {
			if (N % 2 != 0) {

				System.out.println("Weird");
			}

			else if (N % 2 == 0) {

				if (N >= 2 && N <= 5) {
					System.out.println("Not Weird");
				}

				else if (N >= 6 && N <= 20) {
					System.out.println("Weird");
				} else if (N > 5) {
					System.out.println("Not Weird");
				}

				scanner.close();
			}
		}
	}
}

/*Given an integer, , perform the following conditional actions:

If  is odd, print Weird
If  is even and in the inclusive range of 2 to 5 , print Not Weird
If  is even and in the inclusive range of 6 to 20 , print Weird
If  is even and greater than 5, print Not Weird*/