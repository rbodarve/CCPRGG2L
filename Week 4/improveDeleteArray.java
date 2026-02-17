import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class improveDeleteArray {
    public static void main(String[] args) {
		try(Scanner userInput = new Scanner(System.in)) {
			int elementInput; //Variable Declaration for elementInput
			
			ArrayList <Integer> myList = new ArrayList<>();
			
			/**
			 * Add numbers 15, 30, 25, 19, 30, 40 to the ArrayList
			 * */
			myList.add(15);
			myList.add(30);
			myList.add(25);
			myList.add(19);
			myList.add(30);
			myList.add(40);
			
			while (true) {
				try {
					System.out.println("Current List: " + myList);
					
					System.out.print("Enter an element to delete: ");
					elementInput = userInput.nextInt();
					
					//Checks if the element input by the user contains that certain element
					if(myList.contains(elementInput)) {
						
						/**
						 * To remove all occurrences of the element
						 * For example: Have the same value in the list. Both of them will be deleted
						 * */
						while(myList.remove(Integer.valueOf(elementInput))) {
							System.out.println("Updated List: ");
							
							//Iterates through the list of number
							for(int elementNumber : myList) {
								System.out.print(elementNumber + " ");
							}
							System.out.println(); //Gives a space to the updated list
						}
					} else {
						System.out.println("Error! No Element found");
					}
					
					//If the array is empty it will print Array is Empty
					if(myList.isEmpty()) {
						System.out.println("Array is Empty");
						break;
					}
				} catch(InputMismatchException error) {
					System.out.println("Invalid Input: Please a valid number input.");
					userInput.nextLine();
				}
			}
			System.out.println("Program Ends..."); 
		} catch(Exception e) {
			System.out.println("Error: An unexpected error occurred");
		}
	}
}
