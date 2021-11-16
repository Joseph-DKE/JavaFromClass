/*
*Etse Joseph
*20698668
*9404119
*/

import java.util.Scanner;

public class testC{
	public static void main(String[] args) {
		//Declare array (matrix)
		float matrix[][];
		matrix = new float[3][3];
		float matrixAnswer[];
		matrixAnswer = new float[3];
		float matrixFind[];
		matrixFind = new float[3]; 
		
		//Get values of array (Coefficient matrix)
		System.out.println("Enter the values of the Coefficient matrix: ");
		Scanner inputter = new Scanner(System.in);
		matrix[0][0] = inputter.nextFloat();
		matrix[0][1] = inputter.nextFloat();
		matrix[0][2] = inputter.nextFloat();
		matrix[1][0] = inputter.nextFloat();
		matrix[1][1] = inputter.nextFloat();
		matrix[1][2] = inputter.nextFloat();
		matrix[2][0] = inputter.nextFloat();
		matrix[2][1] = inputter.nextFloat();
		matrix[2][2] = inputter.nextFloat();
		
		//Get values of array (Right Hand Side matrix)
		System.out.println("Enter the values of the Right Hand Side Matrix: ");
		matrixAnswer[0] = inputter.nextFloat();
		matrixAnswer[1] = inputter.nextFloat();
		matrixAnswer[2] = inputter.nextFloat();
		
		//Check if matrix is upper triangular, lower triangular, or not a triangular matrix
		boolean upperTriangularVerify = false;
		boolean lowerTriangularVerify = false;
		if(matrix[1][0] == 0 && matrix[2][0] == 0 && matrix[2][1] == 0){
			upperTriangularVerify = true;
		}
		if(matrix[0][1] == 0 && matrix[0][2] == 0 && matrix[1][2] == 0){
			lowerTriangularVerify = true;
		}
		
		//if the matrix is upper triangular, perform backward substitution
		if(upperTriangularVerify == true && lowerTriangularVerify == false){
			matrixFind[2] = matrixAnswer[2] / matrix[2][2];
			matrixFind[1] = (matrixAnswer[1] - (matrix[1][2] * matrixFind[2])) / matrix[1][1];
			matrixFind[0] =  (matrixAnswer[0] - (matrix[0][1] * matrixFind[1]) - (matrix[0][2] * matrixFind[2])) / matrix[0][0];
		}
		//if the matrix is lower triangular, perform forward substitution
		else if(lowerTriangularVerify == true && upperTriangularVerify == false){
			matrixFind[0] = matrixAnswer[0] / matrix[0][0];
			matrixFind[1] = (matrixAnswer[1] - (matrix[1][0] * matrixFind[0])) / matrix[1][1];
			matrixFind[2] =  (matrixAnswer[2] - (matrix[2][0] * matrixFind[0]) - (matrix[2][1] * matrixFind[1])) / matrix[2][2];
		}
		//else give an error output
		else{
			System.out.println("The matrix inputed is not a triangular matrix");
		}
		
		//Print out the Unknown Matrix.
		System.out.println("x1 = " + matrixFind[0]);
		System.out.println("x2 = " + matrixFind[1]);
		System.out.println("x3 = " + matrixFind[2]);
		System.out.println("(" + matrixFind[0] + ", " + matrixFind[1] + ", " + matrixFind[2] + ")");
	}
}