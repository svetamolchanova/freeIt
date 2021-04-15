package by.molchanova.lesson9.exceptions;

import java.util.*;

public class ExceptionsExample {
	
	
	public static void main(String[] args) throws ArrayIndexException {
		int[] myIntArray = new int[5];

		//try {
			for (int i = 0; i <= myIntArray.length; i++) {
			    int a = myIntArray[5];

//				if (i == 5) {
//					throw new ArrayIndexException(new Date().getTime(), "Array border assisgned");
//				}
//				int a = myIntArray[i];
//				System.out.println(a);
			}
//		} catch (RuntimeException ex) {
//			System.out.println("Runtime Exception appeared");
//			throw new ArrayIndexException(new Date().getTime(), "Array border assisgned");
//		}
//		finally {
//			System.out.println("From finally block");
//		}
	}
}
