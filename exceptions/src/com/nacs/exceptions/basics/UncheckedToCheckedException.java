package com.nacs.exceptions.basics;

public class UncheckedToCheckedException {

	public static void main(String[] args) {
		try {
			ArrayIndexoutOfBound();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		// TODO Auto-generated method stub
//try {
//	nullPointerExceptionDemo();
//} catch (Exception e) {
//	// TODO Auto-generated catch block
//	e.printStackTrace();
//}
	}
//	public static void nullPointerExceptionDemo() throws Exception {
//		String name =null;
//		try {
//		System.out.println(name.length());
//		}
//		catch(NullPointerException e) {
//			throw new Exception("Checked Exception");
//		}
	
public static void ArrayIndexoutOfBound() throws Exception  {
	int[] array= {1,2,3};
	try {
	System.out.println(array[10]);
	}catch(ArrayIndexOutOfBoundsException e) {
		throw new Exception("Checked Exception");
}
}
}
