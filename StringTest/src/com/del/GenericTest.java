package com.del;

public class GenericTest {

	public GenericTest() {
		Integer[] intArr= {2,4,7,5,1};
		printArray(intArr);
		Double[] doubleArr = {3.4,6.7,2.1,7.8};
		printArray(doubleArr);
		
		}
	//Generic method
	private <E> void printArray(E[] arr)
	{
		for (E val:arr) {
			System.out.println(val+" ");
		}
	}

//	private void printArray(Integer[] intArr) {
//		 for (Integer val : intArr) {
//			 System.out.print(val);
//			
//		}
//			
//		}
//		
//	
//
//	private void printArray(Double[] doubleArr) {
//		for (Double val : doubleArr) {
//			System.out.print(val);
//			
//			
//		}
//		
//	}

	public static void main(String[] args) {
		new GenericTest();

	}

}
