package tasks.matrix;

import java.util.Scanner;

public class LoadAndPrintMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Insert number of rows in matrix: ");
		int row = input.nextInt();
		System.out.println("Insert number of columns in matrix: ");
		int col = input.nextInt();
		int[][] matrix = new int[row][col];
		
		for(int i = 0; i < row; i++)
		{
			for(int j = 0; j < col; j++)
			{
				System.out.println("X[" + i + "," + j + "]" + "=");
				matrix[i][j] = input.nextInt();
			}
		}
		
		for(int i = 0; i < row; i++)
		{
			for(int j = 0; j < col; j++)
			{
				System.out.println(matrix[i][j]);
			}
		}
	}

}
