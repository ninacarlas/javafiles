# Java Files

## Coding Exercise AMA

# Overview 

This Java Program accepts two inputs from the user:

1. **Input 1**: A string that accepts only letters
2. **Input 2**: A positive integer that determines how many position the character will be shifted or wrapped around.

This program processes the inputs to shift the characters of a string based on the input ('Input 2') and 
returns the resulting string after the shift.

# Requirements

1. Java 8 or later is required to run this pogram.
2. A terminal or command line interface to run the program.

# How to run

1. Clone or download the repository containing the source code.
2. Open the terminal or command line interface and navigate to the directory where the Java file (AMACoding.java) is saved.
3. Compile the Java file by compiling below command
 - javac com/java/test/AMACoding.java
4. Run the program
 - java com.java.test.ShiftString
5. Enter inputs required
 - For input 1, enter a string consisting of letters (e.g., "abcdef" or "helloworld")
 - For input 2, enter a positive integer or number representing the positions to shift the characters (e.g., 3)
6. Output: The program will output the transformed string after applying the shift. For example:

	Input 1: abcdef
	Input 2: 3
	Output: defabc

	
# Error Handling

1. If Input 1 contains non alphabethical characters, the program will throw an error and prompt the user to provide a valid string of letters only.
2. If Input 2 contains non positive or is invalid, the program will prompt the user to enter a valid positive integer.

# Code Explanation

1. Main Method 
	Accepts input for both input 1 and input 2. 
	It handles input validation if user enters a string instead of a positive integer. 
	It calls ShiftInput method to generate the result. 
	It displays the result or error if any.
2. ShiftInput Method 
	Takes two arguments (a string input 1, and an integer input 2)
	Ensures that input 1 consists of only letters and the input 2 is a positive integer
	Performs the shift operation by splitting the string and rearranging the position of characters.

# Additional notes
If the input 2 exceeds the length of input 1, it wraps the shifted position back to the front. For example:
	Input 1: abcdef
	Input 2: 10
	Output:  efabcd

# Troubleshooting
1. Ensure that the inputs are valid
2. If you encounter any issue running or compiling the program, make sure the Java is correctly installed or configured on your machine.



