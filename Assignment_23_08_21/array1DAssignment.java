package Assignment_23_08_21;

import java.util.Arrays;

public class array1DAssignment {
	
	private int array[];
	InputScanner input;
	
	public array1DAssignment() {
		array = new int[10];
		input = new InputScanner();
	}
	
	public array1DAssignment(int size) {
		array = new int[size];
		input = new InputScanner();
	}
	
	
	void readData() { 
		System.out.println("Enter " + array.length + " elements:");
		for (int i=0; i<array.length ; i++) {
			array[i] = input.readData().nextInt();
		}
	}
	
	void displayHorizontal() {
		for (int i=0; i<array.length ; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
	void displayVertical() {
		System.out.println(" ");
		for (int i=0; i<array.length ; i++) {
			System.out.println(array[i]);
		}
	}
	
	void arraySort() {
		Arrays.sort(array);
	}
	
	void arraySearch() {
		arraySort();
		System.out.println("Enter key to search: ");
		int key = input.readData().nextInt();
		System.out.println(key + " found at index = " +Arrays.binarySearch(array,key));
		
	}
	
}
