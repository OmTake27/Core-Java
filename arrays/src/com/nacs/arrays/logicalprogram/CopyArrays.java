package com.nacs.arrays.logicalprogram;

public class CopyArrays {
	
 private CopyArrays() {
		
		// TODO Auto-generated constructor stub
	}

 public static void copyFirstHalf(int... array) {
	 int mid=((0+array.length-1)/2)+1;
//	 if(array.length%2==0) {
//		 mid=((0+array.length-1)/2)+1;
//		 
//	 }else {
//		 mid=(0+array.length-1)/2;
//		 
//	 }
	 int[] firstHalf= new int[mid];
	 for(int i=0;i<mid;i++) {
		 firstHalf[i]=array[i];
	 }
	 for(int i=0;i<firstHalf.length;i++) {
		 System.out.print(firstHalf[i]+ " ");
	 }
	 System.out.println();

 	 
 }
 public static void  copySecondHalf(int...  array) {
	 int mid=((0+array.length-1)/2)+1;
	 int size=array.length-mid;
	 int[] secondHalf = new int[size];
	 int j=0;
	 for(int i=mid;i<array.length;i++) {
		 secondHalf[j++]=array[i];
		 //j++
	 }
	 for(int i=0;i<secondHalf.length;i++) {
		 System.out.print(secondHalf[i]+ " ");
	 }
 }
}
