package jan1023;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Given an array of integers, 
		 * return a new array such that each element at index i of the new array is 
		 * the product of all the numbers in the original array except the one at i
		 */
		
		int[] arr = {3, 6, 1, 3, 9, 6, 4, 3};
		int[] result = new int[arr.length];
		int product = 1;
		for(int a: arr) {
			product *= a;
		}
		for(int i=0; i< result.length; i++) {
			result[i] = product / arr[i];
		}
		for(int r: result) {
			System.out.println(r);
		}
	}

}
