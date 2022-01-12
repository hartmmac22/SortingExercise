public class SorthingAlgorithms {
  
  //fork and make your own version
  private int[] arr = int[10];
  //this bubbleSort version sorts any number of any length given by the user  
  public void bubbleSort() {
		  Scanner keyboard = new Scanner(System.in);
		  int temp = 0;
		  int counter = 0;
		  System.out.print("Please enter a number: ");
		  String numberString = keyboard.nextLine();
		  int b = numberString.length();
		  int[] arr = new int[b];
		  for (int z = 0; z < b; z++) {
			  Integer numberInt = Integer.valueOf(numberString.substring(z, z+1));
			  arr[z] = numberInt;
		  }//closes for loop controlling the insertion of numbers into array
		  for (int y = 0; y < arr.length ; y++) {
			  for (int x = 0; x < arr.length - 1; x++) {
				  if (arr[x] > arr[x + 1]) {
					  temp = arr[x + 1];
					  arr[x + 1] = arr[x];
					  arr[x] = temp;
				  }//closes if statment that swaps numbers if x is greater than x+1 
			  }
			  for(int i = 0; i < arr.length; i++) {
				  System.out.print(arr[i]);
			  }// closes for loop that prints array
			System.out.print("\n");
		  }// closes for loop that controls
	  }//closes bubbleSort()
    /*
    //this is the orginal version of my bubbleSort that only converts the numbers I put directly put into the array
public class BubbleSort {
	public static void main (String[] args) {
		int temp = 0;
		int counter = 0;
		int[] arr = {7, 2, 8, 1, 9, 5, 6};
		for (int y = 0; y < arr.length-1; y++) {
			for (int x = 0; x < arr.length-1; x++) {
				if (arr[x] > arr[x + 1]) {
					temp = arr[x + 1];
					arr[x + 1] = arr[x];
					arr[x] = temp;
				}
			}
			for(int i = 0; i < arr.length - 1; i++) {
				System.out.print(arr[i]);
			}
			System.out.print("\n");
		}
	}
}

//----------------------------
* import java.util.Scanner;
//this version of bubbleSort takes user input of any 7 digit number and sorts it
public class BubbleSort {
	public static void main (String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int temp = 0;
		int counter = 0;
		int[] arr = new int[7];
		System.out.print("Please enter a 7 digit number: ");
		String numberString = keyboard.nextLine();
		//int b = numberString.length;
		for (int z = 0; z < 7; z++) {
			Integer numberInt = Integer.valueOf(numberString.substring(z, z+1));
			arr[z] = numberInt;
			//System.out.print("\n");
		}
		for (int y = 0; y < arr.length ; y++) {
			for (int x = 0; x < arr.length - 1; x++) {
				if (arr[x] > arr[x + 1]) {
					temp = arr[x + 1];
					arr[x + 1] = arr[x];
					arr[x] = temp;
				}
			}
			for(int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]);
			}
			System.out.print("\n");
		}
	}
}
*/
  //insertion sort(I'm not sure it works because I couldnt compile the tester class to check)
  public void insertionSort() {
		int arr[] = {5,4,3,2,1};
		int element;
		int j;
		for(int i = 1; i < arr.length; i++) {
			element = arr[1];
			j = i - 1;
      while (j >= 0 && arr[j] > element) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}//closes while
			arr[j + 1] = element;
			for(int z = 0; z < arr.length - 1; z++) {
				System.out.print(arr[z]);
			}//closes printing array
			System.out.print("\n");
		}//closes forloop that loops through the numbers
		
	}// closes insertionSort()
	
  //selection sort
	public void selectionSort(){
		int arr[] = {5,4,3,2,1};
		int i;
		int j;
		int temp;
		int minIndex;
		for(i = 0; i < arr.length-1; i++) {
			minIndex = i;
			for(j = i + 1; j < arr.length; j++) {
				if(arr[j] < arr[minIndex]) {
					minIndex = j;
					temp = arr[i];
					arr[i] = arr[minIndex];
					arr[minIndex] = temp;
				}//closes if statemnt that does the switching
        for(int z = 0; z < arr.length - 1; z++) {
				  System.out.print(arr[z]);
			  }//closes for loop that prints array
			System.out.print("\n");
			}// closes foor loop that loops through the numbers
		}//closes for loop that lopps through the array until its sorted
	}//closes selectionSort()
}//closes SortingAlgorithms Class

