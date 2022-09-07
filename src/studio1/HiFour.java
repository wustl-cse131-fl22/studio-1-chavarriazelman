package studio1;

import java.util.Scanner;

/**
 * From Sedgewick and Wayne, COS 126 course at Princeton
 * 
 */
public class HiFour {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print(" Who is the person you want to say hi to?");
		String s0 = in.nextLine();
		System.out.print("Who else?");
		String s1 = in.nextLine();
		System.out.print("Anyone else");
		String s2 = in.nextLine();
		System.out.print("Anyone else?");
		String s3 = in.nextLine();
		
		System.out.print("Hello: " + s0 + ", " + s1 + ", " + s2 + ", and " + s3);
		//
		// Say hello to the names in s0 through s3.
		//

	}
}
