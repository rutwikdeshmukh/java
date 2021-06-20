package day3;

public class amstrong_check {

	public static void main(String[] args) {
		int a = 370; int b; int c; int d; int sumall; int e;
		b = a%10; //4
		c=a/10; //36
		d=c%10; //6
		e=c/10;
		sumall = b*b*b + d*d*d + e*e*e ;
		
		if(a == sumall)
			System.out.println( sumall + " is an Amstrong Number");
		else
			System.out.println(sumall + " is not an Amstrong Number" );
			
	}

}
