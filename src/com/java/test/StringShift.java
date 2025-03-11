package com.java.test;

import java.util.Scanner;

public class StringShift {

	public static String ShiftInput(String input1, int input2) {
		
        int input1Len = input1.length();

        if (!input1.matches("[a-zA-Z]+") || input1Len == 0) {
            throw new IllegalArgumentException("Input 1 shoulbe be letters only.");
        }else if (input2 < 0) {
            throw new IllegalArgumentException("Input 2 should be a valid positive integer.");
        }

        input2 = input2 % input1Len;
        String shiftedStr = input1.substring(input1Len - input2);
        String remainingStr = input1.substring(0, input1Len - input2);
        
        return shiftedStr + remainingStr; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input 1: ");
        String input1 = scanner.nextLine();

        System.out.print("Input 2: ");
        String input2Str = scanner.nextLine();

        try {
        	int input2 = Integer.parseInt(input2Str);
            String result = ShiftInput(input1, input2);
            System.out.println("Output: " + result);
        }catch (NumberFormatException e) {
            System.out.println("Error: Input 2 should be a valid positive integer.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }

}
