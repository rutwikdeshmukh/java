package day3;

public class sum_of_digits {

	public static void main(String[] args) {
		int a = 367; int b; int c; int d; int sumall; int e;
		b = a%10; //4
		c=a/10; //36
		d=c%10; //6
		e=c/10;
		sumall = b + d + e ;
		System.out.println("Sum of digits is " + sumall );

	}

}
