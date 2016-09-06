package tasks.matrix;

import java.util.Scanner;

public class LoadAndPrintElementsOnMainDiagonalMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insert number of rows in matrix: ");
		int row = input.nextInt();
		System.out.println("Insert number of columns in matrix: ");
		int col = input.nextInt();
		int[][] mat = new int[row][col];
		
		for(int i = 0; i < row; i++)
		{
			for(int j = 0; j < col; j++)
			{
				System.out.println("Insert elements in matrix: ");
				mat[i][j] = input.nextInt();
			}
		}
		
		for(int i = 0; i < row; i++)
		{
			for(int j = 0; j < col; j++)
			{
				if(i==j)
				{
					System.out.println(mat[i][j]);
				}
			}
		}
		
		input.close();
		
	}

}
