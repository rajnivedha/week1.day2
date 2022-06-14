package week1.day2;

public class MyCalculator {
public int add (int a, int b) {
	int sum = a+b;
	return sum;
}
public double sub (double c, double d) {
	double diff = c-d;
	return diff;
	}
public double product(double e, double f) {
	double product = e*f;
		return product;
}
public int division(int g, int h) {
	int rem = g/h;
	return rem;	
}
public static void main(String[] args) {
	MyCalculator obj = new MyCalculator();
	int sum = obj.add(2,5);
	double diff = obj.sub(2.0, 3.5);
	double product = obj.product(4.2, 3.8);
	int rem = obj.division(7,6);
	System.out.println(sum);
	System.out.println(diff);
	System.out.println(product);
	System.out.println(rem);
}
}
