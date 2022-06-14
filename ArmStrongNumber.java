package week1.day2;

public class ArmStrongNumber {
	public static void main(String[] args) {
		int inp = 153;
		int num = inp;
		int arm = 0;
		while (num>0) {
			int rem = num%10;
			arm = arm + (rem*rem*rem);
			num = num/10;
		}
		if (inp==arm) {
			System.out.println(inp+" Is an Armstrong Number");
		}
		else {
			System.out.println(inp+" Is not an Armstrong Number");
		}
	}

}
