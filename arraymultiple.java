package com.Array;

import java.util.Scanner;

public class arraymultiple
{
	public static void main(String[] args) 
	{
		int row,col,total;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the row value");
		row=sc.nextInt();
		System.out.println("Enter the colum value:");
		col=sc.nextInt();
		int[][] tot=new int[row][col];
		for (int i = 1; i < row; i++) 
		{
		for (int j = 1; j <col;j++) 
		{
			
			tot[i][j]=i*j;
			System.out.println(tot[i][j]);
			
		}	
		System.out.println();
		}
		
	}

}
