package com.nacs.exceptions.basics;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TryWithResources {
	public static void main(String[] args) throws FileNotFoundException, IOException {
//		try {
//			int number=10/0;
//			//System.exit(0);
//			
//		}catch (ArithmeticException e) {
//			String name=null;
//			name.length();
//			}
//		finally {
//			System.out.println("this is finally Block");
//			
//		}
		try(Scanner scanner = new Scanner(System.in);
				FileReader reader = new FileReader("ABC");){
			
		}
	}

}
