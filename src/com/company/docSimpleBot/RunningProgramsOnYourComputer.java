package com.company.docSimpleBot;

public class RunningProgramsOnYourComputer {
    /** INSTALLING JAVA ON YOUR COMPUTER
     *  Step 1: Download a JDK to develop Java applications. (Java 11)
     *  Step 2: To check that the installation has been completed, check the version
     *              java -version
     *  Step 3: Verify the installing instructions and try to set the path variable
     *          in your operating system.
     */
    /** WRITING A PROGRAM
     *  Step 1: Create a file named Main.java
     *  Step 2: insert following method main in the class
     */
    public static void main(String[] args) {
        System.out.println("Hello, Java");
    }
    /** COMPILING AND RUNNING A PROGRAM
     *  use the terminal installed in your OS and use following commands within
     *  the same folder that the .java file is created in:
     *  Step 3: Compile the program using the following command
     *              javac Main.java
     *          The javac command asks the compiler to translate the source code
     *          into bytecode. The result is the file named Main.class
     *  Step 4: Run the compiled program (make sure that your terminal is open in
     *          the same directory as your source file)
     *              java -cp . Main
     *          The java command starts a Java application. It does this by starting
     *          a JRE and invoking the main method inside the Main class.
     *          The -cp parameter (classpath) specifies the location of user-
     *          defined classes and packages. The dot . means the current terminal
     *          directory.
     */
}
