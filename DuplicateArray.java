package week1.day2;

import java.util.Arrays;

public class DuplicateArray {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,6,4,2,7,9,3,2,6};
		int a;
		int b;
		int flag = 0;
		Arrays.sort(arr);
		int length = arr.length;
		for (int i = 0;i <= length-2; i++) {
			a=arr[i];
			b=arr[i+1];
			if (a==b) {
				System.out.println("Repeated Number = "+a);
				flag = flag+1;
							}
		}
	System.out.println("Total Number of repeated = "+flag);
	}

}
