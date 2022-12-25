package com.sfpd.java.simpleBot.doc;

	/** Simplest way to obtain data from the standard input is to use the
	 *  standard class Scanner. To use this class you should add the
	 *  import statement to the top of your file with the source code.
 	*/

import org.junit.Test;

public class ScanningTheInput {

	@Test
	public void testNextMethod() {
		/** add this following construction after the import.
		 *  System.in reads text that you type in the standard input.
		 */
		//Scanner scanner = new Scanner(System.in);
		//System.out.println("Please enter your name: ");
		/** With next() method, you can read the data if your input is an
		 *  integer number or a single word. Test with input = James and
		 *  input = 123.
		 */
		//String name = scanner.next();
		String name = "KittyK";
		System.out.println("Hello, " + name + " !");
	}

	@Test
	public void testNextLineMethod() {
		/** If the user prints a compound name like "Cedric Hilaire",
		 *  the program only outputs the first name "Cedric". If we
		 *  want to read the whole line, we use the nextLine() method.
		 */
		//Scanner scanner = new Scanner(System.in);
		//System.out.println("Please enter your name: ");
		//String firstNames = scanner.nextLine();
		String firstNames = "Cedric Hilaire";
		System.out.println("Hello, " + firstNames + " !");
	}

	@Test
	public void testMultilineInputWithNextMethod() {
		/** Reading multiline input with example:
		 * "This is a simple multiline input, that is being read"
		 *  Input = "This is a simple
		 *  		 multiline input,
		 *  		 that is being read"
		 */
		//Scanner scanner = new Scanner(System.in);
		//System.out.println("Enter input: ");

		// next() method output
		//String outputNext = scanner.next();
		String outputNext = "This is a simple multiline input, that is being read";
		System.out.print(outputNext); // Will read the input till whitespace
	}

	@Test
	public void	testMultiLineInputWithNextLineMethod() {
		String outputNextLine = "This is a simple multiline input, that is being read";

		// nextLine() method output
		System.out.println(outputNextLine); // will read the input till end of first line
	}

}
