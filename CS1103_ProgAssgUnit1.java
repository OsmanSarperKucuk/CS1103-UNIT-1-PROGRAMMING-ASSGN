/**
 * @author OSK
 * 
 * CS1103
 *
 * Part 1 (Benchmarking Sorting Algorithms) of Lab 2
 *
 *
RESULTS ARE AS FOLLOWS:

1)

Runtime for the sorting of the first Array with 1000 size and using selectionSort() is: 
16 miliseconds

Runtime for the sorting of the second Array with 1000 size using Arrays.sort() is: 
16 miliseconds

2)

Runtime for the sorting of the first Array with 10000 size and using selectionSort() is: 
62 miliseconds

Runtime for the sorting of the second Array with 10000 size using Arrays.sort() is: 
62 miliseconds

3)

Runtime for the sorting of the first Array with 100000 size and using selectionSort() is: 
5420 miliseconds

Runtime for the sorting of the second Array with 100000 size using Arrays.sort() is: 
5420 miliseconds

NOTE: 
DIFFERENT RESULTS ARE POSSIBLE BECAUSE THE PROGRAM USES Math.random() FUNCTION TO GENERATE RANDOM ARRAY VALUES.

 */

import java.util.ArrayList;
import java.util.Arrays;

public class CS1103_ProgAssgUnit1 {
	
	/**
	 * Sorts an array by finding the max value and putting it to the end, 
	 * then repeats for the remaining items.
	 * 
	 * @param A
	 */
	
	static void selectionSort (int[] A) { 
		
		// Sort A into increasing order, using selection sort	
			
			for (int lastPlace = A.length-1; lastPlace > 0; lastPlace--) { 
				
				// Find the largest item among A[0], A[1], ..., 
				// A[lastPlace], and move it into position lastPlace 
				// by swapping it with the number that is currently 
				// in position lastPlace.
			
				int maxLoc = 0; // Location of largest item seen so far.
			
				for (int j = 1; j <= lastPlace; j++) { 
					
					if (A[j] > A[maxLoc]) { 
					
					// Since A[j] is bigger than the maximum we’ve seen 
					// so far, j is the new location of the maximum value 
					// we’ve seen so far. 
						
						maxLoc = j;
					}//end of if
				}//end of 2nfor
						
				int temp = A[maxLoc]; 
					
				// Swap largest item with A[lastPlace]. 
						
				A[maxLoc] = A[lastPlace]; 
				A[lastPlace] = temp;
								
			}//end of first for loop
		} //end of selection sort method/function

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Create two arrays of type int[]. 
		 * Both arrays should be the same size, 
		 * and the size should be given by a constant in the program 
		 * so that you can change it easily.
		 */
		
		int Length = 100000 ; // do 1000, 10.000, 100.000
		
		int integer_variable = Integer.MAX_VALUE ; //use any value you like
		
		int [] Array1 = new int[Length] ;
		
		int [] Array2 = new int[Length] ;
		
		/*
		 * Fill the arrays with random integers. 
		 * The arrays should have identical contents, 
		 * with the same random numbers in both arrays.
		 *  
		 * To generate random integers with a wide range of sizes, 
		 * you could use (int)(Integer.MAX_VALUE * Math.random()).
		 */
		
		for (int i = 0; i < Array1.length; i++) { 
			Array1[i]=(int)(integer_variable * Math.random()); 
			Array2[i] = Array1[i]; //arrays to have identical contents
		}
		
		//System.out.println("Fill Arrays w/ Random integers:"); //Scaffolding, see if it came out ok
		//System.out.println(Arrays.toString(Array1)); //Scaffolding, see if it came out ok
		//System.out.println(Arrays.toString(Array2)); //Scaffolding, see if it came out ok
		
		/*
		 * Sort the first array using either Selection Sort or Insertion Sort. 
		 * You should add the sorting method to your program; 
		 * you can copy it from Section 7.4 if you want. 
		 * 
		 * (It is a good idea to check that you got the sorting method correct by 
		 * using it to sort a short array and printing out the result.)
		 */

		//System.out.println(""); //leave blank for better visibility
		//System.out.println("Try Sort - the first Array using selectionSort:"); //Scaffolding, see if it came out ok
		//selectionSort (Array1);
		//System.out.println(Arrays.toString(Array1)); //Scaffolding, see if sorting came out ok
		
		/*
		 *
		 *Time how long it takes to sort the array and print out the time.
		 *Now, sort the second (identical) array using Arrays.sort(). 
		 *Again, time how long it takes, and print out the time.
		 *
		 */
		 
		 //System.out.println(Arrays.toString(Array1)); //Scaffolding, see if it came out ok
		 //System.out.println(Arrays.toString(Array2)); //Scaffolding, see if it came out ok
		
		 System.out.println("Sorting...");
		 
		
		 long startTime = System.currentTimeMillis();
		 selectionSort (Array1);
		 long runTime = System.currentTimeMillis() - startTime;
		 
		 long startTime2 = System.currentTimeMillis();
		 Arrays.sort(Array2);
		 long runTime2 = System.currentTimeMillis() - startTime2;
		 
		 System.out.println("Sorted:");
		 System.out.println(""); //leave blank for better visibility
		 System.out.println("Runtime for the sorting of the first Array with "+ Length + " size and using selectionSort() is: ");
		 System.out.println(runTime + " miliseconds");
		 
		 System.out.println(""); //leave blank for better visibility
		 System.out.println("Runtime for the sorting of the second Array with "+ Length + " size using Arrays.sort() is: ");
		 System.out.println(runTime + " miliseconds");
		 
		 
		 //System.out.println(Arrays.toString(Array1)); //Scaffolding, see if it came out ok
		 //System.out.println(Arrays.toString(Array2)); //Scaffolding, see if it came out ok
		 
		 /*
		 *You should run your program using array sizes of 1,000, 10,000, and 100,000. 
		 *Record the sort times. 
		 *Add a comment to the top of the program that reports the times. 
		 *(You might be interested in applying Arrays.sort() to a million-element array, 
		 *but don't try that with Selection Sort or Insertion Sort!)
		 *
		 *Note: The general method for getting the run time of a code segment is:
		 *long startTime = System.currentTimeMillis();
		 *doSomething();
		 *long runTime = System.currentTimeMillis() - startTime;
		 *This gives the run time in milliseconds. 
		 *If you want the time in seconds, you can use runTime/1000.0. 
		 * 
		 */

	}//end of main
} //end of class
