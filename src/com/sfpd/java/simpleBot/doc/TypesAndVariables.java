package com.sfpd.java.simpleBot.doc;

public class TypesAndVariables {
	public static void main(String[] args) {

		/** General form of a declaration :
		 * 		DataType variableName = initialization;
		 */
		String language = "Java";
		int numberOfApples = 5;

		/** Declare a variable and then print it.
		 */
		String dayOfWeek = "Monday";
		System.out.println(dayOfWeek); // Monday

		/** Assign one variable to another.
		 */
		int one = 1;
		int num = one;
		System.out.println(num); // 1
		System.out.println();

		/** Declare a variable named dayOfTheWeek and print its value before
		 *  and after changing:
		 */
		String dayOfTheWeek = "Monday";
		System.out.println(dayOfTheWeek);
		
		dayOfTheWeek = "Tuesday";
		System.out.println(dayOfTheWeek);
		System.out.println();

		/** Declaring serveral variables of the same type as a single statement
		 */
		String codeLanguage = "Java", version = "8 or newer";

		/** Separating declaration and initialization into statements:
		 */
		int age; // declaration
		age = 35; // initialization

		/** Since Java 10 Type inference: you can write var instead of a specific type to force
		 *  automatic type inference based on the type of assigned value:
		 *  	var variableName = initialization;
		 *  
		 *  Example:
		 *  	var languageToCode = "Java"; // String
		 *  	var version = 10; // int	
		 */
		
		
	}
}
