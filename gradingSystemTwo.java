import java.util.Scanner;
import java.util.*;

public class GradingSystemTwo{
	public static void main(String[] args) {
		//declaring a boolean to check whether to continue accepting numbers or not
		boolean check = true;
		
		//declaring a variable to store grades
		float grade[];
		
		//declaring a counter
		int counter = 0;
		
		//declaring a temporary variable to hold inputs
		float temp;
		
		grade = new float[100];
		Scanner inputer = new Scanner(System.in);
		while(check) {
			System.out.println("Enter grade to continue or -1 to exit: ");
			
			//getting input
			temp = inputer.nextFloat();
			
			//check input
			if(temp == -1) {
				check = false;
				break;
			}
			else if(temp > 100 || temp < 0) {
				System.out.println("Invalid Input");
				continue;
			}
			
			//save input in array
			grade[counter] = temp;
			//print out grade
			switch ((int)grade[counter] / 10) {
				case 10:
					System.out.println("A");
					break;
				case 9:
					System.out.println("A");
					break;
				case 8:
					System.out.println("A");
					break;
				case 7:
					System.out.println("A");
					break;
				case 6:
					System.out.println("B");
					break;
				case 5:
					System.out.println("C");
					break;
				case 4:
					System.out.println("D");
					break;
				case 3:
					if(grade[counter] >= 39) {
						System.out.println("Condoned");
					}
					else {
						System.out.println("F");
					}
				default:
					break;
			}
			counter++;
		}
		
		//declare variable to store total value
		float sum = 0;
		
		//declare variable to store mean and standard deviation
		float standardDeviation = 0;
		float mean = 0;
		float sumSD = 0;
		float meanSD = 0;
		
		//declare array to store values derived from calculating standard deviation
		float gradeDeviations[];
		gradeDeviations = new float[counter];
		
		//calculate mean, standard deviation 
		for(int i = 0; i < counter; i++) {
			sum += grade[i];
		}
		mean = sum / counter;
		float temp1 = 0;
		for(int i = 0; i < counter; i++) {
			//temp1 = Math.abs(grade[i] - mean);
			temp1 = grade[i] - mean;
			temp1 = temp1 * temp1;
			gradeDeviations[i] = temp1;
			sumSD += temp1;
		}
		meanSD = sumSD / counter;
		standardDeviation = (float)(Math.sqrt(meanSD));
		
		//Finding the mode
		int temp2[];
		temp2 = new int[counter + 1];
		//counting the occurrence of each value
		for(int i = 0; i < counter; i++) {
			temp2[i] = 0;
			for(int j = 0; j < counter; j++) {
				if(grade[i] == grade[j]) {
					temp2[i]++;
				}
			}
		}
		float whichIthValue = 0;
		temp2[counter] = temp2[counter - 1];
		for(int i = 0; i < counter; i++) {
			if(temp2[i] < temp2[i + 1]) {
				whichIthValue = temp2[i + 1];
			}
			else if(temp2[i] > temp2[i + 1]){
				whichIthValue = temp2[i];
			}
		}
		
		//finding maximum and minimum
		float min = 100, max = 0;
		grade[counter] = grade[counter - 1];
		for(int i = 0; i < counter; i++) {
			for(int j = 0; j < counter; j++) {
				if(!(max >= grade[j])) {
					max = grade[j];
				}
				if(min >= grade[j]) {
					min = grade[j];
				}
			}
		}
		
		//print out the final values
		System.out.print("Mode: ");
		for(int i = 0; i < counter; i++) {
			if(whichIthValue <= 1) {
				System.out.print("There is no mode");
				break;
			}
			if(temp2[i] == whichIthValue) {
				System.out.print(grade[i] + " ");
				for(int j = 0; j < counter; j++) {
					if(grade[i] == grade[j]) {
						temp2[j] = 0;
					}
				}
			}
		}
		System.out.println();
		System.out.println("Standard Deviation is: " + standardDeviation);
		System.out.println("Mean grade is: " + mean);
		System.out.println("Minimum grade is: " + min);
		System.out.println("Maximum grade is: " + max);
	
		//Print out graph
		System.out.println("");
		System.out.println("");
		System.out.println("Graph of scores: ");
		System.out.println("");
		
		//Print out graph
		for(int i = 0; i < counter; i++) {
			for(int j = 1; j <= 100; j++) {
				if(j < grade[i]) {
					System.out.print(" ");
				}
				else if(j == grade[i]) {
					System.out.println("*");
				}
				else {
					break;
				}
			}
		}
	}
}