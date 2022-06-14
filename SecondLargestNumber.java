package week1.day2;

import java.util.Arrays;

public class SecondLargestNumber {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,0,100,1000};
		Arrays.sort(arr);
		int length = arr.length;
		System.out.println("The Second largest number is "+arr[length-2] );
	}

}
