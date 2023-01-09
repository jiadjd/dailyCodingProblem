package day1;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
		 * For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17
		 */
		
		int k = 15;
		int[] result = new int[2];
		int[] list = {3,5,7,9,2,4,10};
		result = getNumbers(list, k);
		for(int r: result) {
			System.out.println(r);
		}
	}
	
	public static int[] getNumbers(int[] nums, int k) {
		int[] result = new int[2];
		for(int i=0; i<nums.length-1; i++) {
			for(int j=i+1; j<nums.length; j++) {
				if(nums[i] + nums[j] == k) {
					result[0] = nums[i];
					result[1] = nums[j];
					return result;
				}
			}
		}
		return result;
	}

}
