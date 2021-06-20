package day3;

public class prime_check {

	public static void main(String[] args) {

		    int a = 33;
		    boolean flag = false;
		    for (int i = 2; i <= a / 2; ++i) {
		      if (a % i == 0) {
		        flag = true;
		        break;
		      }
		    }
		
		    if (!flag)
		      System.out.println(a + " is a prime number.");
		    else
		      System.out.println(a + " is not a prime number.");
	}

}
