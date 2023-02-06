# How to write, compile and run a program only using notepad, jdk and the cmd-line

## STEP 1:
Write the hello world program in Notepad ++ containing the following code:
```
    public class HelloWorld {
        public static void main(String[] args) {
            System.out.println("Hello, World");
        }
    }
```
Save it as a .java file in the directory: D:\projects\trainingDeveloper\myFirstProgram
Example: HelloWorld.java

## STEP 2: 
Open a command-window and direct the path to the directory where you saved the .java-file
>        cd..                    go to previous directory
>        dir                     view content of directory
>        cd directoryName        go to directory directoryName

## STEP 3: 
Now we need to compile our program so that the computer can execute it.
For this we need to use the javac command. This will create a file with the .class extension
that will be saved in the same directory.
>            javac HelloWorld.java

## STEP 4: 
Now we can run the program using the java command. The computer will execute the .class file
and the result will be displayed in the cmd-window.
>            java HelloWorld.class

