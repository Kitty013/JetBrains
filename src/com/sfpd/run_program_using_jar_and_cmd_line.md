# How to run a program using a jar-file and the command-line?

## STEP 1:
Create your project structure using the command-line:
> mkdir D:\projects\trainingDeveloper\myFirstProgram\src\be\kitty

## STEP 2:
Move your program to the correct folder
> move D:\projects\trainingDeveloper\myFirstProgram\HelloWorld.java D:\projects\trainingDeveloper\myFirstProgram\src\be\kitty

## STEP 3:
Open HelloWorld.java in Notepad and add package structure on top of the class
> package be.kitty

## STEP 4:
Create a txt file in notepad and save it with name Manifest.txt into D:\projects\trainingDeveloper\myFirstProgram
Add to the file and make sure your line ended with an enter:
> Main-Class: be.kitty.HelloWorld

## STEP 5:
Navigate to the base directory D:\projects\trainingDeveloper\myFirstProgram and compile the java file:
> javac -d classes src\be\kitty\HelloWorld.java

## STEP 6:
Verify the created directory tree:
> tree /f /a

## STEP 7:
Navigate to D:\projects\trainingDeveloper\myFirstProgram and create the jar-file 
> jar -c -f HelloWorld.jar -m Manifest.txt -C classes/ .

## STEP 8:
Run the program using the jar-file:
> java -jar HelloWorld.jar
