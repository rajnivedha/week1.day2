package week1.day2;

import java.util.Arrays;

public class MissingElementsinArray {
	public static void main(String[] args) {
		int[] arr = {1,2,3,5,7,9};
		Arrays.sort(arr);
		for (int i = 1; i < arr.length; i++)
			if (arr[i-1]!=i) {
				System.out.println("Missing number is "+i);
				break;
			}
	}

}
