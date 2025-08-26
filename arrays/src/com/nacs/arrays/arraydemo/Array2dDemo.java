package com.nacs.arrays.arraydemo;

public class Array2dDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array2d = new int[2][2];
//		array2d[0][0]=1;
//		array2d[1][1]=0;
		int[][] array2d1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] array2d2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] result=new int[3][3];
		for(int i=0;i<result.length;i++) {
			for(int j=0;j<result[i].length;j++) {
				result[i][j]=array2d1[i][j]+array2d2[i][j];
			}
		}
		for(int rows[]:result) {
			for(int col:rows) {
				System.out.print(col+" ");
				
			}
			System.out.println();
		}
//System.out.println(array2d1[2][1]);
//		for (int i = 0; i < array2d1.length; i++) {
//			for (int j = 0; j < array2d1[i].length; j++) {
//				System.out.print(array2d1[i][j] + " ");
//			}
//			System.out.println();}

		for (int[] row : array2d1) {
			for (int col : row) {
				System.out.print(col+" ");
			}
			System.out.println();
		}

	}
}
