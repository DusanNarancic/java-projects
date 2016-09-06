package tasks.matrix;

import java.util.Scanner;

public class PrintElementsWithHigherIndexOfRowThenColumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("Insert number of rows in matrix: ");
		int rows = input.nextInt();
		System.out.println("Insert number of columns in matrix: ");
		int cols = input.nextInt();
		int[][] mat = new int[rows][cols];
		
		for(int i = 0; i < rows; i++)
		{
			for(int j = 0; j < cols; j++)
			{
				System.out.println("Insert elements in matrix: ");
				mat[i][j] = input.nextInt();
			}
		}
		
		for(int i = 0; i < rows; i++)
		{
			for(int j = 0; j < cols; j++)
			{
				if(i > j)
				{
					System.out.println(mat[i][j]);
				}
			}
		}
	}

}
