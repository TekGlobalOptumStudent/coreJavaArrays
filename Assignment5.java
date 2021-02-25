package coreJavaArrays;

import java.util.Arrays;

public class Assignment5 {

	public static void main(String[] args) {
		printArray();
		printMiddle();
		cloneArray();
		testArrayOutOfBounds();
		loopThroughArray();
		loopThroughArrayTimesTwo();
		printArrayExceptMiddle();
		swapFirstAndLast();
		sortLeastToGreatest();
		printStrangeArray();
	}

	/**
	 * Write a program that creates an array of integers with a 
	 * length of 3. Assign the values 1, 2, and 3 to the indexes. 
	 * Print out each array element.
	 */
	private static void printArray() {
		System.out.println("printArray: ");
		int[] arr = new int[3];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	/**
	 * Write a program that returns the middle element in an array. 
	 * Give the following values to the integer array: 
	 * {13, 5, 7, 68, 2} and produce the following output: 7
	 */
	private static void printMiddle() {
		System.out.println("printMiddle: ");
		int[] arr = {13, 5, 7, 68, 2};
		System.out.println("arr is " + Arrays.toString(arr));
		System.out.println(arr[2]);
	}
	
	/**
	 * Write a program that creates an array of String type and 
	 * initializes it with the strings “red”, “green”, “blue” and 
	 * “yellow”. Print out the array length. Make a copy using the 
	 * clone( ) method. Use the Arrays.toString( ) method on the 
	 * new array to verify that the original array was copied.
	 */
	private static void cloneArray() {
		System.out.println("cloneArray: ");
		String[] arr = new String[]{"red", "green", "blue", "yellow"};
		System.out.println("arr.length: " + arr.length);
		String[] copy = arr.clone();
		System.out.println("copy: " + Arrays.toString(copy));
	}
	
	/**
	 * Write a program that creates an integer array with 5 elements 
	 * (i.e., numbers). The numbers can be any integers.  Print out 
	 * the value at the first index and the last index using 
	 * length - 1 as the index. Now try printing the value at 
	 * index = length ( e.g., myArray[myArray.length ] ).  Notice the 
	 * type of exception which is produced. Now try to assign a value 
	 * to the array index 5. You should get the same type of exception.
	 */
	private static void testArrayOutOfBounds() {
		System.out.println("testArrayOutOfBounds: ");
		int[] arr = new int[5];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		System.out.println("arr is " + Arrays.toString(arr));
		System.out.println("arr index 0: " + arr[0]);
		System.out.println("arr index arr.length - 1: " + arr[arr.length - 1]);
		System.out.println("arr index 5:");
		try {
			System.out.println(arr[arr.length]);
		} catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("assign to arr index 5:");
		try {
			arr[arr.length] = 5;
		} catch(Exception e) {
			System.out.println(e);
		}
	}
	
	/**
	 * Write a program where you create an integer array with a length 
	 * of 5. Loop through the array and assign the value of the loop 
	 * control variable (e.g., i) to the corresponding index in the array.
	 */
	private static void loopThroughArray() {
		System.out.println("loopThroughArray:");
		int[] arr = new int[5];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i;
			System.out.println("arr[" + i + "]" + " = " + arr[i]);
		}
	}
	
	/**
	 * Write a program where you create an integer array of 5 numbers. Loop 
	 * through the array and assign the value of the loop control variable 
	 * multiplied by 2 to the corresponding index in the array.
	 */
	private static void loopThroughArrayTimesTwo() {
		System.out.println("loopThroughArrayTimesTwo:");
		int[] arr = new int[5];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i * 2;
			System.out.println("arr[" + i + "]" + " = " + arr[i]);
		}
	}
	
	/**
	 * Write a program where you create an array of 5 elements. Loop through 
	 * the array and print the value of each element, except for the middle 
	 * (index 2) element.
	 */
	private static void printArrayExceptMiddle() {
		System.out.println("printArrayExceptMiddle:");
		int[] arr = new int[5];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = ((int) (Math.random() * 5)) + 1;
			if(i != 2) {
				System.out.println("arr[" + i + "]" + " = " + arr[i]);
			}
		}
	}
	
	/**
	 * Write a program that creates a String array of 5 elements and swaps 
	 * the first element with the middle element without creating a new array.
	 */
	private static void swapFirstAndLast() {
		System.out.println("swapFirstAndLast:");
		int[] arr = new int[5];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		System.out.println("Before swap:");
		System.out.println("arr[" + 0 + "]" + " = " + arr[0]);
		System.out.println("arr[" + (arr.length - 1) + "]" + " = " + arr[arr.length - 1]);
		int temp = arr[0];
		arr[0] = arr[arr.length - 1];
		arr[arr.length - 1] = temp;
		System.out.println("After swap:");
		System.out.println("arr[" + 0 + "]" + " = " + arr[0]);
		System.out.println("arr[" + (arr.length - 1) + "]" + " = " + arr[arr.length - 1]);
	}
	
	/**
	 * Write a program to sort the following int array in ascending order: 
	 * {4, 2, 9, 13, 1, 0}. Print the array in ascending order, print the 
	 * smallest and the largest element of the array. The output will look like 
	 * the following:
	 * Array in ascending order: 0, 1, 2, 4, 9, 13
	 * The smallest number is 0
	 * The biggest number is 13
	 */
	private static void sortLeastToGreatest() {
		System.out.println("sortLeastToGreatest: ");
		int[] arr = {4, 2, 9, 13, 1, 0};
		Arrays.sort(arr);
		System.out.print("Array in ascending order: ");
		for(int i = 0; i < arr.length - 1; i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.println(arr[arr.length - 1]);
		System.out.println("The smallest number is " + arr[0]);
		System.out.println("The biggest number is " + arr[arr.length - 1]);
	}
	
	/**
	 * Create an array that includes an integer, 3 strings, and 1 double. Print 
	 * the array.
	 */
	private static void printStrangeArray() {
		System.out.println("printStrangeArray: ");
		Object[] arr = new Object[5];
		arr[0] = new Integer(42);
		arr[1] = "string 1";
		arr[2] = "string 2";
		arr[3] = "string 3";
		arr[4] = new Double(42.42);
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].toString());
		}
	}
}
