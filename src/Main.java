public class Main {

	public static void main(String[] args) {
		//Set numbers to an array that can hold 50 ints
		int[] numbers = /* TODO */
		
		//Fill array with random numbers
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = (int)(Math.random() * 75);
		}
		
		
		//Call the method to sort the list so that binary search can work
		/* TODO */
		
		//Display the list
		System.out.print("Sorted Numbers: [");
		for(int num : numbers) {
			System.out.print(num + " ");
		}
		System.out.println("]");
		
		//Call the binary search method to search the array for 10
		int index = /* TODO */
		System.out.println("Result of binary search for 10: " + index);
		

	}

	//Complete the Binary Search method below:
	//POST: returns the index where the element was found
	//      or -1 if not found
	public static int binarySearch(int[] arr, int toFind) {
		//Set left to the left-most array index
		int left = /* TODO */;
		//Set right to the right-most array index
		int right = /* TODO */;
		
		//Loop while the left is less than or equal to the right
		//In other words, we are done when left and right cross
		while(/* TODO */) {
			//Set middle to the middle index
			int middle = /* TODO */;
			
			//Is the middle element what we are looking for?
			if(/* TODO */ == toFind) {
				//Found!, return the location
				/* TODO */
			}
			else if(toFind > arr[middle]) {
				//What we are looking for is in the right half
				left = /* TODO */;
			}
			else if(toFind < arr[middle]) {
				//What we are looking for is in the left half
				right = /* TODO */;
			}
		}
		//We made it through the loop without returning,
		//so the item isn't found
		return -1;
	}

	//Insertion Sort
	public static void insertionSort(int[] arr) {
		//We assume the first element is sorted, so we
		//begin at the second element and go to the end
		for(int index = 1; index < arr.length; index++) {
			//Select the element as the key
			//The item to be inserted at the end
			int toInsert = arr[index];
			//Set position to the last sorted item
			int sortedIndex = index - 1; 
			//Keep shifting the elements until we find the correct insertion
			//spot or hit the front of the list
			while(sortedIndex >= 0 && arr[sortedIndex] > toInsert) {
				arr[sortedIndex + 1] = arr[sortedIndex];
				sortedIndex--;
			}
			//Insert the element
			arr[sortedIndex + 1] = toInsert;		
		}
	}	
}

